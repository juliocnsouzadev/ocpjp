package br.com.juliocnsouza.ocpjp._3io_nio;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * InfoDoPath.java -> Job:
 * <p>
 * @since 16/02/2015
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class InfoDoPath {

    public static void main( String[] args ) {
        Path path = Paths.get( "/home/juliocnsouza/Projects/OCPJP/nio2_testes/arquivoParaInfo.txt" );
        System.out.println( "path.getFileName(): " + path.getFileName() );
        System.out.println( "path.getNameCount(): " + path.getNameCount() );
        for ( int i = 0 ; i < path.getNameCount() ; i++ ) {
            System.out.println( "path.getName(" + i + "): " + path.getName( i ) );
        }
        System.out.println( "path.getParent(): " + path.getParent() );
        System.out.println( "path.getRoot(): " + path.getRoot() );
        System.out.println( "path.subpath( 0, (path.getNameCount() -1) )" + path.subpath( 0 ,
                                                                                          ( path.getNameCount() - 1 ) ) );
        System.out.println( "path.toString(): " + path.toString() );
    }

}
