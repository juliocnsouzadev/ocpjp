package br.com.juliocnsouza.ocpjp._2stringparsing;

/**
 * TestsIndexOf.java -> Job:
 * <p>
 * @since 24/04/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class TestsIndexOf {

    public static void main( String[] args ) {
        String str = "JULIO";
        int index = str.indexOf( 'U' ); //retorna um int com a posição do caracter passado
        System.out.println(
                "\nU está na posição: " + index + " da string " + str );

        String frase = "Estou me preparando para OCJP";
        int indexFrase = frase.indexOf( "para" ); //retorna um int com a posição inicial da string passada
        System.out.println( "\nIndex da palavra \'para\': " + indexFrase );

        String strRepetidas = "Olá passarinho, Olá gatinho, Olá cãozinho, Olá jaburu!";
        int fromIndex = 0;
        while ( strRepetidas.indexOf( "Olá" , fromIndex ) > -1 ) {
            fromIndex = strRepetidas.indexOf( "Olá" , fromIndex );//busca a string a partir da posição do index passado
            System.out.println( "\nOlá em: " + fromIndex );
            fromIndex++;
        }

    }

}
