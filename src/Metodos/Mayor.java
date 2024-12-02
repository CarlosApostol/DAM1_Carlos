//Realiza un programa que pida la edad al usuario y muestre un mensaje si es mayor de edad

package Metodos;
import java.util.Scanner;
public class Mayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad;

        System.out.println("Dame tu edad: ");
        edad = scanner.nextInt();
        CompruebaQueESMayorDeEdad(edad);
    }


        public static void CompruebaQueESMayorDeEdad ( int edad){
            if (edad >= 18) {
                System.out.println("Es mayor de edad");
            } else {
                System.out.println("No es mayor de edad");
            }
        }
    }
