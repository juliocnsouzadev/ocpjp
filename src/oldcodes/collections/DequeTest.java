package oldcodes.collections;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * DequeTest.java -> Job:
 * <p>
 * @since 15/04/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class DequeTest {

    public static String[] nomes = { "Julio" ,
                                     "Rafael" ,
                                     "Wellington" ,
                                     "Guilherme" ,
                                     "Marilia" ,
                                     "Jessica" ,
                                     "Elaine" ,
                                     "Flavio" };

    public static void main( String[] args ) {

        Deque<String> deque = new ArrayDeque<>();
        deque.addAll( Arrays.asList( nomes ) );

        System.out.println( deque );

        boolean offerFirst = deque.offerFirst( "Esse deve ser o primeiro" );
        if ( offerFirst ) {
            System.out.println( "\nNovo deque:\n" + deque );
        }

        boolean offerLast = deque.offerLast( "Esse deve ser o ultimo" );
        if ( offerLast ) {
            System.out.println( "\nNovo deque:\n" + deque );
        }

        String removidoPrimeiro = deque.removeFirst();
        System.out.println(
                "\nDeque depois de removido " + removidoPrimeiro + "\n" + deque );

        String removidoUltimo = deque.removeLast();
        System.out.println(
                "\nDeque depois de removido " + removidoUltimo + "\n" + deque );

        removidoPrimeiro = deque.pollFirst();
        System.out.println(
                "\nDeque depois de removido " + removidoPrimeiro + "\n" + deque );

        removidoUltimo = deque.pollLast();
        System.out.println(
                "\nDeque depois de removido " + removidoUltimo + "\n" + deque );

        System.out.println( "\nPrimeiro do deque " + deque.peekFirst() );

        System.out.println( "\nUltimo do deque " + deque.peekLast() );

    }

}
