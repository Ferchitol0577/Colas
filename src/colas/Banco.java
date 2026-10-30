/*
 *@author: Luis Fernando Campuzano Hernández
 *@date: 30-10-2026
*/

package colas;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        // Paso 4.1
        ColaEnlazada<String> fila = new ColaEnlazada<>();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n1. Llega un cliente");
            System.out.println("2. Atender al siguiente cliente");
            System.out.println("3. Ver quién sigue");
            System.out.println("4. Ver cantidad en espera");
            System.out.println("5. Salir");
            System.out.print("Opción: ");

            try {
                opcion = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                opcion = 0;
            }

            // Paso 4.2
            switch (opcion) {
                case 1:
                    System.out.print("Nombre del cliente: ");
                    String nombre = sc.nextLine().trim();
                    if (nombre.isEmpty()) {
                        System.out.println("El nombre no puede estar vacío");
                    } else {
                        fila.encolar(nombre);
                        System.out.println(nombre + " se unió a la fila");
                    }
                    break;
                case 2:
                    if (fila.estaVacia()) {
                        System.out.println("No hay clientes en espera");
                    } else {
                        System.out.println("Atendiendo a: " + fila.desencolar());
                    }
                    break;
                case 3:
                    if (fila.estaVacia()) {
                        System.out.println("No hay clientes en espera");
                    } else {
                        System.out.println("Sigue: " + fila.frente());
                    }
                    break;
                case 4:
                    System.out.println("Clientes en espera: " + fila.tamanio());
                    break;
                case 5:
                    System.out.println("Fin de la simulación");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 5);

        sc.close();
    }
}
