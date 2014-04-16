package br.com.juliocnsouza.ocpjp.practicequestions.generics_collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Q5.java -> Job:
 * <p>
 * @since 15/04/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class Q5 {

    public static void main( String[] args ) {
        List<Integer> l1 = new ArrayList<>();
        l1.add( 30 );
        l1.add( 23 );
        l1.add( 1 , 0 );

        List<Integer> l2 = new ArrayList<>( l1 );
        l2.addAll( l1 );
        l2.add( 4 , 9 );

        List<Integer> l3 = l2.subList( 2 , 5 );
        l3.clear();
        System.out.println( l2 );
    }

}
