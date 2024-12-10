package EstucturasBasicas;
import java.util.HashMap;
import java.util.Map;

public class LaMejorTerminacion {
    public static void main(String[] args) {
        String[] boletos = {"00004", "03847", "39804"};
        Map<Integer, Integer> conteoTerminaciones = new HashMap<>();


        for (String boleto : boletos) {
            int terminacion = Character.getNumericValue(boleto.charAt(boleto.length() - 1));

            conteoTerminaciones.put(terminacion, conteoTerminaciones.getOrDefault(terminacion, 0) + 1);
        }
        System.out.println(conteoTerminaciones);
    }
}


