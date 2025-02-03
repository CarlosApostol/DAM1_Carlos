package POO_Ejercicio5;
import java.util.*;

class Prestec {
    String np;

    public Prestec(String np) {
        this.np = np;
    }

    public String getNp() {
        return np;
    }
    @Override
    public String toString() {
        return this.np;
    }
}
