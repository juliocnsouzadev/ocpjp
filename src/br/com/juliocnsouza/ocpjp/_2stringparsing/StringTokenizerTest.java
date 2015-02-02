package br.com.juliocnsouza.ocpjp._2stringparsing;

import java.util.StringTokenizer;

/**
 * StringTokenizerTest.java -> Job:
 * <p>
 * @since 02/02/2015
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class StringTokenizerTest {

    public static void main( String[] args ) {
        String texto = "a1 b-c2 d3 ef-4 g5-";
        StringTokenizer st = new StringTokenizer( texto );

        mostrarTokens( st );

        String delimitador = "-";
        st = new StringTokenizer( texto , delimitador );

        mostrarTokens( st );
    }

    private static void mostrarTokens( StringTokenizer st ) {
        System.out.println( "\n " + st.countTokens() );
        while ( st.hasMoreTokens() ) {
            System.out.println( "-> |" + st.nextToken() + "|" );
        }
        System.out.println( "\n " + st.countTokens() );
    }

}
