package br.com.juliocnsouza.ocpjp._3io_nio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * SimplesTesteIO.java -> Job:
 * <p>
 * @since 14/02/2015
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class SimplesTesteIO {

    public static void main( String[] args ) {
        lerArquivo( "simpleTestIO.txt" );
    }

    private static void lerArquivo( String file ) {
        try ( BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(
                                new File( file
                                ) ) ) ); ) {
                            String linha = reader.readLine();
                            while ( linha != null ) {
                                System.out.println( linha );
                                linha = reader.readLine();
                            }
                        }
                        catch ( Exception e ) {
                            System.err.println( "Erro: " + e.getMessage() );
                        }
    }
}
