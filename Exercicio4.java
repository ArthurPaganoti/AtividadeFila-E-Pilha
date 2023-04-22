import java.util.Random;

public class Exercicio4 {

    static Random aleatorio = new Random();

    public static void main(String[] args) {

        Fila2 fila = new Fila2();

        int numero;

        for (int i = 0; i < 100; i++) {
            numero = aleatorio.nextInt(100);
            fila.adicionar(numero);
        }
        System.out.println("=============================");
        System.out.println("Fila original: " + fila.fila);
        System.out.println("=============================");
        fila.inverter();
        System.out.println("Fila invertida: " + fila.fila);
        System.out.println("=============================");
    }
}