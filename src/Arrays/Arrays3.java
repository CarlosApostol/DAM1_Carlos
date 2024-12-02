package Arrays;//Realiza un programa que lea un DNI sin letra y calcula la misma (usad un array para almacenar las letras)

import java.util.Scanner;
public class Arrays3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int dni;
        String [] anArray;
        anArray = new String[23];
        int resto;

        System.out.println("Dame tu DNI sin letra: ");
        dni = scanner.nextInt();

        resto = dni%23;

        anArray[0] = "T";
        anArray[1] = "R";
        anArray[2] = "W";
        anArray[3] = "A";
        anArray[4] = "G";
        anArray[5] = "M";
        anArray[6] = "Y";
        anArray[7] = "F";
        anArray[8] = "P";
        anArray[9] = "D";
        anArray[10] = "X";
        anArray[11] = "B";
        anArray[12] = "N";
        anArray[13] = "J";
        anArray[14] = "Z";
        anArray[15] = "S";
        anArray[16] = "Q";
        anArray[17] = "V";
        anArray[18] = "H";
        anArray[19] = "L";
        anArray[20] = "C";
        anArray[21] = "K";
        anArray[22] = "E";

            System.out.println("Tu DNI es: "+dni+anArray[resto]);
        }

    }


