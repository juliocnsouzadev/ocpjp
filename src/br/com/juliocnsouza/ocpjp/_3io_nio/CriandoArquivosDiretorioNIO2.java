package br.com.juliocnsouza.ocpjp._3io_nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * CriandoArquivosDiretorioNIO2.java -> Job:
 * <p>
 * @since 16/02/2015
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class CriandoArquivosDiretorioNIO2 {

    public static void main( String[] args )
            throws IOException {
        String nomeArquivo = "arquivoCriadoComNIO2.txt";
        Path arquivo = Paths.get( nomeArquivo );
        boolean exists = Files.exists( arquivo );
        System.out.println( "Existe? " + exists );
        if ( !exists ) {
            Files.createFile( arquivo );
        }
        System.out.println( "Existe agora? " + Files.exists( arquivo ) );
        Files.delete( arquivo );
        System.out.println( "Existe mesmo? " + Files.exists( arquivo ) );

        String estruturaDiretorios = "nio2_testes/arquivosTxt";

        Path diretorio = Paths.get( estruturaDiretorios );//criando na raiz do projeto
        if ( Files.notExists( diretorio ) ) {
            Files.createDirectories( diretorio );
        }

        boolean criouDiretorio = Files.exists( diretorio );
        if ( criouDiretorio ) {
            System.out.println( "criou diretorios: " + estruturaDiretorios );
            arquivo = Paths.get( estruturaDiretorios , nomeArquivo );
            if ( Files.notExists( arquivo ) ) {
                Files.createFile( arquivo );
            }

            boolean criouArquivo = Files.exists( arquivo );
            if ( criouArquivo ) {
                System.out.println(
                        "criou arquivo: " + nomeArquivo + " no diretorio: " + estruturaDiretorios );
                try {
                    Thread.sleep( 15000 );//15 segundos para vc abrir o diretorio e ver o arquivo e pasta sendo  removidos
                    Files.delete( arquivo );
                    Files.deleteIfExists( diretorio );
                }
                catch ( InterruptedException ex ) {
                    System.err.print( "Erro: " + ex.getMessage() );
                }

            }
        }
    }

}
