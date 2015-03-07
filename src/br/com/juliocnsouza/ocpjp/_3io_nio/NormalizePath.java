package br.com.juliocnsouza.ocpjp._3io_nio;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * NormalizePath.java -> Job:
 * <p>
 * @since 07/03/2015
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class NormalizePath {

    public static void main( String[] args ) {
        String diretorio = "/dir1/dir2";
        String suba2Niveis = "../..";

        String meuDir = "meudir1/medir2";

        Path path = Paths.get( diretorio , suba2Niveis , meuDir );
        System.out.println( "Original: " + path );
        System.out.println( "Normalizado: " + path.normalize() );
    }

}
