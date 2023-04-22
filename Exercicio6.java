import java.util.Random;

public class Exercicio6 {
    public static void main(String[] args) {

        Fila2 fila = new Fila2();
        Pilha pilha = new Pilha();
        Random aleatorio = new Random();

        int numero, topo = -1, removerFila;

        for (int i = 0; i < 2000; i++) {
            numero = aleatorio.nextInt(2001) - 1000;
            fila.adicionar(numero);
        }
        if (fila.getInicio() >= 0) {
            removerFila = fila.remover();
            pilha.push(topo, removerFila);
        } else if (fila.getInicio() < 0) {
            pilha.pop(topo);
        }
        System.out.println("=====================");
        System.out.println("Pilha: " + pilha.imprimir(topo));
        System.out.println("=====================");
    }
}