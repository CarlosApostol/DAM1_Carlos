package HERENCIAS;
import java.util.*;

public class Directivo extends Empleado {

    Directivo(String dni, String nombre){
        super(dni, nombre);
    }

    public void QueHago(){
        System.out.println("encargado de planificar, coordinar, supervisar y analizar cada acción que se lleve a cabo en la compañía");
    }

    @Override
    public void identificarse()
    {
        System.out.println("Soy un Directivo.");
    }
}
