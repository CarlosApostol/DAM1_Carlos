package RepasoArrayList;

import java.util.*;
public class AÑADE_ArrayList_3 {
    public static void main(String[] args) {
        ArrayList<String> colores = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        String color;
        colores.add("Rojo");
        colores.add("Blanco");
        colores.add("Amarillo");
        colores.add("Verde");
        colores.add("Negro");

        System.out.println("Dame un color");
        color = sc.nextLine();
        colores.add(0, color);

        //RECORRE LA LISTA
        for (String elemento : colores) {
            System.out.println(elemento);
        }
    }
}
