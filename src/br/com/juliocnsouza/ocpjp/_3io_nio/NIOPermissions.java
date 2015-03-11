package br.com.juliocnsouza.ocpjp._3io_nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.util.GregorianCalendar;
import java.util.Random;

/**
 * NIOPermissions.java -> Job:
 * <p>
 * @since 11/03/2015
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class NIOPermissions {

    public static void main( String[] args )
            throws IOException {
        System.out.println( "pegar a data da ultima modificacao:" );
        Path atxt = Paths.get( "a.txt" );
        FileTime fileTime = Files.getLastModifiedTime( atxt );
        System.out.println( fileTime );

        System.out.println( "\ntem permissao para leitura?" );
        System.out.println( Files.isReadable( atxt ) );

        System.out.println( "\ntem permissao para escrever?" );
        System.out.println( Files.isWritable( atxt ) );

        System.out.println( "\ntem permissao para executar?" );
        System.out.println( Files.isExecutable( atxt ) );

        System.out.println( "\nmudar data ultima modificacao:" );
        int ano = 0;
        while ( ano < 1 ) {
            ano = new Random().nextInt( 2015 );
        }
        fileTime = FileTime.fromMillis(
                new GregorianCalendar( ano , GregorianCalendar.JULY , 1 ).getTimeInMillis() );
        Files.setLastModifiedTime( atxt , fileTime );
        System.out.println( fileTime );
    }

}
