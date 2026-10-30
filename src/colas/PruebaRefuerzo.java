/*
 *@author: Luis Fernando Campuzano Hernández
 *@date: 30-10-2026
*/

package colas;

import java.util.ArrayDeque;
import java.util.Deque;

public class PruebaRefuerzo {

    // Ejercicio 3
    public static <T> void invertir(ColaEnlazada<T> cola) {
        Deque<T> pila = new ArrayDeque<>();
        while (!cola.estaVacia()) {
            pila.push(cola.desencolar());
        }
        while (!pila.isEmpty()) {
            cola.encolar(pila.pop());
        }
    }

    public static void main(String[] args) {
        ColaEnlazada<String> cola = new ColaEnlazada<>();
        cola.encolar("Ana");
        cola.encolar("Luis");
        cola.encolar("María");

        // Ejercicio 1
        cola.imprimirCola();
        System.out.println(cola.tamanio());

        // Ejercicio 3
        invertir(cola);
        cola.imprimirCola();

        // Ejercicio 2
        cola.vaciar();
        cola.imprimirCola();
        System.out.println(cola.tamanio());
        System.out.println(cola.estaVacia());
    }
}
