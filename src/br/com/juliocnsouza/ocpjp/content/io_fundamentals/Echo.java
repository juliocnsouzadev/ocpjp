package br.com.juliocnsouza.ocpjp.content.io_fundamentals;

import java.io.Console;

/**
 * Echo.java -> Job:
 * <p>
 * @since 02/06/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class Echo {

    public static void main( String[] args ) {
        String str = " ";
        String[] splited = str.split( " " );
        System.out.println( "-> " + splited.length );

        Console console = System.console();
        /*
         * Se a JVM é invocada indiretamente pela IDE, ou se a JVM é invocada a
         * partir de um processo de background, então o chamada de método
         * System.console () irá falhar e retornar nulo.
         */
        if ( console == null ) {
            System.out.println(
                    "Executando app de uma ide... objeto console nao recuperado" );
        }
        else {
            console.printf( console.readLine() );
        }
    }

}
