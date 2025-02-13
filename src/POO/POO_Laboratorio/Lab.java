package POO.POO_Laboratorio;
import java.util.*;

public class Lab {
    private String nombre;
    private String taller;
    private int capacidadMax;
    private String horaYDia;
    private String profesor;
    private List<String> estudiantes;

    public Lab(String nombre, String taller, int capacidadMax, String horaYDia, String profesor) {
        this.nombre = nombre;
        this.taller = taller;
        this.capacidadMax = capacidadMax;
        this.horaYDia = horaYDia;
        this.profesor = profesor;
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(String estudiante) {
        if (estudiantes.size() < capacidadMax) {
            estudiantes.add(estudiante);
            System.out.println("Estudiante " + estudiante + " agregado al laboratorio.");
        } else {
            System.out.println("El laboratorio está lleno.");
            estudiantes.removeLast();
        }
    }

    public List<String> getEstudiantes() {
        return estudiantes;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTaller() {
        return taller;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public String getHoraYDia() {
        return horaYDia;
    }

    public String getProfesor() {
        return profesor;
    }

    @Override
    public String toString() {
        return "Laboratorio: " + nombre + "\n\t" +
                "Taller: " + taller + "\n\t" +
                "Capacidad máxima: " + capacidadMax + "\n\t" +
                "Horario: " + horaYDia + "\n\t" +
                "Profesor: " + profesor + "\n\t" +
                "Estudiantes inscritos: " + estudiantes;

    }
}

