package POO.POO_Maquina;
import java.util.*;

public class MaquinaExpendedora {
    private double precioTique;
    private double cajon;

    public MaquinaExpendedora(double precioTique) {
        this.precioTique = precioTique;
        this.cajon = 0.0;
    }

    public double getPrecioTique() {
        return precioTique;
    }

    public void setPrecioTique(double precioTique) {
        this.precioTique = precioTique;
    }

    public double getCajon() {
        return cajon;
    }

    public void setCajon(double cajon) {
        this.cajon = cajon;
    }

    public String sacarTique(double dineroInsertado) {
        if (dineroInsertado < precioTique) {
            return "Introduce el importe exacto.";
        }

        double cambio = dineroInsertado - precioTique;
        cajon += precioTique;

        StringBuilder devolucion = new StringBuilder("Devolución: ");
        double[] monedas = {2.0, 1.0, 0.5, 0.2, 0.1};

        for (double moneda : monedas) {
            while (cambio >= moneda) {
                devolucion.append(moneda).append("€ ");
                cambio -= moneda;
                cambio = Math.round(cambio * 100.0) / 100.0;
            }
        }

        return "Tique: " + precioTique + "€\n" + devolucion.toString();
    }
}

