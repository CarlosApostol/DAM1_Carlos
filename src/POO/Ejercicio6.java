package POO;
import java.util.*;

class AreaConeixement {
    String cod_area;
    private Set<Departament> departaments;

    public AreaConeixement(String cod_area) {
        this.cod_area = cod_area;
        this.departaments = new HashSet<>();
    }

    public String getCod_area() {
        return cod_area;
    }

    public void addDepartament(Departament departament) {
        this.departaments.add(departament);
    }

    public String toString() {
        return "CODI AREA DE CONEIXEMENT: " + this.cod_area + "\n\t" + this.departaments;
    }
}

class Departament {
    String cod_dep;
    private Set<Catedra> catedrals;
    private Set<Professor> professores;

    public Departament(String cod_dep) {
        this.cod_dep = cod_dep;
        this.catedrals = new HashSet<>();
        this.professores = new HashSet<>();
    }

    public String getCod_dep() {
        return cod_dep;
    }

    public void addCatedra(Catedra catedra) {
        this.catedrals.add(catedra);
    }

    public void addProfessor(Professor professor) {
        this.professores.add(professor);
    }

    public String toString() {
        return "CODI DELS DEPARTAMENTS: " + this.cod_dep + "\n\t" + this.catedrals + "\n\t" + this.professores;
    }
}

class Catedra {
    String cod_cat;
    private Set<Professor> professores;

    public Catedra(String cod_cat) {
        this.cod_cat = cod_cat;
        this.professores = new HashSet<>();
    }

    public String getCod_cat() {
        return cod_cat;
    }

    public void addProfessor(Professor professor) {
        this.professores.add(professor);
    }

    public String toString() {
        return "CODI DE LA CATEDRA: " + this.cod_cat + "\n\t" + this.professores;
    }
}

class Professor {
    String dni;
    private Set<Catedra> catedrals;

    public Professor(String dni) {
        this.dni = dni;
        this.catedrals = new HashSet<>();
    }

    public String getDni() {
        return dni;
    }

    public void addCatedra(Catedra catedra) {
        this.catedrals.add(catedra);
    }

    public String toString() {
        return "DNI DEL PROFESSOR: " + this.dni;
    }
}

class adscrit {
    private Professor professor;
    private Catedra catedra;
    private String data;
}

class Facultat {
    String cod_fac;
    private Set<Catedra> catedrals;

    public Facultat(String cod_fac) {
        this.cod_fac = cod_fac;
        this.catedrals = new HashSet<>();
    }

    public String getCod_fac() {
        return cod_fac;
    }

    public void addCatedra(Catedra catedra) {
        this.catedrals.add(catedra);
    }

    public String toString() {
        return "CODI DE LA FACULTAT: " + this.cod_fac + "\n\t" + this.catedrals;
    }
}

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





