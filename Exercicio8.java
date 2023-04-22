import java.util.Random;

public class Exercicio8 {
    public static void main(String[] args) {

        Random aleatorio = new Random();
        TestePilha testePilha = new TestePilha();

        int numero;

        for (int i = 0; i < 1000; i++) {
            numero = aleatorio.nextInt(201) - 100;
            testePilha.inserir(numero);
        }
    }
}
