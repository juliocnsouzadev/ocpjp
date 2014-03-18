package br.com.juliocnsouza.ocpjp.oo_concepts;

import br.com.juliocnsouza.ocpjp.oo_concepts.graphicshape.Circle;

/**
 * @author Júlio César Nunes de Souza
 * @since dd/MM/yyyy
 * @version 1.0
 */
public class Overloaded {

    public static void metodo( int x ) {
        System.out.println( "int" );
    }

    public static void metodo( short x ) {
        System.out.println( "short" );
    }

    public static void metodo( Object x ) {
        System.out.println( "object" );
    }

    public static void metodo( String x ) {
        System.out.println( "String" );
    }

    public static void metodo( long x ) {
        System.out.println( "long" );
    }

    public static void metodo( byte x ) {
        System.out.println( "byte" );
    }

    public static void metodo( double x ) {
        System.out.println( "double" );
    }

    public static void metodo( float x ) {
        System.out.println( "float" );
    }

    public static void main( String[] args ) {
        metodo( 1 );
        metodo( 200 );
        metodo( 1000 );
        metodo( 1000l );
        metodo( 1000.0 );
        metodo( 1000.0f );
        metodo( new Circle() );
        metodo( "S" );

        System.out.println( "\n" );
        byte b = 1;
        short s = 200;
        int i = 1000;
        metodo( b );
        metodo( s );
        metodo( i );

        System.out.println( "\n" );
        Double d1 = 200.0;
        metodo( d1 );
        metodo( d1.doubleValue() );
    }

}
