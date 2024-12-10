package EstucturasBasicas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Telefonos2 {
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
        ArrayList<String> telefonos = new ArrayList<>();
        telefonos.add("421421421");
        telefonos.add("+0034 440021");
        agenda.put("Tony", String.valueOf(telefonos));
        telefonos = new ArrayList<>();
        telefonos.add("643643643");
        telefonos.add("+0034 676869");
        agenda.put("Alex", String.valueOf(telefonos));
        telefonos = new ArrayList<>();
        telefonos.add("976786576");
        telefonos.add("+0034 999999");
        agenda.put("Gabriel", String.valueOf(telefonos));
        return agenda;
    }
}