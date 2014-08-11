package br.com.juliocnsouza.ocpjp.content.io_fundamentals;

import java.io.Console;

/**
 * SpecialCharHandling.java -> Job:
 * <p>
 * @since 12/06/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class SpecialCharHandling {

    public static void main( String[] args ) {
        double d = -19.080808;
        System.out.println( "-> " + String.valueOf( d ) );

// string tem 2 caracteres Scandinavos
        String scandString = "å, ä, and ö";
// tentando exibir caracteres scandinavos diretamente com println
        System.out.println(
                "Printing scands directly with println: " + scandString );
// agora com um objeto console
        Console console = System.console();
        if ( console != null ) {
            console.printf(
                    "Printing scands thro' console's printf method: " + scandString );
        }
    }

}
