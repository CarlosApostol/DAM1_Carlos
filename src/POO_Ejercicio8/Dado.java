package POO_Ejercicio8;
import java.util.*;

public class Dado {
    int valor;
    Random aleatorio = new Random(System.currentTimeMillis());

    public Dado() {
        this.valor = aleatorio.nextInt(6) + 1;
    }

    public int addValor() {
        this.valor = aleatorio.nextInt(6) + 1;
        return this.valor;
    }

    @Override
    public String toString() {
        return "El valor de la tirada es: " + this.valor;
    }
}
