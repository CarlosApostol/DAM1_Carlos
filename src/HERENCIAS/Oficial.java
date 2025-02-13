package HERENCIAS;

public class Oficial extends Operario{
    Oficial(String dni, String nombre) {
        super(dni, nombre);
    }

    public void QueHago(){
        System.out.println("ocupa un puesto de responsabilidad y autoridad en una organización");
    }
    public void identificarse()
    {
        System.out.println("Soy un Oficial.");
    }
}

