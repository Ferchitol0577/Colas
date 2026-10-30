/*
 *@author: Luis Fernando Campuzano Hernández
 *@date: 30-10-2026
*/

package colas;

import java.util.LinkedList;
import java.util.Queue;

public class PruebaColaVacia {
    public static void main(String[] args) {
        // Paso 3.2
        Queue<String> cola = new LinkedList<>();

        try {
            cola.remove();
        } catch (Exception e) {
            System.out.println("remove():  excepción " + e.getClass().getSimpleName());
        }

        System.out.println("poll():    " + cola.poll());

        try {
            cola.element();
        } catch (Exception e) {
            System.out.println("element(): excepción " + e.getClass().getSimpleName());
        }

        System.out.println("peek():    " + cola.peek());
    }
}
