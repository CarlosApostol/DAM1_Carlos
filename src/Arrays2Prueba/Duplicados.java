//Escribid un programa Java para encontrar los valores duplicados de un array de valores enteros.
package Arrays2Prueba;
public class Duplicados {
    public static void main(String[] args) {
        int[] Array;
        Array = new int[10];
        utilidades.Utilidades.rellenaArray(Array, 1, 20);
        System.out.print("Numeros repetidos: "+operacion(Array));
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
