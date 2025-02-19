package HERENCIAS.trabajadores;

public class ProyectoTrabajadores {
    public static void main(String[] args) {
                // Crear instancias de las clases
                Empleado empleado1 = new Empleado("12345678A", "Juan Pérez");
                Directivo directivo1 = new Directivo("87654321B", "Ana López");
                Operario operario1 = new Operario("95654321F", "Carlos Apostol");
                Oficial oficial1 = new Oficial("23456789C", "Carlos Gómez");
                Tecnico tecnico1 = new Tecnico("34567890D", "Luisa Fernández");

                // Probar métodos de Empleado
                System.out.println("=== Prueba de Empleado ===");
                empleado1.identificarse();
                System.out.println("Nombre: " + empleado1.getNombre());
                System.out.println("DNI: " + empleado1.getDni());
                System.out.println();

                // Probar métodos de Directivo
                System.out.println("=== Prueba de Directivo ===");
        System.out.println("Nombre: ");
        directivo1.getNombre();
        System.out.println("¿Cual es mi rol?: ");
        directivo1.identificarse();
        System.out.println("¿Que hago?: ");
                directivo1.QueHago();

        // Probar métodos de Operario
        System.out.println("=== Prueba de Operario ===");
        System.out.println("Nombre: ");
        operario1.getNombre();
        System.out.println("¿Cual es mi rol?: ");
        operario1.identificarse();
        System.out.println("¿Que hago?: ");
        operario1.QueHago();

                // Probar métodos de Oficial
                System.out.println("=== Prueba de Oficial ===");
        System.out.println("Nombre: ");
        oficial1.getNombre();
        System.out.println("¿Cual es mi rol?: ");
        oficial1.identificarse();
        System.out.println("¿Que hago?: ");
        oficial1.QueHago();

                // Probar métodos de Tecnico
                System.out.println("=== Prueba de Técnico ===");
        System.out.println("Nombre: ");
        tecnico1.getNombre();
        System.out.println("¿Cual es mi rol?: ");
        tecnico1.identificarse();
        System.out.println("¿Que hago?: ");
        tecnico1.QueHago();;
            }
        }

