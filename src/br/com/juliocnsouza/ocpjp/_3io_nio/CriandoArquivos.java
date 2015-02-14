package br.com.juliocnsouza.ocpjp._3io_nio;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * CriandoArquivos.java -> Job:
 * <p>
 * @since 14/02/2015
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class CriandoArquivos {

    public static void main( String[] args )
            throws IOException {
        boolean arquivoCriado = false;

        String arquivoTestesjson = "arquivoTestes.json";

        File file = new File( arquivoTestesjson );
        System.out.println( "Existe o arquivo " + arquivoTestesjson + "? " + file.exists() );

        arquivoCriado = file.createNewFile();

        System.out.println( "Arquivo " + arquivoTestesjson + " foi criado? " + arquivoCriado );

        if ( !arquivoCriado ) {
            arquivoTestesjson = "arquivoTestes" + new Date().getTime() + ".json";
            File file2 = new File( arquivoTestesjson );
            arquivoCriado = file2.createNewFile();
            System.out.println( "Arquivo " + arquivoTestesjson + " foi criado? " + arquivoCriado );
            System.out.println( "Existe o arquivo " + arquivoTestesjson + "? " + file.exists() );
        }
    }

}
