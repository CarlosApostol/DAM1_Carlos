package POO.POO_Subastas;
import java.util.*;

public class MainSubasta {
    public static void main(String[] args) {
        Subasta sub1 = new Subasta("sub1");

        sub1.addLote("Lote1", 500.00);

        sub1.addPuja("Carlos", 400.0);
        sub1.addPuja("Ana", 900.0);
        sub1.addPuja("Luis", 800.0);
        sub1.addPuja("Juan", 1600.0);
        sub1.addPuja("Mario", 280.0);
        sub1.addPuja("Reggin", 700.0);
        System.out.println(sub1);

        Subasta sub2 = new Subasta("sub2");

        sub2.addLote("Lote2", 8000.00);

        sub2.addPuja("Carlos", 9000.0);
        sub2.addPuja("Ana", 6500.0);
        sub2.addPuja("Luis", 7895.0);
        sub2.addPuja("Juan", 00.0);
        sub2.addPuja("Mario", 8700.0);
        sub2.addPuja("Reggin", 5066.0);
        System.out.println(sub2);

        Subasta sub3 = new Subasta("sub3");

        sub3.addLote("Lote2", 20000.00);

        System.out.println(sub3);
    }
}