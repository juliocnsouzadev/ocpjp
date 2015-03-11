package br.com.juliocnsouza.ocpjp._3io_nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * NIOPermissions.java -> Job:
 * <p>
 * @since 11/03/2015
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class WorkingBasicFileAttributes {

    public static void main( String[] args )
            throws IOException {

        Path atxt = Paths.get( "a.txt" );
        BasicFileAttributes basic = Files.readAttributes( atxt , BasicFileAttributes.class );
        System.out.println( "criado em: " + basic.creationTime() );
        System.out.println( "accessado em: " + basic.lastAccessTime() );
        System.out.println( "modificado em: " + basic.lastModifiedTime() );
        System.out.println( "é diretório? " + basic.isDirectory() );
    }

}
