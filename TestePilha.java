import java.util.Stack;

public class TestePilha {

    Stack<Integer> PilhaP = new Stack<Integer>();
    Stack<Integer> PilhaN = new Stack<Integer>();

    int removerPilhaP, removerPilhaN;

    public void inserir(int numero) {
        if (numero > 0) {
            PilhaP.push(numero);
        } else if (numero < 0) {
            PilhaN.push(numero);
        } else if (numero == 0) {
            removerPilhaP = PilhaP.pop();
            removerPilhaN = PilhaN.pop();
            System.out.println("=============");
            System.out.println(removerPilhaP);
            System.out.println("=============");
            System.out.println(removerPilhaN);
            System.out.println("=============");
        }
    }
}