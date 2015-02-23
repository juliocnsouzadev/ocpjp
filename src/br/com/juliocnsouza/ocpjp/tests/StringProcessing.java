package br.com.juliocnsouza.ocpjp.tests;

/**
 * StringProcessing.java -> Job:
 * <p>
 * @since 23/02/2015
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class StringProcessing {

    static void q1() {
        int i = 200;
        double d = 100.00;
        try {
            System.console().format( "%d * %1.1f" , i , d );
        }
        catch ( NullPointerException npe ) {
            System.out.println( "Não há console pela IDE" );
        }

    }

    public static void main( String[] args ) {
        q1();
    }

}
