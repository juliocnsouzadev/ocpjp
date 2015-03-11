package br.com.juliocnsouza.ocpjp._3io_nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

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
        FileTime creationTime = basic.creationTime();
        FileTime lastAccessTime = basic.lastAccessTime();
        FileTime lastModifiedTime = basic.lastModifiedTime();
        mostrar( creationTime , lastAccessTime , lastModifiedTime , basic );

        System.out.println( "\nsetando os atributos de a.txt para a_copy.txt" );
        Path aCopy = Paths.get( "a_copy.txt" );
        BasicFileAttributeView basicView = Files.getFileAttributeView( aCopy ,
                                                                       BasicFileAttributeView.class );
        basicView.setTimes( lastModifiedTime , lastAccessTime , creationTime );
        basic = Files.readAttributes( aCopy , BasicFileAttributes.class );
        creationTime = basic.creationTime();
        lastAccessTime = basic.lastAccessTime();
        lastModifiedTime = basic.lastModifiedTime();
        mostrar( creationTime , lastAccessTime , lastModifiedTime , basic );
    }

    private static void mostrar( FileTime creationTime , FileTime lastAccessTime ,
                                 FileTime lastModifiedTime , BasicFileAttributes basic ) {
        System.out.println( "criado em: " + creationTime );
        System.out.println( "accessado em: " + lastAccessTime );
        System.out.println( "modificado em: " + lastModifiedTime );
        System.out.println( "é diretório? " + basic.isDirectory() );
    }

}
