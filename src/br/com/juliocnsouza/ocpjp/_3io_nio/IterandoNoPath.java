package br.com.juliocnsouza.ocpjp._3io_nio;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * IterandoNoPath.java -> Job:
 * <p>
 * @since 06/03/2015
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class IterandoNoPath {

    public static void main( String[] args ) {
        Path path = Paths.get( "testPath" , "pasta1" , "pasta2" , "pasta3" );
        if ( path instanceof Iterable ) {
            System.out.println( "Path implements Iterable<>" );
        }
        for ( Path p : path ) {
            System.out.println( p.getFileName() );
        }
    }

}
