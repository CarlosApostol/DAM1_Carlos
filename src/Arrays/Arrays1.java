package Arrays;//Imprimir Arrays

public class Arrays1 {
    public static void main(String[] args) {
        int[] anArray;
        anArray = new int[10];
        int i;

        anArray[0] = 100;
        anArray[1] = 200;
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        for (i = 0; i <= 9;i++) {
            i = i - 1;
            i += 1;
            System.out.println(anArray[i]);
        }
    }
}
