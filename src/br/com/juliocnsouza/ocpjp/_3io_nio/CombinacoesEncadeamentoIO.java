package br.com.juliocnsouza.ocpjp._3io_nio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Arrays;
import java.util.List;

/**
 * CombinacoesEncadeamentoIO.java -> Job:
 * <p>
 * @since 14/02/2015
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class CombinacoesEncadeamentoIO {

    public static void main( String[] args )
            throws IOException {
        File file = new File( "CombinacoesEncadeamentoIO.txt" ); //tudo começa com um file

        FileWriter fw1 = new FileWriter( file );// pode ser construido de file
        String combinacoesEncadeamentoIO2txt = "CombinacoesEncadeamentoIO2.txt";
        FileWriter fw2 = new FileWriter( combinacoesEncadeamentoIO2txt );// pode ser construido de uma string
        BufferedWriter bw = new BufferedWriter( fw1 ); //pode ser construido apenas de um Writer

        PrintWriter pw1 = new PrintWriter( file ); //pode ser construido de um file
        PrintWriter pw2 = new PrintWriter( combinacoesEncadeamentoIO2txt ); //pode ser construido de uma string
        PrintWriter pw3 = new PrintWriter( fw2 ); //pode ser construido de um Writer

        FileOutputStream fos = new FileOutputStream( file );
        PrintWriter pw4 = new PrintWriter( fos ); //pode ser construido de um OutputString

        List<Writer> writers = Arrays.asList( fw1 , fw2 , bw , pw1 , pw2 , pw3 , pw4 );

        for ( Writer writer : writers ) {
            writer.write( "Escrevendo de um " + writer.getClass() + "\n" );
            writer.flush();

        }

        FileReader fr1 = new FileReader( file );
        FileReader fr2 = new FileReader( combinacoesEncadeamentoIO2txt );

        BufferedReader br1 = new BufferedReader( fr1 );
        BufferedReader br2 = new BufferedReader( fr2 );

        List<Reader> readers = Arrays.asList( fr1 , fr2 , br1 , br2 );
        for ( Reader reader : readers ) {
            if ( reader instanceof BufferedReader ) {
                System.out.println( "BufferedReader: " + ( ( BufferedReader ) reader ).readLine() );
            }
            else {
                char[] sequence = new char[ 150 ];
                reader.read( sequence );
                System.out.println( "FileReader: " + new String( sequence ) );
            }
        }

    }

}
