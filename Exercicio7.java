// Não entendi muito bem como a pilha ia encaixar neste exericio.

import java.util.Random;

public class Exercicio7 {
    public static void main(String[] args) {

        Fila2 fila = new Fila2();
        Pilha pilha = new Pilha();
        Random aleatorio = new Random();

        int numero = 0, topo = -1;

        for (int i = 0; i < 20; i++) {
            numero = aleatorio.nextInt(20);
            fila.adicionar(numero);
        }

        pilha.push(topo, numero);

        System.out.println("===========================");
        System.out.println("Fila original" + fila.fila);
        System.out.println("===========================");
        fila.inverter();
        System.out.println("===========================");
        System.out.println("Fila invertida" + fila.fila);
        System.out.println("===========================");
        System.out.println("Pilha: " + pilha.imprimir(topo));
        System.out.println("===========================");
    }
}