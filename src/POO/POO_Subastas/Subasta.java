package POO.POO_Subastas;
import java.util.*;

public class Subasta {
    private String nombre;
    private HashMap<String, Double> lotes;
    private HashMap<String, Double> pujas;

    public Subasta(String nombre) {
        this.nombre = nombre;
        this.lotes = new HashMap<>();
        this.pujas = new HashMap<>();
    }

    public String nombre(String nombre) { return this.nombre;}

    public void addPuja(String pujador, double puja) {
        if (!pujador.isEmpty() && puja > 0) {
            pujas.put(pujador, puja);
        }
    }

    public String getPujador() {
        if (pujas.isEmpty()) {
            return "No hay puja para este lote, lote no adjudicado.";
        }
        String mejorPujador = "";
        double pujaMasAlta = 0;
        for (HashMap.Entry<String, Double> entrada : pujas.entrySet()) {
            String pujador = entrada.getKey();
            double puja = entrada.getValue();

            if (puja > pujaMasAlta) {
                mejorPujador = pujador;
                pujaMasAlta = puja;
            }
        }
        return mejorPujador+" cuya puja fue de: "+pujaMasAlta+"€";
    }
    public void addLote(String lote, double precio) {
        if (!lote.isEmpty() && precio > 0) {
            lotes.put(lote, precio);
        }
    }

    @Override
    public String toString() {
        return "La subasta: "+this.nombre+"\n\t"+"Cuyos lotes consistian en: "+this.lotes+"\n\t"+"Tuvieron los siguientes pujadores: "+this.pujas+"\n\t"+"El pujador mas alto al que le ha sido adjudicado el lote fue: "+getPujador();
    }
}



