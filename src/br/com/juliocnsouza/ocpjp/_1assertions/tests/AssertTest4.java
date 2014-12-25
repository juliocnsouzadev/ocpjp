package br.com.juliocnsouza.ocpjp._1assertions.tests;

/*
 * A S S E R T I O N S
 */
public class AssertTest4 {

    private static boolean isValid( int i ) {
        return 10 % i > 0;
    }

    public static void main( String[] args ) {
        int i = 0;
        assert isValid( i ) : "Valor Inválido"; 
        		// assert expressao1 : expressao2
        System.out.println( i );
    }

}
