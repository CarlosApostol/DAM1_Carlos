//Escribid un programa Java para encontrar los valores duplicados de un array de valores enteros.
//Escribid un programa Java para encontrar los valores duplicados de un array de valores enteros.
package Arrays2;
public class Duplicados {
    public static void main(String[] args) {
        int[] Array;
        Array = new int[10];
        utilidades.Utilidades.rellenaArray(Array, 1, 100);
        System.out.print(operacion(Array));
    }
    public static String operacion(int[] Array) {
        String cad = "";
        for (int i = 0; i < Array.length; i++) {
            for (int j = i+1; j < Array.length; j++) {
                if (Array[i] == Array[j]) {
                    cad = cad + Array[i];
                }
            }
        }
        return cad;
    }
}



