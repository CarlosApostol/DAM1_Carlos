package EstucturasBasicas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Telefonos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que contacto quieres saber? El de tony, el de alex o el de gabriel");
        String contactos = sc.nextLine();
        if (telefono().containsKey(contactos)){
            System.out.println("El numero de "+contactos+" es: " +telefono().get(contactos));
        }else {
            System.out.println("Este contacto no existe.");
        }
    }
    public static Map<String, String> telefono() {
        Map<String, String> agenda = new HashMap<String, String>();

        agenda.put("Tony", "421421421");
        agenda.put("Alex", "643643643");
        agenda.put("Gabriel", "976786576");
        return agenda;
    }
}