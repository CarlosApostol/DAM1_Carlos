package HERENCIAS.trabajadores;

public class Operario extends Empleado {

        Operario(String dni, String nombre){
            super(dni, nombre);
        }

        public void QueHago(){
            System.out.println("trabajar con maquinaria y de proporcionar asistencia en labores manuales de diferentes sectores industriales");
        }

    @Override
    public void identificarse()
    {
        System.out.println("Soy un Operario.");
    }
    }

