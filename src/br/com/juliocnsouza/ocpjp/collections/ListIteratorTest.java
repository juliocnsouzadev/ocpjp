package br.com.juliocnsouza.ocpjp.collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * ListIteratorTest.java -> Testes com ListIterator:
 * <p>
 * @since 14/04/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class ListIteratorTest {

    public static void main( String[] args ) {
        List<String> lista = new LinkedList<>( Arrays.asList( "PARA FRENTE" ,
                                                              "PARA TRÁS" ) ); //iterface List prove metodo listIterator
        ListIterator<String> listIterator = lista.listIterator(); // ListIterator extends Iterator

        int counter = 0;
        while ( listIterator.hasNext() ) {
            boolean temAnterior = listIterator.hasPrevious();
            String next = null;
            String anterior = null;

            if ( counter > 15 ) {
                System.out.println( "\nCansei..." );
                break;
            }

            System.out.println( "\n1 para frente" );
            for ( int i = 0 ; i < 1 ; i++ ) {
                if ( listIterator.hasNext() ) {//verifica se tem um proximo
                    next = listIterator.next();//chama proximo item
                    System.out.println( next );
                    listIterator.set( "to the front (" + counter + ")" );//troca o valor do chamado no caso next

                }
            }

            System.out.println( "\n1 para trás" );
            for ( int i = 0 ; i < 1 ; i++ ) {
                if ( listIterator.hasPrevious() ) {//verifica se tem um anterior
                    anterior = listIterator.previous();// chama item anterios
                    System.out.println( anterior );
                    listIterator.set( "from behind (" + counter + ")" ); //troca valor do chamado no caso previous
                }
            }

            counter++;

        }
    }

}
