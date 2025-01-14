//DA/BUSCA UN ELEMENTO CONCRETO DE LA LISTA
package RepasoArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class CONCRETO_ArrayList_7 {
    public static void main(String[] args) {
        ArrayList<String> colores = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Verde");
        colores.add("Amarillo");

        System.out.println("Dame un numero del 0 al 3");
        int num = sc.nextInt();

        System.out.println(colores.get(num));
    }
}
