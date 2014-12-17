package oldcodes.oo_basics;

import java.util.ArrayList;
import java.util.List;

/**
 * Pdf.java -> Job:
 * <p>
 * @since 26/03/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class Pdf implements Imprimivel {

    private List<String> linhas;

    public Pdf() {
        init();
    }

    private void init() {
        linhas = new ArrayList<>();
        for ( int i = 0 ; i < 10 ; i++ ) {
            linhas.add( "Linha " + ( i + 1 ) + " do arquivo pdf." );
        }
    }

    @Override
    public void imprimir() {
        System.out.println( "\nImprimindo PDF" );
        for ( String string : linhas ) {
            System.out.println( string );
        }
    }

}
