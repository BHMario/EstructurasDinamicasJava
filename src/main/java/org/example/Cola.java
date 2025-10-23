package org.example;

public class Cola {
    private NodoCola frente, fin;

    public Cola() {
        frente = fin = null;
    }

    public void encolar(String nombre) {
        NodoCola nuevo = new NodoCola(nombre);
        if (estaVacia()) {
            frente = fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }
    }

    public String desencolar() {
        if (!estaVacia()) {
            String nombre = frente.nombre;
            frente = frente.siguiente;
            if (frente == null) fin = null;
            return nombre;
        }
        return null;
    }

    public boolean estaVacia() {
        return frente == null;
    }

    public void mostrar() {
        NodoCola aux = frente;
        if (aux == null) {
            System.out.println("La cola está vacía.");
            return;
        }
        System.out.println("Clientes en espera:");
        while (aux != null) {
            System.out.println("- " + aux.nombre);
            aux = aux.siguiente;
        }
    }
}
