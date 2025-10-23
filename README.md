# 🧠 Estructuras Dinámicas en Java (Pilas y Colas)

Este proyecto implementa **estructuras dinámicas de datos** en **Java**, específicamente **Pilas (Stacks)** y **Colas (Queues)**, utilizando nodos enlazados.
Incluye una aplicación de consola con menú interactivo para resolver distintos ejercicios prácticos.

---

## 📚 Contenido del proyecto

El programa permite realizar las siguientes operaciones:

### 1️⃣ Invertir texto con una **PILA**

Recibe una cadena de texto, apila cada carácter y luego los desapila para obtener el texto invertido.
➡️ *Solo usa operaciones `PUSH`, `POP` e `ISEMPTY`.*

### 2️⃣ Simular una **COLA** de clientes

Simula la atención de clientes en orden de llegada.
Permite **encolar**, **desencolar** y **mostrar** el estado actual de la cola.

### 3️⃣ Verificar si una palabra o frase es **palíndroma**

Utiliza **una pila** (para lectura inversa) y **una cola** (para lectura directa).
Se normaliza el texto (minúsculas y sin espacios) y se comparan los elementos al desapilar y desencolar.

### 4️⃣ Convertir un número **decimal a binario**

Convierte un entero positivo en su representación binaria apilando los restos de las divisiones sucesivas entre 2.

---

## ⚙️ Estructura del proyecto Maven

```
EstructurasDinamicasJava/
│
├── pom.xml
├── README.md
└── src/
    ├── main/
    │   └── java/
    │       └── org/
    │           └── example/
    │               ├── Main.java
    │               ├── Pila.java
    │               ├── Nodo.java
    │               ├── Cola.java
    │               └── NodoCola.java
    └── test/
        └── java/
            └── com/
                └── ejemplo/
                    └── estructuras/
                        └── MainTest.java
```

---

## 🚀 Ejecución del programa

### 🔧 Requisitos previos

* **Java 21** o superior
* **Apache Maven** instalado

### ▶️ Ejecutar desde consola

```bash
mvn clean compile
mvn exec:java
```

O bien, desde un IDE (IntelliJ, Eclipse, VS Code):

1. Importa el proyecto como **Maven Project**
2. Ejecuta la clase `Main.java`

---

## 🧩 Menú principal

```
===== MENÚ PRINCIPAL =====
1) Invertir texto con PILA
2) Simular cola de clientes
3) Verificar palabra palíndroma
4) Convertir decimal a binario
5) Salir
```

---

## 🧠 Ejemplo de uso

### Ejercicio 1 — Invertir texto

```
Ingrese el texto a invertir: Hola Mundo
Texto invertido: odnuM aloH
```

### Ejercicio 2 — Cola de clientes

```
1) Llegada de cliente → Ana
2) Llegada de cliente → Luis
3) Atender cliente
Cliente atendido: Ana
```

### Ejercicio 3 — Palíndromo

```
Ingrese una palabra o frase: Anilina
✅ Es palíndromo.
```

### Ejercicio 4 — Decimal a binario

```
Ingrese un número decimal: 25
Binario: 11001
```

---

## 🧰 Tecnologías utilizadas

* **Lenguaje:** Java 17
* **Gestor de dependencias:** Maven
* **Paradigma:** Programación orientada a objetos
* **Estructuras:** Pila y Cola implementadas con nodos enlazados

---

## 👨‍💻 Autor

**Mario Sánchez Ruiz**
📚 *Curso:* Programacion de Servicios y Procesos
📅 *Año:* 2025
