package br.com.juliocnsouza.ocpjp._2stringparsing;

import java.util.Formatter;
import java.util.regex.Pattern;

/**
 * StringProcessingTests.java -> Job:
 * <p>
 * @since 23/02/2015
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class StringProcessingTests {

    static void q1() {
        System.out.println( "\nq1:" );
        int i = 200;
        double d = 100.00;
        try {
            System.console().format( "%d * %1.1f" , i , d );
        }
        catch ( NullPointerException npe ) {
            System.out.println( "Não há console pela IDE" );
        }

    }

    static void q2() {
        System.out.println( "\nq2:" );
        String s = "hello123";
        Formatter f = new Formatter();
        f.format( "%S" , s );
        System.out.println( f );
    }

    static void q3() {
        System.out.println( "\nq3:" );
        String regex = "t n ";
        String input = "TNTtnENTn";
        Pattern p = Pattern.compile( regex , Pattern.CASE_INSENSITIVE | Pattern.COMMENTS );
        String[] items = p.split( input );
        for ( String item : items ) {
            System.out.print( item );
        }
        System.out.println( "" );
    }

    static void q4() {
        System.out.println( "\nq4:" );
        String s1 = "";

        z:
        for ( int x = 2 ; x < 7 ; x++ ) {
            if ( x == 3 ) {
                continue;
            }
            if ( x == 5 ) {
                break z;
            }
            s1 = s1 + x;
        }
        System.out.println( s1 );
    }

    static void q6() {
        System.out.println( "\nq6:" );
        String str1 = "abc";
        str1 += 42;
        System.out.println( str1 );

    }

    static void q9() {
        System.out.println( "\nq9:" );
        StringBuffer s = new StringBuffer( "123456789" );
        s.delete( 0 , 3 ).replace( 1 , 3 , "24" ).delete( 4 , 6 );
        System.out.println( s );

        StringBuilder s1 = new StringBuilder( "123456789" );
        s1.delete( 0 , 3 ).delete( 1 , 3 ).delete( 2 , 4 ).insert( 1 , "24" );
        System.out.println( s1 );
    }

    static void q11() {
        System.out.println( "\nq11:" );
        StringBuffer s = new StringBuffer( "123456789" );
        s.delete( 0 , 3 ).replace( 1 , 3 , "24" ).delete( 4 , 6 );
        System.out.println( s );

    }

    static void q12() {
        System.out.println( "\nq12:" );
        Integer x = 400;
        Integer y = x;
        x++;
        StringBuilder sb1 = new StringBuilder( "123" );
        StringBuilder sb2 = sb1;
        sb1.append( "5" );
        System.out.println( ( x == y ) + " " + ( sb1 == sb2 ) );

    }

    public static void main( String[] args ) {
        q1();
        q2();
        q3();
        q4();
        q6();
        q9();
        q11();
        q12();
    }

}
