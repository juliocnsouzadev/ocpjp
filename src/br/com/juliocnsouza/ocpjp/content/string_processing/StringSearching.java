package br.com.juliocnsouza.ocpjp.content.string_processing;

/**
 * StringSearching.java -> Job:
 * <p>
 * @since 24/04/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class StringSearching {

    public static void main( String[] args ) {
        System.out.println( "\n---- Usando indexOf ----" );
        String str = "JULIO";
        int index = str.indexOf( 'U' );
        System.out.println(
                "\nO caracter U se encontra na posição: " + index + " da string " + str );

        String frase = "Estou me preparando para OCJP";
        int indexFrase = frase.indexOf( "para" );
        System.out.println( "\nIndex da palavra \'para\': " + indexFrase );

        String strComPalavrasRepetidas = "Olá passarinho, Olá gatinho, Olá cãozinho, Olá jaburu!";
        int fromIndex = 0;
        while ( strComPalavrasRepetidas.indexOf( "Olá" , fromIndex ) > -1 ) {
            fromIndex = strComPalavrasRepetidas.indexOf( "Olá" , fromIndex );
            System.out.println( "\nOlá em: " + fromIndex );
            fromIndex++;
        }

        System.out.println( "\n---- Usando starsWith ----" );
        String julio = "Julio";
        boolean startsWith = julio.startsWith( "J" );
        System.out.println( "Julio começa com J? " + startsWith );
        startsWith = julio.startsWith( "l" , 2 );
        System.out.println(
                "Em Julio a partir da posição 2 começa com l? " + startsWith );

        System.out.println( "\n---- Usando endsWith ----" );
        boolean endsWith = julio.endsWith( "o" );
        System.out.println( "Julio termina com o? " + endsWith );
    }

}
