package EjemplosEnJAVA;//Modifica el programa anterior para que muestre la relación (división) entre el valor n y el (n - 1) de la serie de Fibonacci (40 veces). Esta es una manera de obtener una aproximación al Número Áureo

public class Ejemplo33 {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 1;
        int t;
        double aureo;
        System.out.println("1, 1");

        for (int i = 3; i <= 40; i++){
            t = n1+n2;
            System.out.println(t);
            n1=n2;
            n2=t;
}
            aureo = (double)n1/n2+1;
            System.out.println(aureo);
        }
    }



