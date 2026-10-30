/*
 *@author: Luis Fernando Campuzano Hernández
 *@date: 30-10-2026
*/

package colas;

public class Main {
    public static void main(String[] args) {
        // Paso 1.1
        System.out.println("Entorno listo");
        System.out.println();

        // Paso 1.7
        ColaArreglo cola = new ColaArreglo(3);
        cola.encolar(10);
        cola.encolar(20);
        cola.encolar(30);
        System.out.println("Sale: " + cola.desencolar());
        cola.encolar(40);
        System.out.println("Frente: " + cola.frente());
        System.out.println("Tamaño: " + cola.tamanio());
        System.out.println("¿Llena? " + cola.estaLlena());
    }
}
