package EstucturasBasicas;

import java.util.HashMap;
import java.util.Map;
public class Frequency {

    public static String calcularFrecuencia(String[] palabras) {
        Map<String, Integer> mapa = new HashMap<>();

        for (String palabra : palabras) {
            if (mapa.containsKey(palabra)) {
                //Si la palabra ya está en el mapa, incrementar el contador
                mapa.put(palabra, mapa.get(palabra) + 1);
            } else {
                //Si la palabra no está, iniciarlo con 1
                mapa.put(palabra, 1);
            }
        }

        //Convertir el mapa a una cadena para devolverlo
        StringBuilder resultado = new StringBuilder();
        for (Map.Entry<String, Integer> entrada : mapa.entrySet()) {
            resultado.append(entrada.getKey()).append(" - ").append(entrada.getValue()).append("\n");
        }
        return resultado.toString();
    }

    public static void main(String[] args) {
        System.out.println(calcularFrecuencia(new String[]{"uno", "dos"}));
        System.out.println(calcularFrecuencia(new String[]{"uno", "dos", "tres", "dos", "tres", "tres"}));
    }
}

