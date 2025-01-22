package POO;

class Ordenadores {
    private String modelo;
    private String procesador;
    private int unidades;
    private double precio;

    public Ordenadores(String modelo, String procesador, int unidades, double precio) {
        this.modelo = modelo;
        this.procesador = procesador;
        this.unidades = unidades;
        this.precio = precio;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getProcesador() {
        return this.procesador;
    }

    public int getUnidades() {
        return this.unidades;
    }

    public double getPrecio() {
        return this.precio;
    }

    public String toString() {
        return "Modelo del ordenador: " + getModelo() + "\n\t" + "Procesador: "+ getProcesador() +"\n\t"+ "Unidades disponibles: " + getUnidades() + "\n\t" + " Precio del ordenador: " + getPrecio() +"€";
    }
}

public class Ejercicio1 {
    public static void main(String[] args) {
        Ordenadores pc1 = new Ordenadores("PcCom Ready / 32GB / 1TB SSD / RTX 4060 Ti","AMD Ryzen 7 5800X", 15,1199.00);
        Ordenadores pc2 = new Ordenadores("CHUWI GemiBook XPro 14.1| 8GB+256GB ","intel 12th N100",7,239.00);
        Ordenadores pc3 = new Ordenadores("ASUS All-in-One A3402WVAK-WPC0480/16 GB/512GB SSD/23.8","Intel Core i5-1335U",2,549.00);

        System.out.println(pc1);
        System.out.println(pc2);
        System.out.println(pc3);
    }
}
