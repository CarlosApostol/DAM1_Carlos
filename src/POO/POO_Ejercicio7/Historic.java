package POO.POO_Ejercicio7;
import java.util.*;

public class Historic{
    private Lector lector;
    private Exemplar exemplar;
    private String data_p;
    private String data_t;

    public Historic(Lector lector, Exemplar exemplar, String data_p, String data_t) {
        this.lector = lector;
        this.exemplar = exemplar;
        this.data_p = data_p;
        this.data_t = data_t;
    }

    public Lector getLector(Lector lector) {return this.lector;}
    public Exemplar getExemplar(Exemplar exemplar) {return this.exemplar;}
    public String getData_p() {return this.data_p;}
    public String getData_t() {return this.data_t;}

}
