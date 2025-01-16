package InterfacesComparables;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class FelipeysusTareas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numtareas;


        do {
            System.out.println("¿Cuántas tareas hay?");
            numtareas = sc.nextInt();
            if (numtareas > 100) System.out.println("SON DEMASIADAS TAREAS AAAAAH.");
        } while (numtareas > 100);


        ArrayList<Tarea> tareas = new ArrayList<>();
        for (int i = 0; i < numtareas; i++) {
            System.out.println("¿Cuál es la prioridad de esta tarea?");
            int prior = sc.nextInt();
            System.out.println("¿Cuál es la duración de esta tarea?");
            int dur = sc.nextInt();
            tareas.add(new Tarea(prior, dur));
        }


        Collections.sort(tareas);
        for (Tarea t : tareas) System.out.println(t.prioridad + " " + t.duracion);
        System.out.println("---");
    }
}

class Tarea implements Comparable<Tarea> {
    int prioridad, duracion;

    public Tarea(int prioridad, int duracion) {
        this.prioridad = prioridad;
        this.duracion = duracion;
    }

    @Override
    public int compareTo(Tarea otra) {
        return (this.prioridad != otra.prioridad) ?
                otra.prioridad - this.prioridad : 
                this.duracion - otra.duracion;
    }
}
