package br.com.juliocnsouza.ocpjp.content.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * IteratorTests.java -> Job:
 * <p>
 * @since 14/04/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class IteratorTests {

    public static void main( String[] args ) {
        Collection<Integer> inteiros = new ArrayList<>(
                Arrays.asList( 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 ) ); //inicializando lista
        Iterator<Integer> iterator = inteiros.iterator(); // pegando iterator da lista
        while ( iterator.hasNext() ) { // percorrendo com hasNext()
            Integer n = ( ( Integer ) iterator.next() ); //pega o elemento no iterator
            if ( n % 2 == 0 ) {
                System.out.println( "Numero par " + n + " permanece na lista" );
            }
            else {
                System.out.println( "Numero impar " + n + " sai da lista" );
                iterator.remove(); //remove o elemento
            }
        }

        System.out.println( "\nMostrando lista agora soh com numeros pares:" );
        iterator = inteiros.iterator();
        while ( iterator.hasNext() ) {
            Integer n = ( ( Integer ) iterator.next() );
            System.out.println( "-> " + n );
        }
    }

}
