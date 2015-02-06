package br.com.juliocnsouza.ocpjp._1assertions;

/**
 * MoreAboutAssertion.java -> Job:
 * <p>
 * @since 06/02/2015
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class MoreAboutAssertion {

    private static String concatena( String source , String concat ) {
        boolean sourceValida = source != null && !source.isEmpty();
        boolean concatValida = concat != null && !concat.isEmpty();
        assert ( sourceValida );
        assert ( concatValida );
        return source += concat;
    }

    public static void main( String[] args ) {
        String julio = concatena( "Jul" , "io" );
        System.out.println( "> " + julio );

        String error = concatena( "" , "io" );
        System.out.println( "> " + error );
    }

}
