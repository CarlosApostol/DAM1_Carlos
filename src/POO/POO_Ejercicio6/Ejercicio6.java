package POO.POO_Ejercicio6;
import java.util.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        AreaConeixement area = new AreaConeixement("A01");
        Departament dep1 = new Departament("D01");
        Catedra cat1 = new Catedra("C01");
        Professor prof1 = new Professor("12345678A");
        Facultat facultat = new Facultat("F01");

        area.addDepartament(dep1);
        dep1.addCatedra(cat1);
        dep1.addProfessor(prof1);
        facultat.addCatedra(cat1);

        System.out.println(area);
        System.out.println(facultat);
    }
}
