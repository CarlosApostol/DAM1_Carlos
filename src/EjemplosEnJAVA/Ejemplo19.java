package EjemplosEnJAVA;//

import java.util.Scanner;
public class Ejemplo19 {
    public static void main(String[] args) {
        int prec;
        int hor;
        int sueldo;
        int extra;
        double extra2;
        double extrafinal;
        double salariorestado;
        double salarioimpuesto1;
        double salarioimpuestotal1;
        double salarioimpuestofinal;
        double salarioimpuestofinal1;
        double salariodefinitivo;
        double impuestosinextra;
        double salarioimpuestomax;
        double sueldoneto;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el precio por hora: ");
        prec = scanner.nextInt();

        System.out.println("Introduce las horas: ");
        hor = scanner.nextInt();

        scanner.close();

        sueldo = prec * hor;
        extra = hor - 35;
        extra2 = extra * (prec * 1.5);
        extrafinal = 35 * prec + extra2;
        //Los siguientes 400 euros tienen un impuesto del 25%
        salarioimpuesto1 = 400 * 0.25;
        salarioimpuestotal1 = extrafinal - salarioimpuesto1;
        salarioimpuestotal1 = extrafinal - salarioimpuesto1;
        impuestosinextra = sueldo - salarioimpuesto1;
        salarioimpuestofinal = extrafinal - salarioimpuestotal1;
        //Luego el resto de euros ganados tienen un impuesto del 45%
        salarioimpuestomax = salarioimpuestofinal - 900;
        salarioimpuestofinal1 = salarioimpuestomax * 0.45;
        salariodefinitivo = salarioimpuestofinal - salarioimpuestofinal1;
        sueldoneto = impuestosinextra - salarioimpuestofinal1;


        //Las primeras 35 horas se pagan al precio normal por hora
        //Las horas que exceden esas 35 horas se pagan 1,5 veces el precio normal.
        if (hor > 35) {
            System.out.println("Estas son las horas extras realizadas: " + extra + "h");
            System.out.println("Esto es lo ganado con las horas extras realizadas: " + extra2 + "€");
            System.out.println("Esto son las ganancias totales en bruto: " + extrafinal + "€");
        } else {
            System.out.println("Este es el sueldo total: " + sueldo + "€");
        }
        if (extrafinal > 500) {
            System.out.println("Este es el salario total con impuestos del 0.25%: " + salarioimpuestotal1 + "€");
        } else if (extrafinal > 500 && hor <= 35) {
            System.out.println("Este es el salario con impuestos del 25% sin horas extra: " + impuestosinextra + "€");
        }
        if (extrafinal > 900) {
            System.out.println("Este es el sueldo total en limpio: " + salariodefinitivo + "€");
        } else if (extrafinal > 900 && hor <= 35) {
            System.out.println("Este es el salario con impuestos del 25% y 45% sin horas extra: " + sueldoneto + "€");
        }
    }
}


