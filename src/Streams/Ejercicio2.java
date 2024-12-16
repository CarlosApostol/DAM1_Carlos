package Streams;

import Clases.Person;

import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Person> personas = new ArrayList<>();

        Person persona1 = new Person("Juan", "Antonio", 1969);
        personas.add(persona1);
        Person persona2 = new Person("Mario", "Jose", 1975);
        personas.add(persona2);
        Person persona3 = new Person("Ancracio", "Algasflacas", 1962);
        personas.add(persona3);
        Person persona4 = new Person("Pepe", "Hostiaquedificil", 1933);
        personas.add(persona4);

        long count = personas.stream()
                .filter(person -> person.getFirstName().charAt(0) == 'A')
                .count();
        System.out.println("Contador: "+count);
    }
}

