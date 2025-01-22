package POO;

import java.util.Scanner;

class aireacondicionado {
    private String name;
    private int max;
    private int min;
    private int temp;

    public aireacondicionado(String name, int max, int min) {
        this.name = name;
        this.max = max;
        this.min = min;
    }
    public String getName() {
        return this.name;
    }

    public int getMax() {
        return this.max;
    }

    public int getMin() {
        return this.min;
    }

    public int getTemp() {
        return this.temp;
    }

    public void setTemp(int temp) {
        if (temp <= this.max && temp >= this.min)
            this.temp = temp;
    }

    public void up(){
        if (this.temp + 1 <= this.max)
            this.temp++;
    }
    //Este setter baja la temperatura
    public void down(){
        if (this.temp - 1 >= this.min)
            this.temp--;
    }

    @Override
    public String toString(){
        return "Dispositivo: "+ this.name + "Temperatura: " + this.temp;
    }


}

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mando;
        aireacondicionado aire = new aireacondicionado("Doyairexd", 40, -10);

        do {
            System.out.println("------------------------------------------------");
            System.out.println("Subir temperatura: 1" + " Bajar temperatura: -1");
            System.out.println("(pulsa 0 para dejar de toquetear la temperatura)");
            mando = sc.nextInt();
            if (mando == 1) {
                aire.up();
                System.out.println("TEMPERATURA SUBIDA. Temperatura actual: " + aire.getTemp()+"º");
            }
            if (mando == -1) {
                aire.down();
                System.out.println("TEMPERATURA BAJADA. Temperatura actual: " + aire.getTemp()+"º");
            }
        } while (mando != 0);
            System.out.println(aire+"º");


    }
}
