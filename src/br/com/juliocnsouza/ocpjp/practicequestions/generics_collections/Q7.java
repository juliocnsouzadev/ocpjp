package br.com.juliocnsouza.ocpjp.practicequestions.generics_collections;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Q7.java -> Job:
 * <p>
 * @since 15/04/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class Q7 {

    public static void main( String[] args ) {
        Queue<Integer> q = new PriorityQueue<>();
        for ( int i = 0 ; i <= 5 ; i++ ) {
            q.add( i );
        }
        q.peek();
        q.poll();
        q.peek();
        q.poll();
        System.out.println( q );
    }

}
