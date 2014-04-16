package br.com.juliocnsouza.ocpjp.practicequestions.generics_collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Q4.java -> Job:
 * <p>
 * @since 15/04/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class Q4 {

    public static void main( String[] args ) {
        List<Long> l1 = new ArrayList<>();
        //l1.add( 1); nao compila faltou l
        l1.add( new Long( 2 ) );
        l1.add( Long.parseLong( "3" ) );
        System.out.println( l1.get( 0 ) );
    }

}
