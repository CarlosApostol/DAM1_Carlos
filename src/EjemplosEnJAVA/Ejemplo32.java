package EjemplosEnJAVA;//Diseña un programa que muestre los primeros 40 términos de la serie de Fibonacci

public class Ejemplo32 {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 1;
        int t;
        System.out.println("1, 1");

        for (int i = 3; i <= 40;) {
            t = n1+n2;
            System.out.println(t);
            n1=n2;
            n2=t;
            i=i+1;
        if (i<=40){
            System.out.println(t);}
        }
    }
}
