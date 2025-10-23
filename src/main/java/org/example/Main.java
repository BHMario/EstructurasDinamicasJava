package org.example;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n===== MENÚ PRINCIPAL =====");
            System.out.println("1) Invertir texto con PILA");
            System.out.println("2) Simular cola de clientes");
            System.out.println("3) Verificar palabra palíndroma");
            System.out.println("4) Convertir decimal a binario");
            System.out.println("5) Salir");
            System.out.print("Seleccione una opción: ");
            opcion = leerEntero();

            switch (opcion) {
                case 1 -> invertirTextoConPila();
                case 2 -> simularColaClientes();
                case 3 -> verificarPalindromo();
                case 4 -> convertirDecimalABinario();
                case 5 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }

    // ====================================================
    // MÉTODO 1: Invertir texto con PILA
    // ====================================================
    public static void invertirTextoConPila() {
        Pila pila = new Pila();
        System.out.print("\nIngrese el texto a invertir: ");
        String texto = sc.nextLine();

        for (char c : texto.toCharArray()) {
            pila.push(c);
        }

        System.out.print("Texto invertido: ");
        while (!pila.isEmpty()) {
            System.out.print(pila.pop());
        }
        System.out.println();
    }

    // ====================================================
    // MÉTODO 2: Simular cola de clientes
    // ====================================================
    public static void simularColaClientes() {
        Cola cola = new Cola();
        int opcion;
        do {
            System.out.println("\n--- GESTIÓN DE CLIENTES ---");
            System.out.println("1) Llegada de cliente");
            System.out.println("2) Atender cliente");
            System.out.println("3) Mostrar cola");
            System.out.println("4) Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            opcion = leerEntero();
            switch (opcion) {
                case 1 -> {
                    System.out.print("Nombre del cliente: ");
                    String nombre = sc.nextLine();
                    cola.encolar(nombre);
                    System.out.println(nombre + " ha llegado a la cola.");
                }
                case 2 -> {
                    String atendido = cola.desencolar();
                    if (atendido != null)
                        System.out.println("Cliente atendido: " + atendido);
                    else
                        System.out.println("No hay clientes en la cola.");
                }
                case 3 -> cola.mostrar();
                case 4 -> System.out.println("Volviendo al menú principal...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 4);
    }

    // ====================================================
    // MÉTODO 3: Verificar si una palabra o frase es palíndroma
    // ====================================================
    public static void verificarPalindromo() {
        Pila pila = new Pila();
        Cola cola = new Cola();

        System.out.print("\nIngrese una palabra o frase: ");
        String texto = sc.nextLine().toLowerCase().replaceAll(" ", "");

        for (char c : texto.toCharArray()) {
            pila.push(c);
            cola.encolar(String.valueOf(c));
        }

        boolean esPalindromo = true;
        while (!pila.isEmpty() && !cola.estaVacia()) {
            char desdePila = pila.pop();
            char desdeCola = cola.desencolar().charAt(0);
            if (desdePila != desdeCola) {
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo)
            System.out.println("Es palíndromo.");
        else
            System.out.println("No es palíndromo.");
    }

    // ====================================================
    // MÉTODO 4: Convertir número decimal a binario
    // ====================================================
    public static void convertirDecimalABinario() {
        Pila pila = new Pila();
        System.out.print("\nIngrese un número decimal positivo: ");
        int num = leerEntero();

        if (num == 0) {
            System.out.println("Binario: 0");
            return;
        }

        while (num > 0) {
            int resto = num % 2;
            pila.push((char) (resto + '0'));
            num /= 2;
        }

        System.out.print("Binario: ");
        while (!pila.isEmpty()) {
            System.out.print(pila.pop());
        }
        System.out.println();
    }

    // ====================================================
    // MÉTODO AUXILIAR: Lectura segura de enteros
    // ====================================================
    private static int leerEntero() {
        while (true) {
            try {
                int num = Integer.parseInt(sc.nextLine());
                return num;
            } catch (NumberFormatException e) {
                System.out.print("Ingrese un número válido: ");
            }
        }
    }
}
