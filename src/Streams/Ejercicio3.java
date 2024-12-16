package Streams;

import Clases.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Person> personas = new ArrayList<>();

        Person persona1 = new Person("Juan", "Antonio", 1969);
        personas.add(persona1);
        Person persona2 = new Person("Mario", "Jose", 1975);
        personas.add(persona2);
        Person persona3 = new Person("Ancracio", "Algasflacas", 1962);
        personas.add(persona3);
        Person persona4 = new Person("Juan", "Hostiaquedificil", 1933);
        personas.add(persona4);

        List<String> nombresUnicos = personas.stream()
                .map(person -> person.getFirstName())
                .collect(Collectors.groupingBy(name -> name, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .sorted().toList();
            System.out.println(nombresUnicos);

    }
}
