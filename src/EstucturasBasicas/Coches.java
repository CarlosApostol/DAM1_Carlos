package EstucturasBasicas;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class Coches {
    public static void main(String[] args) {
        ArrayList<String> coches = new ArrayList<String>();
        String marca = "";
      IntroducirMarca(coches, marca);
    }
    public static ArrayList IntroducirMarca(ArrayList<String> coches, String marca) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduce marcas de coches:");
            marca = sc.nextLine();
            coches.add(marca);
            Collections.sort(coches);
        } while (marca != "");
        //Comando que me lista las marcas:
        for(String coche: coches){
            System.out.println(coche);
        }
        return coches;
    }
}
