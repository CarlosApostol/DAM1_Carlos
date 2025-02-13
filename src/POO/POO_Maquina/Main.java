package POO.POO_Maquina;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MaquinaExpendedora maquina = new MaquinaExpendedora(1.20);

        System.out.println(maquina.sacarTique(5.0));

        System.out.println(maquina.sacarTique(1.0));
    }
}

