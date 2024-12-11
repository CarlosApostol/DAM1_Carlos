package EstucturasBasicas;

import java.io.*;
import java.util.*;
public class Anagramas {
    public static void main(String[] args) throws IOException {
        // Número mínimo de palabras para imprimir (ejemplo: 10)
        int minGroupSize = 10;

        // Llamada al método que busca anagramas
        String result = findAnagrams(minGroupSize);

        // Imprime los grupos de anagramas que cumplen el tamaño mínimo
        System.out.println(result);
    }

    public static String findAnagrams(int minGroupSize) throws IOException {
        StringBuilder sb = new StringBuilder();

        // Mapa para almacenar las palabras ordenadas y sus anagramas
        Map<String, List<String>> anagramMap = new HashMap<>();

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("/home/carapo2/IdeaProjects/java/src/EstucturasBasicas/anagramasXD.txt"));
            String word;

            // Lee cada palabra del archivo
            while ((word = reader.readLine()) != null) {
                // Ordena las letras de la palabra
                String sortedWord = sortLetters(word);

                // Recupera la lista de anagramas o crea una nueva si no existe
                List<String> anagramList = anagramMap.get(sortedWord);
                if (anagramList == null) {
                    anagramList = new ArrayList<>();
                    anagramMap.put(sortedWord, anagramList);
                }

                // Añade la palabra a la lista de anagramas
                anagramList.add(word);
            }
        } catch (IOException e) {
            e.printStackTrace(); // Muestra el error en caso de fallo al leer el archivo
            System.exit(1); // Termina el programa si hay un error
        } finally {
            if (reader != null) {
                reader.close(); // Cierra el archivo
            }
        }

        // Recorre el mapa y añade a la salida aquellos grupos que cumplen el tamaño mínimo
        for (List<String> anagramList : anagramMap.values()) {
            if (anagramList.size() >= minGroupSize) {
                sb.append(anagramList.size()).append(": ").append(anagramList).append("\n");
            }
        }

        return sb.toString();
    }

    // Método para ordenar las letras de una palabra alfabéticamente
    private static String sortLetters(String word) {
        char[] charArray = word.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}

