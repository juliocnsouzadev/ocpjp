package br.com.juliocnsouza.ocpjp._1assertions.tests;

/*
 * A S S E R T I O N S
 */
//O que irá acontecer ao compilar e executar o código abaixo?
//(assumindo que assertions estejam habilitadas em tempo de execução.)
public class AssertTest {

    private void methodA( int i ) {
        assert i >= 0 : methodB();
        System.out.println( i );
    }

    private String methodB() {
        return "Valor não deve ser negativo";
    }

    public static void main( String[] args ) {
        AssertTest test = new AssertTest();
        test.methodA( -10 );
    }

}
