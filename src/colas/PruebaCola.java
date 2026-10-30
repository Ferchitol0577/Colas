/*
 *@author: Luis Fernando Campuzano Hernández
 *@date: 30-10-2026
*/

package colas;

public class PruebaCola {
    public static void main(String[] args) {
        // Paso 2.6
        ColaEnlazada<String> nombres = new ColaEnlazada<>();
        nombres.encolar("Ana");
        nombres.encolar("Luis");
        nombres.encolar("María");

        System.out.println(nombres.desencolar());
        System.out.println(nombres.frente());
        System.out.println(nombres.tamanio());
    }
}
