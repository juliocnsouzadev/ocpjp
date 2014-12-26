package br.com.juliocnsouza.ocpjp._1exceptions.tests;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * TryWithResourcesTest.java -> Job:
 * <p>
 * @since 26/12/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class TryWithResourcesTest {

    public static void main( String args[] ) {
        char[] in = new char[ 50 ];
        int size = 0;
        File file = new File( "fileWriter2.txt" );
        try ( FileWriter fw = new FileWriter( file ) ;
                FileReader fr = new FileReader( file ) ) {
            fw.write( "howdy\nfolks\n" );
            size = fr.read( in );
            System.out.print( size + " " );
            for ( char c : in ) {
                System.out.print( c );
            }
        }
        catch ( IOException e ) {
        }
    }
}
