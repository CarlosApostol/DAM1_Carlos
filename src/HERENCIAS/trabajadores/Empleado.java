package HERENCIAS.trabajadores;

public class Empleado {
    private String dni;
    private String nombre;

    public Empleado(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public String getDni()
    {
        return dni;
    }

    public void setDni(String dni)
    {
        this.dni = dni;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public void identificarse()
    {
        System.out.println("Mi nombre es " + nombre+" mi dni es: "+dni);
    }
}
