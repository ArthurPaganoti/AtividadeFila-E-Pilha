import java.util.Random;

public class Exercicio5 {
    public static void main(String[] args) {

        Fila2 fila = new Fila2();
        Pilha pilha = new Pilha();
        Random aleatorio = new Random();

        boolean[] inserido = new boolean[1000];
        int topo = -1, numero;


        for (int i = 0; i < 1000; i++) {
            numero = aleatorio.nextInt(1000);
            if (inserido[numero]) {
                topo = pilha.push(-1, numero);
            } else {
                fila.adicionar(numero);
                inserido[numero] = true;
            }
        }
        System.out.println("===============================");
        System.out.println("Pilha: " + pilha.imprimir(topo));
        System.out.println("===============================");
        System.out.println("Fila: " + fila.fila);
        System.out.println("===============================");
    }
}