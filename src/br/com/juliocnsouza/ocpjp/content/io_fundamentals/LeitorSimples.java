package br.com.juliocnsouza.ocpjp.content.io_fundamentals;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * LeitorSimples.java -> Job:
 * <p>
 * @since 12/08/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class LeitorSimples {

    public static void main( String[] args ) {
        //arquivos já existentes na raiz do projeto
        List<String> arquivos = Arrays.asList( "a.txt" , "b.txt" );
        for ( String file : arquivos ) {
            try ( FileReader inputFile = new FileReader( file ) ) {
                int ch = 0;
                //ch recebe o valor do char enquanto houver
                while ( ( ch = inputFile.read() ) != -1 ) {
                    //mostra ch convertido em char
                    System.out.print( ( char ) ch );
                }
            }
            catch ( FileNotFoundException ex ) {
                Logger.getLogger( LeitorSimples.class.getName() ).log( Level.SEVERE , null , ex );
            }
            catch ( IOException ex ) {
                Logger.getLogger( LeitorSimples.class.getName() ).log( Level.SEVERE , null , ex );
            }
        }
    }

}
