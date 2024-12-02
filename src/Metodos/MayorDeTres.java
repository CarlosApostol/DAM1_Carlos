//La función a crear recibe tres enteros como parámetros y muestra un mensaje informando del valor del mayor de los tres.

package Metodos;
import java.util.Scanner;
public class MayorDeTres {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int val1;
        int val2;
        int val3;
        int mayor = 0;

        System.out.println("Dame el numero 1: ");
        val1 = scanner.nextInt();

        System.out.println("Dame el numero 2: ");
        val2 = scanner.nextInt();

        System.out.println("Dame el numero 3: ");
        val3 = scanner.nextInt();

        ElMayorDeLosTres(val1, val2, val3, mayor);
    }

    public static void ElMayorDeLosTres (int val1,int val2,int val3, int mayor){
        if (val1 > val2 && val1 > val3) {
            mayor = val1;
        }
        if (val2 > val1 && val2 > val3) {
            mayor = val2;
        }
        if (val3 > val2 && val3 > val1) {
            mayor = val3;
        }
        System.out.println("El mayor es: "+mayor);
        }
    }

