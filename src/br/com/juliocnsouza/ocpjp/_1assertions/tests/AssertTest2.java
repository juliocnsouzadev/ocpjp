package br.com.juliocnsouza.ocpjp._1assertions.tests;

/*
 * A S S E R T I O N S
 */
//Essa classe define o método methodA(int i). Quais declarações de
//methodA(int i) seriam válidas em uma classe filha de AssertTest2?
//(assumindo que assertions estejam habilitadas em tempo de execução.)
public class AssertTest2 {

    public void methodA( int i )
            throws AssertionError {
        assert i < 5114 : "Valor inválido";
    }

}

/*
 * class Filha1 extends AssertTest2 {
 *
 * //a
 *
 * public void methodA( int i ) { } }
 *
 * class Filha2 extends AssertTest2 {
 *
 * //b
 *
 * public void methodA( int i ) throws Exception { } }
 *
 * class Filha3 extends AssertTest2 {
 *
 * //c
 *
 * public void methodA( int i ) throws Throwable { } }
 *
 * class Filha4 extends AssertTest2 {
 *
 * //d.
 *
 * public void methodA( int i ) throws Error { }
 *
 * }
 *
 * class Filha5 extends AssertTest2 {
 *
 * //e
 *
 * public void methodA( int i ) throws RuntimeException { } }
 */
