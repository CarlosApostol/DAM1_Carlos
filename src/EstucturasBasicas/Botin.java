package EstucturasBasicas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Botin {
    public static void main(String[] args) {
        // Ejemplo de datos iniciales
        int participantes = 3;
        int[] billetes = {10, 20, 50, 200, 500};

        // Repartir los billetes
        Map<Integer, ArrayList<Integer>> resultado = repartirBilletes(participantes, billetes);
        System.out.println(resultado);
    }

    public static Map<Integer, ArrayList<Integer>> repartirBilletes(int participantes, int[] billetes) {
        Map<Integer, ArrayList<Integer>> reparto = new HashMap<>();

        for (int i = 0; i < participantes; i++) {
            reparto.put(i, new ArrayList<>());
        }

        //Repartir los billetes
        for (int i = 0; i < billetes.length; i++) {
            int participante = i % participantes; //Determinar quién recibe el billete
            reparto.get(participante).add(billetes[i]);
        }

        return reparto;
    }
}

