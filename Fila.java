// Classe com algumas funções de fila para serem utilizadas no exercicio 2.

import java.util.ArrayList;
import java.util.List;

public class Fila {
    Aviao aviao = new Aviao();
    List<Aviao> avioes = new ArrayList<>();

    void insere(Aviao A) {
        avioes.add(A);
        System.out.println(avioes.size());
    }

    Aviao remove() {
        return (this.avioes.remove(0));
    }

    //Verificar se a lista está vazia de forma que não seja possivel remover o nada
    boolean filaVazia() {
        return (this.avioes.isEmpty());
    }

    public int tamanho() {
        return avioes.size();
    }

    Aviao pegarElemento() {
        return avioes.get(0);
    }
}
