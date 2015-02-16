package br.com.juliocnsouza.ocpjp._3io_nio;

import java.io.Console;

/**
 * NewConsole.java -> Job:
 * <p>
 * @since 16/02/2015
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class NewConsole {

    public static void main( String[] args ) {
        String nome = "";
        Console c = System.console();
        char[] senha = c.readPassword();

        for ( char ch : senha ) {
            c.format( "%c" , ch );
        }
        c.format( "\n" );

        while ( true ) {
            nome = c.readLine( "%s" , "entrada?: " );
            c.format( "saida: %s \n" , fazerAlgo( nome ) );
        }
    }

    private static String fazerAlgo( String str ) {
        return "Resultado é " + str;
    }

}
