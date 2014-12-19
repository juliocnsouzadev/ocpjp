package oldcodes.io_fundamentals;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @since 12/08/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class CrtlC_CtrlV {

    public static void main( String[] args ) {
        //arquivos já existentes na raiz do projeto
        List<String> arquivos = Arrays.asList( "a.txt" , "b.txt" );
        //os que serão criados
        List<String> copias = Arrays.asList( "a_copy.txt" , "b_copy.txt" );

        int i = 0;
        for ( String file : arquivos ) {

            try ( BufferedReader inputFile = new BufferedReader( new FileReader( file ) ) ;
                    BufferedWriter outputFile = new BufferedWriter(
                            new FileWriter( copias.get( i ) ) ) ) {
                int ch = 0;
                //ch recebe o valor do char enquanto houver
                while ( ( ch = inputFile.read() ) != -1 ) {
                    //escreve no arquivo de copia
                    outputFile.write( ( char ) ch );
                }

            }
            catch ( FileNotFoundException ex ) {
                Logger.getLogger( CrtlC_CtrlV.class.getName() ).log( Level.SEVERE , null , ex );
            }
            catch ( IOException ex ) {
                Logger.getLogger( CrtlC_CtrlV.class.getName() ).log( Level.SEVERE , null , ex );
            }
            i++;
        }

        // conferindo se funcionou por ler as copias
        for ( String file : copias ) {
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
