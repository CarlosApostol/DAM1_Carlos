package InterfacesComparables;

import java.util.ArrayList;
import java.util.Scanner;

class Lote {
    private int invertido;
    private int premios;

    public Lote(int invertido, int premios) {
        this.invertido = invertido;
        this.premios = premios;
    }

    public int getInvertido() {
        return invertido;
    }

    public int getPremios() {
        return premios;
    }
}

public class Loteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número de localidades:");
        int localidades = sc.nextInt();

        if (localidades == 0) {
            System.out.println("No hay localidades.");
            return;
        }

        ArrayList<Lote> loteria = new ArrayList<>();
        int sumaInvertido = 0, sumaPremios = 0;

        for (int i = 0; i < localidades; i++) {
            System.out.println("Introduce el dinero invertido:");
            int invertido = sc.nextInt();
            System.out.println("Introduce los premios obtenidos:");
            int premios = sc.nextInt();

            if (invertido > 1000000 || premios > 1000000) {
                System.out.println("No pueden ser mas de 1M.");
                i--;
            }

            loteria.add(new Lote(invertido, premios));
            sumaInvertido += invertido;
            sumaPremios += premios;
        }


        if (sumaInvertido == sumaPremios) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
}


