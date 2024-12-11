package EstucturasBasicas;

import java.io.*;
import java.util.*;
public class Anagramas {
    public static void main(String[] args) throws IOException {
        int minGroupSize = 10;
        String resultado = EncuentraAnagrama(minGroupSize);

        System.out.println(resultado);
    }

    public static String EncuentraAnagrama(int minGroupSize) throws IOException {
        StringBuilder sb = new StringBuilder();

        //Mapa para almacenar las palabras ordenadas y sus anagramas
        Map<String, List<String>> anagramMap = new HashMap<>();

        BufferedReader leer = null;
        try {
            leer = new BufferedReader(new FileReader("/home/carapo2/IdeaProjects/java/src/EstucturasBasicas/anagramasXD.txt"));
            String palabra;

            //Lee cada palabra del archivo
            while ((palabra = leer.readLine()) != null) {
                String PalabraOrd = Alfabet(palabra);

                //Recupera la lista de anagramas o crea una nueva si no existe
                List<String> anagramList = anagramMap.get(PalabraOrd);
                if (anagramList == null) {
                    anagramList = new ArrayList<>();
                    anagramMap.put(PalabraOrd, anagramList);
                }

                anagramList.add(palabra);
            }
        } catch (IOException e) {
            e.printStackTrace(); //Mostrara el error en caso de fallo al leer el archivo y terminara el programa si hay un error
            System.exit(1);
        } finally {
            if (leer != null) {
                leer.close();
            }
        }

        //Esto ecorre el mapa y añade a la salida aquellos grupos que cumplen el tamaño mínimo (importante) -->
        for (List<String> anagramList : anagramMap.values()) {
            if (anagramList.size() >= minGroupSize) {
                sb.append(anagramList.size()).append(": ").append(anagramList).append("\n");
            }
        }

        return sb.toString();
    }

    //Metodo que orcdena alfabeticamente
    private static String Alfabet(String word) {
        char[] charArray = word.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}

