package br.com.juliocnsouza.ocpjp.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * TestCollections.java -> Job:
 * <p>
 * @since 01/04/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class TestCollections {

    public static void main( String[] args ) {
        List<String> strings = Arrays.asList( "Julio" , "Cesar" , "Nunes" , "de" ,
                                              "Souza" );
        List<String> copy = new ArrayList<>( Collections.nCopies( 5 , "" ) );//inicializa com 5 items "" na lista
        Collections.copy( copy , strings );//as duas listas tem de ser do mesmo tamanho
        System.out.println( strings );
        Collections.reverse( strings );
        System.out.println( strings );
        Collections.fill( strings , "oops" );
        System.out.println( strings );
        System.out.println( copy );
    }

}
