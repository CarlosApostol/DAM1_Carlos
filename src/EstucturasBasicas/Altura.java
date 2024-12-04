package EstucturasBasicas;

import java.util.ArrayList;
import java.util.Scanner;
public class Altura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> alturas = new ArrayList<Double>();
        int alumnos = numeroAlumnos(sc);
        leerAlturas(alturas, sc, alumnos);
        double media = calcularMedia(alturas, alumnos);
        int altsup = calcularAlumnosAlturaSuperior (media, alturas);
        int altinf = calcularAlumnosAlturaInferior (media, alturas);
        mostrarResultados(alumnos, media, altinf, altsup);
    }

    public static int numeroAlumnos(Scanner sc) {
        int alumnos;
            System.out.println("Dime el numero de alumnos:");
            alumnos = sc.nextInt();
        return alumnos;
    }

    public static ArrayList leerAlturas(ArrayList<Double> alturas, Scanner sc, int alumnos) {
        double altura;
        for (int i = 0; i < alumnos; i++) {
            System.out.println("Introduce las alturas:");
            altura = sc.nextDouble();
            alturas.add(altura);
        }
        return alturas;
    }
    public static double calcularMedia (ArrayList<Double> alturas, int alumnos) {
        double suma = 0;
        for(double altura: alturas){
            suma += altura;
        }
        double mediacalculada = suma/alumnos;
        return mediacalculada;
    }
    public static int calcularAlumnosAlturaSuperior (double media, ArrayList<Double> alturas) {
        int contadorsuperior = 0;
        for (double altura : alturas) {
            if (altura > media) {  // Comparamos cada altura individualmente con la media
                contadorsuperior++;  // Si la altura es mayor que la media, incrementamos el contador
            }
        }  return contadorsuperior;
    }
    public static int calcularAlumnosAlturaInferior (double media, ArrayList<Double> alturas) {
        int contadorinferior = 0;
        for (double altura : alturas) {
            if (altura < media) {  // Comparamos cada altura individualmente con la media
                contadorinferior++;  // Si la altura es mayor que la media, incrementamos el contador
            }
        }  return contadorinferior;
    }
    public static String mostrarResultados(int alumnos, double media, int altsup, int altinf) {
        String resultado = "Aqui el resultado: ";
                System.out.println("Numero de alumnos: " + alumnos);
                System.out.println("Altura media: " + media);
                System.out.println("Numero de alumnos con altura superior a la media: " + altsup);
                System.out.println("Numero de alumnos con altura inferior a la media: " + altinf);
        return resultado;
    }
}
