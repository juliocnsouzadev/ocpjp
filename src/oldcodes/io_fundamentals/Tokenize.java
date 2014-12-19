package oldcodes.io_fundamentals;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Tokenize.java -> Job:
 * <p>
 * @since 12/08/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class Tokenize {

    public static void main( String[] args ) {
        //arquivos já existentes na raiz do projeto
        List<String> arquivos = Arrays.asList( "a.txt" , "b.txt" , "a_copy.txt" , "b_copy.txt" );
        Set<String> words = new TreeSet<>();

        for ( String file : arquivos ) {
            try ( Scanner tokenizingScanner = new Scanner( new FileReader( file ) ) ) {
                //setando para buscar apenas palavras
                tokenizingScanner.useDelimiter( "\\W" );
                while ( tokenizingScanner.hasNext() ) {
                    String word = tokenizingScanner.next();
                    if ( !word.isEmpty() ) {
                        words.add( word );
                    }
                }
            }
            catch ( FileNotFoundException ex ) {
                Logger.getLogger( Tokenize.class.getName() ).log( Level.SEVERE , null , ex );
            }
        }
        for ( String word : words ) {
            //exibindo palavras encontradas sem repetição
            System.out.println( word + "\t" );
        }
    }

}
