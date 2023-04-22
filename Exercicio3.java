import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Fila fila = new Fila();
        Aviao caracteristicas = new Aviao();

        int menu;

        while (true) {
            System.out.println("=============================================================");
            System.out.println("1- Adicionar um avião a fila de espera");
            System.out.println("2- Autorizar decolagem");
            System.out.println("3- Listar todos aviões na fila de espera");
            System.out.println("4- Listar caracteristicas do primeiro avião");
            System.out.println("=============================================================");
            menu = sc.nextInt();

            switch (menu) {

                default:
                    System.out.println("Selecione alguma opção valida!!!");
                    break;

                case 1:
                    Aviao aviao = new Aviao();
                    System.out.println("=============================");
                    System.out.println("Adicione o nome do avião");
                    System.out.println("=============================");
                    aviao.nomeAviao = sc.next();
                    System.out.println("=============================");
                    System.out.println("Insira o número do avião");
                    System.out.println("=============================");
                    aviao.numeroIndetificador = sc.nextInt();
                    fila.insere(aviao);
                    System.out.println("=============================");
                    System.out.println("Avião adicionado a fila de espera");
                    System.out.println("=============================");
                    break;

                case 2:
                    System.out.println("=============================");
                    System.out.println("AVIÃO DECOLOU!!!");
                    System.out.println("=============================");
                    if (fila.tamanho() < 0) {
                        System.out.println("========================");
                        System.out.println("Sem aviões para decolar");
                        System.out.println("========================");
                    }
                    caracteristicas = fila.remove();
                    System.out.println("Nome do avião: " + caracteristicas.nomeAviao);
                    System.out.println("Número do avião: " + caracteristicas.numeroIndetificador);
                    break;

                case 3:
                    System.out.println("==========================");
                    System.out.println("Aviões na lista de espera");
                    System.out.println("==========================");
                    System.out.println(fila.tamanho());
                    break;

                case 4:
                    caracteristicas = fila.pegarElemento();
                    System.out.println("==========================");
                    System.out.println("Nome do avião: " + caracteristicas.nomeAviao);
                    System.out.println("Número do avião: " + caracteristicas.numeroIndetificador);
                    System.out.println("==========================");
                    break;
            }
        }
    }
}
