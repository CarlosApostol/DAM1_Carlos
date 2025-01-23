package POO;
import java.util.Scanner;

class Cuenta {
    private String titular;
    private double cantidad;
    private double cantidadingresar;
    private double cantidadretirar;

    public Cuenta(String titular, double cantidad, double cantidadingresar, double cantidadretirar) {
        this.titular = titular;
        this.cantidad = cantidad;
        this.cantidadingresar = cantidadingresar;
        this.cantidadretirar = cantidadretirar;
    }
    public String getTitular() {
        return this.titular;
    }

    public double getCantidadingresar() {
        return this.cantidadingresar;
    }

    public double getCantidadretirar() {
        return this.cantidadretirar;
    }

    public double getCantidad() {
        return this.cantidad;
    }

    public void ingresar(){
        if (this.cantidadingresar >= 0)
            this.cantidad = this.cantidad+this.cantidadingresar;
    }

    public void retirar() {
        double cantidadfija = this.cantidad;
        if (this.cantidadretirar >= 0) {
            this.cantidad = this.cantidad - this.cantidadretirar;
        if (this.cantidad < 0) {
            this.cantidadretirar = cantidadfija;
            this.cantidad = 0;
        }
        }
    }

    @Override
    public String toString() {
            return "Titular de la cuenta: "+ this.titular + "\n\t" + " Cantidad Restante en tu cuenta: " + this.cantidad + "\n\t" + " Cantidad Ingresada: "+ this.cantidadingresar + " Cantidad Retirada: " +this.cantidadretirar;
        }


}
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ingresar;
        double retirar;
        System.out.println("Inserta la cantidad que quieres ingresar en tu cuenta: ");
        ingresar = sc.nextDouble();
        System.out.println("Inserta la cantidad que quieres retirar en tu cuenta: ");
        retirar = sc.nextDouble();
        Cuenta carlos = new Cuenta("Carlos Apostol", 50, ingresar, retirar);
        System.out.println("Bienvenido, "+carlos.getTitular()+"\n\t"+"Cantidad en tu cuenta: "+carlos.getCantidad()
                            + "\n\t" + "----------------------------");
        carlos.ingresar();
        carlos.retirar();
        System.out.println(carlos);
    }
}
