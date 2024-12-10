package EstucturasBasicas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class RepartiendoRegalos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> portales = new ArrayList<Integer>();
        int aterriza = 0;
        leerPortales(portales, sc, aterriza);
    }
    public static ArrayList leerPortales(ArrayList<Integer> portales, Scanner sc, int aterriza) {
        int cantidad;
        int portal;
        System.out.println("¿Cuantos portales hay?");
        cantidad = sc.nextInt();
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Introduce los portales que Diddy Noel visitara:");
           portal = sc.nextInt();
           if (aterriza == 0) {
               aterriza = portal;
           }
            portales.add(portal);
        }
        int finalAterriza = aterriza;
        Collections.sort(portales, (a, b) -> {
            int distanciaA = Math.abs(a - finalAterriza); // Distancia de 'a' al portal de aterrizaje
            int distanciaB = Math.abs(b - finalAterriza); // Distancia de 'b' al portal de aterrizaje

            // Si las distancias son iguales, ordena de manera ascendente
            if (distanciaA == distanciaB) {
                return Integer.compare(a, b);  // Ordena ascendentemente
            }
            return Integer.compare(distanciaA, distanciaB);  // Ordena por cercanía
        });
        System.out.println(portales);
        return portales;
    }
}
