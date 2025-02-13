package POO_Ejercicio8;
import java.util.*;

public class JuegodeDados {
    private List<Dado> dados = new ArrayList<>();

    public void addDado(Dado dado) {
        this.dados.add(dado);
    }

    public void Tirada() {
        int contador = 0;
        int valor1;
        int valor2;
        int valor3;

        do {
            valor1 = dados.get(0).addValor();
            valor2 = dados.get(1).addValor();
            valor3 = dados.get(2).addValor();
            contador++;

            System.out.println("Tirada " + contador + ": " + valor1 + " - " + valor2 + " - " + valor3);
        } while (valor1 != valor2 || valor2 != valor3);

        System.out.println("¡Ganaste! Los tres dados tienen el mismo valor: " + valor1);
        System.out.println("Lo lograste en la tirada " + contador);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int confirm;
        System.out.println("¿Quieres jugar una partida de dados? (1 = Si, 2 = No)");
        confirm = sc.nextInt();

        if (confirm == 1) {
            JuegodeDados juego = new JuegodeDados();

            Dado dado1 = new Dado();
            Dado dado2 = new Dado();
            Dado dado3 = new Dado();

            juego.addDado(dado1);
            juego.addDado(dado2);
            juego.addDado(dado3);

            juego.Tirada();
        } else {
            System.out.println("Gracias por visitar el juego de dados.");
        }
    }
}