/*
 *@author: Luis Fernando Campuzano Hernández
 *@date: 30-10-2026
*/

package colas;

public class ColaArreglo {
    // Paso 1.1
    private int[] datos;
    private int frente;
    private int fin;
    private int tamanio;
    private int capacidad;

    // Paso 1.2
    public ColaArreglo(int capacidad) {
        if (capacidad <= 0) {
            throw new IllegalArgumentException("La capacidad debe ser mayor que 0");
        }
        this.capacidad = capacidad;
        this.datos = new int[capacidad];
        this.frente = 0;
        this.fin = -1;
        this.tamanio = 0;
    }

    // Paso 1.3
    public boolean estaVacia() {
        return tamanio == 0;
    }

    public boolean estaLlena() {
        return tamanio == capacidad;
    }

    public int tamanio() {
        return tamanio;
    }

    // Paso 1.4
    public void encolar(int valor) {
        if (estaLlena()) {
            throw new IllegalStateException("La cola está llena");
        }
        fin = (fin + 1) % capacidad;
        datos[fin] = valor;
        tamanio++;
    }

    // Paso 1.5
    public int desencolar() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        int valor = datos[frente];
        frente = (frente + 1) % capacidad;
        tamanio--;
        return valor;
    }

    // Paso 1.6
    public int frente() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return datos[frente];
    }
}
