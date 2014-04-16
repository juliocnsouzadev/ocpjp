package br.com.juliocnsouza.ocpjp.practicequestions.generics_collections;

import java.util.HashSet;
import java.util.Set;

/**
 * Q6.java -> Job:
 * <p>
 * @since 15/04/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class Q6 {

    public static void main( String[] args ) {
        Set<Integer> s1 = new HashSet<>();
        s1.add( 30 );
        s1.add( 23 );
        s1.add( null );

        Set<Integer> s2 = new HashSet<>( s1 );
        s2.addAll( s1 );
        System.out.println( s2.size() );
    }

}
