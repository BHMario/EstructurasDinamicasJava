package org.example;

public class Pila {
    private Nodo cima;

    public Pila() {
        cima = null;
    }

    public void push(char c) {
        Nodo nuevo = new Nodo(c);
        nuevo.siguiente = cima;
        cima = nuevo;
    }

    public char pop() {
        if (!isEmpty()) {
            char c = cima.dato;
            cima = cima.siguiente;
            return c;
        }
        return '\0';
    }

    public boolean isEmpty() {
        return cima == null;
    }
}
