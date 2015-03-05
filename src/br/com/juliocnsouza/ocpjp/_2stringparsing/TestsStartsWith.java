package br.com.juliocnsouza.ocpjp._2stringparsing;

/**
 * TestsIndexOf.java -> Job:
 * <p>
 * @since 24/04/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class TestsStartsWith {

    public static void main( String[] args ) {

        String julio = "Julio";
        boolean startsWith = julio.startsWith( "J" );
        System.out.println( "Julio começa com J? " + startsWith );
        startsWith = julio.startsWith( "l" , 2 );
        System.out.println(
                "Em Julio a partir da posição 2 começa com l? " + startsWith );

    }

}
