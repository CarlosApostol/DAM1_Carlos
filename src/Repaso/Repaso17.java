package Repaso;//Crea una aplicación que nos pida un día de la semana y que nos diga si es un dia laboral o no. Usa un switch para ello

import java.util.Scanner;
public class Repaso17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dia;
        String resultado;


        System.out.println("Introduce tu dia: ");
        dia = scanner.nextLine();
        resultado = dia.toUpperCase().charAt(0) + dia.substring(1, dia.length()).toLowerCase();

        switch (resultado) {
            case "Lunes","Martes","Miercoles","Jueves","Viernes":
            System.out.println("Es un dia laboral.");
            break;
            case "Sabado","Domingo":
            System.out.println("No es un dia laboral.");
            break;
        }
    }
}
