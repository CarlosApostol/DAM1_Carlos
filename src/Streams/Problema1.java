package Streams;

import java.util.ArrayList;
import Clases.Person;
public class Problema1 {
    public static void main(String[] args) {
        ArrayList<Person> personas = new ArrayList<>();

            Person persona1 = new Person("Juan", "Antonio", 1969);
            personas.add(persona1);
            Person persona2 = new Person("Mario", "Jose", 1975);
            personas.add(persona2);
            Person persona3 = new Person("Pancracio", "Nalgasflacas", 1962);
            personas.add(persona3);
            Person persona4 = new Person("Pepe", "Hostiaquedificil", 1933);
            personas.add(persona4);

            long count = personas.stream()
                .filter(person -> person.getBirthYear() < 1970)
                .count();
                System.out.println("Contador: "+count);
    }
}






