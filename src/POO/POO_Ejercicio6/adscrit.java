package POO.POO_Ejercicio6;
import java.util.*;

public class adscrit {
    private Professor professor;
    private Catedra catedra;
    private String data;

    public adscrit(Professor professor, Catedra catedra, String data) {
        this.professor = professor;
        this.catedra = catedra;
        this.data = data;
    }

    public String getData() { return data;}
    public Professor getProfessor(Professor professor) { return professor;}

    public Catedra getCatedra(Catedra catedra) { return catedra;}
}
