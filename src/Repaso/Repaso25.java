package Repaso;//CALCULADORA POLACA INVERSA

import java.util.Scanner;
public class Repaso25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op1;
        int op2;
        String signo;

        System.out.println("Dame el primer operando: ");
        op1 = scanner.nextInt();

        System.out.println("Dame el segundo operando: ");
        op2 = scanner.nextInt();

        System.out.println("Dame un signo aritmetico (+,-,*,/,^,%): ");
        signo = scanner.next();

        int suma = op1+op2;
        int resta = op1-op2;
        int multi = op1*op2;
        double div = op1/op2;
        int cosa = op1^op2;
        int resto = op1%op2;


        switch (signo) {
            case "+":
                System.out.println(op1+" + "+op2+" = "+suma);
                break;
            case "-":
                System.out.println(op1+" - "+op2+" = "+resta);
                break;
            case "*":
                System.out.println(op1+" * "+op2+" = "+multi);
                break;
            case "/":
                System.out.println(op1+" / "+op2+" = "+div);
                break;
            case "^":
                System.out.println(op1+" ^ "+op2+" = "+cosa);
                break;
            case "%":
                System.out.println(op1+" % "+op2+" = "+resto);
                break;


        }

    }
}

