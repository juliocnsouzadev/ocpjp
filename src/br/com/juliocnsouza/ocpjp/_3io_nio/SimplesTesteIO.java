package br.com.juliocnsouza.ocpjp._3io_nio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.Date;
import java.util.Scanner;

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
        lerArquivo( arquivo , false );

        escreverArquivo( arquivo , false , "Estou escrevendo no arquivo em baixo nivel!" ,
                         "Quando você lê-lo novamente vai ver que essa escrita foi feita em " + new Date().toString() ,
                         "-----------------------------" );

        lerArquivo( arquivo , true );

        escreverArquivo( arquivo , true , "Estou escrevendo no arquivo em alto nivel!" ,
                         "Quando você lê-lo novamente vai ver que essa escrita foi feita em " + new Date().toString() ,
                         "-----------------------------" );

        lerArquivo( arquivo , true );
    }

    private static void lerArquivo( String file , boolean altoNivel ) {
        if ( altoNivel ) {
            lerAltoNivel( file );
        }
        else {
            lerBaixoNivel( file );
        }
    }

    private static void lerAltoNivel( String file ) {
        try ( Scanner scanner = new Scanner( new File( file ) ); ) {
            while ( scanner.hasNextLine() ) {
                String linha = scanner.nextLine();
                System.out.println( linha );
            }
        }
        catch ( Exception e ) {
            System.err.println( "Erro: " + e.getMessage() );
        }
    }

    private static void lerBaixoNivel( String file ) {
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

    private static void escreverArquivo( String file , boolean altoNivel , String... linhas ) {
        if ( altoNivel ) {
            escreverAtoNivel( file , linhas );
        }
        else {
            escreverBaixoNivel( file , linhas );
        }
    }

    private static void escreverAtoNivel( String file , String[] linhas ) {
        try ( PrintStream ps = new PrintStream( new File( file ) ); ) {
            if ( linhas != null ) {
                for ( String linha : linhas ) {
                    ps.append( linha );
                    ps.append( "\n" );
                }
            }
        }
        catch ( Exception e ) {
            System.err.println( "Erro: " + e.getMessage() );
        }
    }

    private static void escreverBaixoNivel( String file , String[] linhas ) {
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
