package br.com.juliocnsouza.ocpjp.practicequestions.generics_collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Q3.java -> Job:
 * <p>
 * @since 15/04/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class Q3 {

    public static void main( String[] args ) {
        List<Integer> l1 = new ArrayList<>();
        l1.add( 1 );

        List l2 = l1;
        l2.add( "ola" );

        List<Integer> l3 = l2;
        l3.add( 2 );
        System.out.println( l1 );
    }

}
