/*
 *@author: Luis Fernando Campuzano Hernández
 *@date: 30-10-2026
*/

package colas;

import java.util.Queue;

public class PruebaPriorityQueue {
    public static void main(String[] args) {
        // Paso 3.3
        Queue<Integer> pq = new java.util.PriorityQueue<>();
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);

        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
    }
}
