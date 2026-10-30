/*
 *@author: Luis Fernando Campuzano Hernández
 *@date: 30-10-2026
*/

package colas;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class PruebaQueue {
    public static void main(String[] args) {
        // Paso 3.1
        System.out.println("--- LinkedList ---");
        probar(new LinkedList<>());

        System.out.println("--- ArrayDeque ---");
        probar(new ArrayDeque<>());
    }

    private static void probar(Queue<String> cola) {
        cola.offer("Ana");
        cola.offer("Luis");
        cola.offer("María");
        System.out.println(cola.peek());
        System.out.println(cola.poll());
        System.out.println(cola.size());
        System.out.println(cola);
    }
}
