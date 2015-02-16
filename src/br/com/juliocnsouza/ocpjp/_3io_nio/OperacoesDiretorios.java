package br.com.juliocnsouza.ocpjp._3io_nio;

import java.io.File;
import java.io.IOException;

/**
 * OperacoesDiretorios.java -> Job:
 * <p>
 * @since 16/02/2015
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class OperacoesDiretorios {

    public static void main( String[] args )
            throws IOException {
        File diretorioParaRemover = new File( "esse_vai_sumir" );
        if ( diretorioParaRemover.mkdir() ) {
            System.out.println( "criou diretorio que vai sumir" );
        }

        File arquivoParaRemover = new File( diretorioParaRemover , "arquivo_vai_sumir.txt" );
        if ( arquivoParaRemover.createNewFile() ) {
            System.out.println( "criou arquivo que vai sumir" );
        }

        if ( diretorioParaRemover.delete() ) {
            System.out.println( "removou diretorio com arquivo" );
        }
        else {
            System.out.println( "nao removeu diretorio com arquivo" );
        }

        if ( arquivoParaRemover.delete() ) {
            System.out.println( "removeu arquivo" );
            if ( diretorioParaRemover.delete() ) {
                System.out.println( "removeu diretorio vazio" );
            }
        }

        File diretorioVaiMudarNome = new File( "nome_estranho" );
        if ( diretorioVaiMudarNome.mkdir() ) {
            System.out.println( "criou diretorio " + diretorioVaiMudarNome.getName() );
        }

        File novoNomeDiretorio = new File( "nome_legal" );
        if ( diretorioVaiMudarNome.renameTo( novoNomeDiretorio ) ) {
            System.out.println( "nome_estranho agora chama " + novoNomeDiretorio.getName() );
        }

        if ( novoNomeDiretorio.delete() ) {
            System.out.println( "simiu " + novoNomeDiretorio.getName() );
        }

    }

}
