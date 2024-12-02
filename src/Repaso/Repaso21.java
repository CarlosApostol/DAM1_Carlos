package Repaso;//Muestra los números primos entre 1 y 100.

public class Repaso21 {
    public static void main(String[] args) {
        int operacion;
        int acum;
        int i = 0;

        for (i = 1; i <= 100; i++) {
            acum = i;
            operacion = acum % i;
            if (operacion == 0 && acum != 1 && acum != i) {
                System.out.println(acum+" No es primo.");
            } else {
                System.out.println(acum+" Es primo.");
            }
        }
    }
}
