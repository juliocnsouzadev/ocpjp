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

// string has three Scandinavian characters
        String scandString = "å, ä, and ö";
// try printing scandinavian characters directly with println
        System.out.println(
                "Printing scands directly with println: " + scandString );
// now, get the Console object and print scand characters thro' that
        Console console = System.console();
        console.printf(
                "Printing scands thro' console's printf method: " + scandString );
    }

}
