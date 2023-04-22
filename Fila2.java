// Clase fila utilizada para os demais exercicios.

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Fila2 {

    ArrayList<Integer> fila;

    public Fila2() {
        fila = new ArrayList<>();
    }

    public void adicionar(int elemento) {
        fila.add(elemento);
    }

    public int tamanho() {
        return fila.size();
    }

    public void inverter() {
        ArrayList<Integer> novaFila = new ArrayList<>();
        for (int i = tamanho() - 1; i >= 0; i--) {
            novaFila.add(fila.get(i));
        }
        fila = novaFila;
    }

    public Integer getTopo() {
        if (fila.isEmpty()) {
            return null;
        }
        return fila.get(0);
    }

    public int remover() throws NoSuchElementException {
        if (fila.isEmpty()) {
            throw new NoSuchElementException("Fila vazia");
        }
        return fila.remove(0);
    }

    public int getInicio() throws NoSuchElementException {
        if (fila.isEmpty()) {
            throw new NoSuchElementException("Fila vazia");
        }
        return fila.get(0);
    }

    public boolean vazia() {
        return fila.isEmpty();
    }
}
