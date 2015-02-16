package br.com.juliocnsouza.ocpjp._3io_nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * CopiandoMovendoRemovendoArquivosNIO2.java -> Job:
 * <p>
 * @since 16/02/2015
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class CopiandoMovendoRemovendoArquivosNIO2 {

    public static void main( String[] args )
            throws IOException ,
                   InterruptedException {
        String pastaPrincipal = "nio2_testes";
        String pastaOriginais = pastaPrincipal + "/originais";
        Path diretorioOrigem = Paths.get( pastaOriginais );
        Files.createDirectories( diretorioOrigem );

        Path arquivoOriginal = Paths.get( pastaOriginais + "/original.txt" );
        Files.createFile( arquivoOriginal );

        String pastaCopias = pastaPrincipal + "/copias";
        Path diretorioCopias = Paths.get( pastaCopias );
        Files.createDirectories( diretorioCopias );

        Path arquivoCopia = Paths.get( pastaCopias + "/copia.txt" );
        Files.copy( arquivoOriginal , arquivoCopia );

        System.out.println( "15 segundos para vc ver q os diretorios e as copias foram criadas..." );
        Thread.sleep( 15000 ); //15 segundos para vc ver q os diretorios e as copias foram criadas

        Files.deleteIfExists( arquivoCopia );
        Files.move( arquivoOriginal , arquivoCopia );

        System.out.println( "15 segundos para vc ver q o arquivo foi movido..." );
        Thread.sleep( 15000 ); //15 segundos para vc ver q o arquivo foi movido

        Files.deleteIfExists( arquivoOriginal );
        Files.deleteIfExists( diretorioOrigem );
        Files.deleteIfExists( arquivoCopia );
        Files.deleteIfExists( diretorioCopias );

    }

}
