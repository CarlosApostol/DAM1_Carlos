package InterfacesComparables;

import java.util.Scanner;
import java.util.ArrayList;

class Niño {
    private int b;
    private int p;

    public Niño(int b, int p) {
        this.b = b;
        this.p = p;
    }

    public int getBueno() {
        return b;
    }

    public int getPeso() {
        return p;
    }
}
public class NiñosBuenos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número de niños:");
        int niños = sc.nextInt();

        if (niños == 0) {
            System.out.println("No hay niños.");
            return;
        }
        if (niños>100000) {
            System.out.println("DEMASIADOS NIÑOS AAAAAAH.");
            return;
        }

        ArrayList<Niño> niñosbuenos = new ArrayList<>();
        int sumaB = 0, sumaP = 0;

        for (int i = 0; i < niños; i++) {
            System.out.println("Introduce que tan bueno ha sido el niño:");
            int b = sc.nextInt();
            System.out.println("Introduce el peso de su regalo:");
            int p = sc.nextInt();

            if (b > 100 || p > 100) {
                System.out.println("No pueden ser mas de 100 animal.");
                i--;
            }

            niñosbuenos.add(new Niño(b, p));
            sumaB += b;
            sumaP += p;
        }
        //IMPORTANTE AQUI SE UTILIZA COMPARABLE PARA ORDENAR LA LISTA!!!!!!
        niñosbuenos.sort((n1, n2) -> {
            if (n1.getBueno() != n2.getBueno()) {
                return Integer.compare(n2.getBueno(), n1.getBueno()); //Ordenar por b de mayor a menor.
            } else {
                return Integer.compare(n1.getPeso(), n2.getPeso()); //Si empatan ordenas de menor a mayor p.
            }
        });


        System.out.println("Lista de niños ordenada por regalo:");
        for (Niño niño : niñosbuenos) {
            System.out.println("Bueno: " + niño.getBueno() + ", Peso: " + niño.getPeso());
        }

        System.out.println();

    }
}

