package POO.POO_Laboratorio;

public class MainLab {
    public static void main(String[] args) {
        Lab lab = new Lab("Laboratorio de Física", "Taller 101", 5, "Lunes 10:00 AM", "Prof. Pérez");

        lab.agregarEstudiante("Juan Pérez");
        lab.agregarEstudiante("Ana Gómez");
        lab.agregarEstudiante("Antonio Cantero");
        lab.agregarEstudiante("Alex Muñoz");
        lab.agregarEstudiante("Carlos Apostol");

        System.out.println(lab);
    }
}