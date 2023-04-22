// *OBS: Tive alguns problemas na hora de remover o valor da pilha e imprimir.

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Pilha pilha = new Pilha();
        Scanner sc = new Scanner(System.in);

        int menu, valorPilha, topo = 0;

        while (true) {
            System.out.println("===================");
            System.out.println("1- Adicionar item");
            System.out.println("2- Remover item");
            System.out.println("3- Exibir tamanho");
            System.out.println("====================");
            menu = sc.nextInt();

            switch (menu) {

                default:
                    System.out.println("Selecione alguma opção valida!!!");
                    break;

                case 1:
                    System.out.println("=====================");
                    System.out.println("Adicione os valores");
                    System.out.println("=====================");
                    valorPilha = sc.nextInt();
                    topo = pilha.push(topo, valorPilha);
                    break;

                case 2:
                    topo = pilha.pop(topo);
                    System.out.println("=====================");
                    System.out.println("Removido com sucesso");
                    System.out.println("=====================");
                    break;

                case 3:
                    System.out.println("=====================");
                    pilha.imprimir(topo);
                    System.out.println("=====================");
                    break;
            }
        }
    }
}