package br.com.juliocnsouza.ocpjp._1exceptions;

import java.io.IOException;

/**
 * Suppressed.java -> Job:
 * <p>
 * @since 23/12/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class Suppressed {

    public static void main( String[] args ) {
        try ( One one = new One() ) {
            throw new Exception( "try" );
        }
        catch ( Exception e ) {
            System.err.println( e.getMessage() );
            for ( Throwable t : e.getSuppressed() ) {
                System.err.println( "suppressed:" + t );
            }
        }
        /*
         * Isto diz-nos a exceção que pensávamos que estavam lançando ainda é tratada como mais
         * importante. Java também adiciona quaisquer exceções lançadas pelas close() para um array
         * suppressed na principal exceção. O bloco catch ou chamador pode lidar com qualquer ou de
         * todos estes. Se removermos linha 16 , o código apenas imprime Closing.
         */
    }

}

class One implements AutoCloseable {

    @Override
    public void close()
            throws IOException {
        throw new IOException( "Closing" );
    }
}
