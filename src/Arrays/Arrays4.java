package Arrays;//Calcula la media de un array de 10 posiciones

import java.util.Scanner;
public class Arrays4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int [] anArray;
        anArray = new int [10];
        int i;
        int suma = 0;
        double media = 0;

        for (i = 0; i < 10; i++) {
            System.out.println("Dame el numero "+(i+1));
            anArray[i] = scanner.nextInt();
        }

        suma = anArray[0]+anArray[1]+anArray[2]+anArray[3]+anArray[4]+anArray[5]+anArray[6]+anArray[7]+anArray[8]+anArray[9];
        media = suma/10;

        System.out.println("Media: "+media);

    }
}
