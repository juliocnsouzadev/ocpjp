package br.com.juliocnsouza.ocpjp._1exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * MoreAboutExceptions.java -> Job:
 * <p>
 * @since 07/02/2015
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class MoreAboutExceptions {

    public static void lancaMuitasExcecoes()
            throws SQLException ,
                   IOException ,
                   IllegalAccessException {

    }

    public static void main( String[] args ) {
        // multi catch
        try {
            lancaMuitasExcecoes();
        }
        catch ( SQLException |
                IOException |
                IllegalAccessException e ) {
            Logger.getLogger( HandleManyExceptions.class.getName() ).log( Level.SEVERE , null , e );
        }
        //try with resources
        try ( Reader leitorDoEscopoDoTry = new BufferedReader( new FileReader( "algumArquivo.txt" ) ) ) {
            if ( leitorDoEscopoDoTry != null ) {
                leitorDoEscopoDoTry.read();
            }
        }
        catch ( IOException ioe ) {
            Logger.getLogger( HandleManyExceptions.class.getName() ).log( Level.SEVERE , null , ioe );
        }
    }

}
