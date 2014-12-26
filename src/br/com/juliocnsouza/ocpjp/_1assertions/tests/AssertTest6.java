package br.com.juliocnsouza.ocpjp._1assertions.tests;

/**
 * AssertTest6.java -> Job:
 * <p>
 * @since 26/12/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class AssertTest6 {

    public static void main( String[] args ) {
        for ( int i = 0 ; i < 10 ; i++ ) {
            try {
                assert i % 2 == 0 : i--;
                System.out.println( "try number:\t" + i );
            }
            catch ( AssertionError e ) {
                System.out.println( "catch number:\t" + ++i );
            }
        }
    }

}
