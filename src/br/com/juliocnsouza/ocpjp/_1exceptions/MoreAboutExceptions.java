package br.com.juliocnsouza.ocpjp._1exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;

/**
 * MoreAboutExceptions.java -> Job:
 * <p>
 * @since 07/02/2015
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class MoreAboutExceptions {

    public static void main( String[] args ) {
        multiCatch();
        tryWithResources();
        la();
    }

    private static void la() {
        try ( PodeSerInstanciadaNoTryWithResources obj = new PodeSerInstanciadaNoTryWithResources() ) {
            throw new Exception( "lançado no try, exceção principal" );
        }
        catch ( Exception e ) {
            System.err.println( e.getMessage() );
            for ( Throwable t : e.getSuppressed() ) {
                System.err.println( "exceção suprimida, lançada pelo close de AutoClosable:" + t );
            }
        }
    }

    static class PodeSerInstanciadaNoTryWithResources implements AutoCloseable {

        @Override
        public void close()
                throws IOException {
            throw new IOException( "Fechando..." );
        }
    }

    private static void tryWithResources() {
        try ( Reader leitorDoEscopoDoTry = new BufferedReader( new FileReader( "algumArquivo.txt" ) ) ) {
            if ( leitorDoEscopoDoTry != null ) {
                leitorDoEscopoDoTry.read();
            }
        }
        catch ( IOException ioe ) {
            System.err.println( ioe.getMessage() );
        }
    }

    private static void lancaMuitasExcecoes()
            throws SQLException ,
                   IOException ,
                   IllegalAccessException {

    }

    private static void multiCatch() {
        try {
            lancaMuitasExcecoes();
        }
        catch ( SQLException |
                IOException |
                IllegalAccessException e ) {
            System.err.println( e.getMessage() );
        }
    }

}
