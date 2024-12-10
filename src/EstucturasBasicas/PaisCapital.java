package EstucturasBasicas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class PaisCapital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> mapa1 = new HashMap<String, String>();
        mapa1.put("españa", "spain");
        mapa1.put("francia", "france");
        mapa1.put("alemania", "germany");
        mapa1.put("italia", "italy");

        System.out.println("Listado completo de paises");
        for (String clave : mapa1.keySet())
            System.out.print(clave + "-");
        System.out.println();

        System.out.println("¿Que pais quieres?");
        String pais = sc.nextLine();

        switch (pais) {
            case "españa", "spain":
                System.out.println("Capital: Madrid");
                break;
            case "francia", "france":
                System.out.println("Capital: Paris");
                break;
            case "alemania", "germany":
                System.out.println("Capital: Berlin");
                break;
            case "italia", "italy":
                System.out.println("Capital: Roma");
                break;
        }
    }
}

