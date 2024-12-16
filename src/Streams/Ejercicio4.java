package Streams;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int numero = 0;

        do {
            System.out.println("Dame un numero:");
            numero = sc.nextInt();
            numeros.add(numero);
        }while(numero >= 0);

        List count = numeros.stream()
                .filter(n -> n >= 1 && n <= 5).toList();
        System.out.println("Numeros entre 1 y 5: "+count);
    }
}
