package HERENCIAS;

public class Tecnico extends Operario{
    Tecnico(String dni, String nombre) {
        super(dni, nombre);
    }

    public void QueHago(){
        System.out.println("comprobar todos los equipos de una empresa y el buen funcionamiento de cada uno junto con revisiones periódicas");
    }
    public void identificarse()
    {
        System.out.println("Soy un Tecnico.");
    }
}
