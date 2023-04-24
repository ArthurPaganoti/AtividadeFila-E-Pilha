import java.util.Scanner;
import java.util.Stack;

public class Exercicio2 {
    public static void main(String[] args) {
        
        Stack <Integer> teste = new Stack <Integer>();
        Scanner sc = new Scanner(System.in);
        
        int menu, numeroAdicionado = -1;

        while (true) {

            System.out.println("=====================");
            System.out.println("1- Adiciona elementos");
            System.out.println("2- Remove elementos");
            System.out.println("3- Mostra os elementos");
            System.out.println("=====================");
            menu = sc.nextInt();

            switch (menu) {
                
                case 1: 
                    System.out.println("========================================");
                    System.out.println("Digite o número para ser adicionado");
                    System.out.println("========================================");
                    numeroAdicionado = sc.nextInt();
                    if (teste.add(numeroAdicionado)) {
                        System.out.println("========================================");
                        System.out.println("Número: " +numeroAdicionado+ " adicionado com sucesso!");
                        System.out.println("========================================");
                    } else {
                        System.out.println("========================================");
                        System.out.println("Erro ao adicionar o valor");
                        System.out.println("========================================");
                    }
                    break;
                

                case 2: 
                    if (teste.pop() != null) {
                        System.out.println("=======================================================");
                        System.out.println("Número: " +numeroAdicionado+ " removido com sucesso!");
                        System.out.println("=======================================================");
                    } else {
                        System.out.println("=======================================================");
                        System.out.println("Falha ao remover o valor");
                        System.out.println("=======================================================");
                    }
                    break;

                case 3:
                    System.out.println("=====================================");
                    System.out.println("Número de elementos: " +teste.size());
                    System.out.println("=====================================");
                    break;
                }
            }
        }
    }
