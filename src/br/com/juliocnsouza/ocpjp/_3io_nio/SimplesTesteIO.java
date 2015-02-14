package br.com.juliocnsouza.ocpjp._3io_nio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Date;

/**
 * SimplesTesteIO.java -> Job:
 * <p>
 * @since 14/02/2015
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class SimplesTesteIO {

    public static void main( String[] args ) {
        String arquivo = "simpleTestIO.txt";
        lerArquivo( arquivo );
        escreverArquivo( arquivo , "Estou escrevendo no arquivo!" ,
                         "Quando você lê-lo novamente vai ver que essa escrita foi feita em " + new Date().toString() ,
                         "-----------------------------" );
        lerArquivo( arquivo );
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

    private static void escreverArquivo( String file , String... linhas ) {
        try ( BufferedWriter escritor = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream(
                                new File( file
                                ) ) ) ); ) {
                            if ( linhas != null ) {
                                for ( String linha : linhas ) {
                                    escritor.append( linha );
                                    escritor.newLine();
                                }
                            }

                        }
                        catch ( Exception e ) {
                            System.err.println( "Erro: " + e.getMessage() );
                        }
    }
}
