package br.com.juliocnsouza.ocpjp._1assertions_exceptions;

/**
 * ReallySimpleAssertion.java -> Job:
 * <p>
 * @since 22/12/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class ReallySimpleAssertion {

    public double dividirPor2( int paraDividir ) {
        assert ( paraDividir > 0 );
        return paraDividir / 2;
    }

    public static void main( String[] args ) {
        ReallySimpleAssertion reallySimple = new ReallySimpleAssertion();
        double resultado = reallySimple.dividirPor2( 12 );
        System.out.println( "Resultado: " + resultado );
        //resultado = reallySimple.dividirPor2( 0 ); //descomente para ver o AssertionError sendo lançado
        System.out.println( "Resultado: " + resultado );
    }

}
