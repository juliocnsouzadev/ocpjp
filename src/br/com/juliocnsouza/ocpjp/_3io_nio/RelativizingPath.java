package br.com.juliocnsouza.ocpjp._3io_nio;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * RelativizingPath.java -> Job:
 * <p>
 * @since 11/03/2015
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class RelativizingPath {

    public static void main( String[] args ) {
        Path diretorio = Paths.get( "/home/musica" );
        Path musica = Paths.get( "/home/musica/rock/NovemberRain.mp3" );
        Path mp3 = diretorio.relativize( musica );
        System.out.println( mp3 );
    }

}
