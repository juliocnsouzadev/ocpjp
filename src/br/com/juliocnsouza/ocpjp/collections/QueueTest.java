package br.com.juliocnsouza.ocpjp.collections;

import java.util.LinkedList;
import java.util.Queue;

/**
 * QueueTest.java -> Job:
 * <p>
 * @since 15/04/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class QueueTest {

    public static String[] nomes = { "Julio" ,
                                     "Rafael" ,
                                     "Wellington" ,
                                     "Guilherme" ,
                                     "Marilia" ,
                                     "Jessica" ,
                                     "Elaine" ,
                                     "Flavio" };

    public static void loginELogoutComQueue() {
        //lista FIFO
        Queue<String> loginsNoSistema = new LinkedList<>();
        System.out.println( "\nUsando Queue:" );

        for ( String string : nomes ) {
            loginsNoSistema.add( string );
            System.out.println( string + " está logando no sistema..." );
        }
        while ( !loginsNoSistema.isEmpty() ) {
            System.out.println( loginsNoSistema.remove() + " fazendo logout.." ); //REMOVE O PRIMEIRO QUE ENTROU
        }
    }

    public static void main( String[] args ) {
        loginELogoutComQueue();
    }

}
