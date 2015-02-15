package br.com.juliocnsouza.ocpjp._3io_nio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * CriandoDiretorios.java -> Job:
 * <p>
 * @since 15/02/2015
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class CriandoDiretorios {

    public static void main( String[] args )
            throws IOException {
        File jsonDiretorio = new File( "arquivos_json" );
        jsonDiretorio.mkdir();
        File testJson = new File( jsonDiretorio , "test.json" );
        testJson.createNewFile();
        String json = "{nome:'Julio CN Souza'}";
        try ( PrintWriter pw = new PrintWriter( testJson ) ) {
            pw.println( json );
            pw.flush();
        }

        BufferedReader reader = new BufferedReader( new FileReader( testJson ) );
        String linha = reader.readLine();
        while ( linha != null ) {
            System.out.println( linha );
            linha = reader.readLine();
        }
    }

}
