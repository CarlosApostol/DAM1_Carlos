package POO.POO_Ejercicio7;
import java.util.*;

public class Exemplar {
   String num_exem;

    public Exemplar(String n_ejemplar) {
        this.num_exem = num_exem;
    }

    public String getNum_exem() {return this.num_exem;}

    @Override
    public String toString() {
        return this.num_exem;
    }
}
