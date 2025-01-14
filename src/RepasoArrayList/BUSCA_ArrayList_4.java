package RepasoArrayList;

import java.util.*;
public class BUSCA_ArrayList_4 {
    public static void main(String[] args) {
            ArrayList<String> colores = new ArrayList<String>();
            Scanner sc = new Scanner(System.in);
            colores.add("Rojo");
            colores.add("Blanco");
            colores.add("Amarillo");
            colores.add("Verde");
            colores.add("Negro");


            System.out.println("Dame un numero del 0 al 4");
            int numero = sc.nextInt();

            System.out.println(colores.get(numero));
    }
}
