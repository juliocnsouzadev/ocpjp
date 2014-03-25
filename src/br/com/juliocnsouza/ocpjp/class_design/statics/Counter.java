package br.com.juliocnsouza.ocpjp.class_design.statics;

import java.util.Random;

/**
 * @author Júlio César Nunes de Souza
 * @since dd/MM/yyyy
 * @version 1.0
 */
public class Counter {

    private static int counterFromClass;

    private int counterFromInstance;

    public Counter() {
        counterFromClass++;
        counterFromInstance++;
    }

    public void showCounters() {
        System.out.println( "\ncounter from the class -> " + counterFromClass );
        System.out.println(
                "counter from the instance -> " + counterFromInstance );
    }

    public static void main( String[] args ) {
        for ( int i = 0 ; i < new Random().nextInt( 100 ) ; i++ ) {
            new Counter().showCounters();
//o incremento do contador da classe é mantido, pois variaveis estáticas pertence a classe e nao a instancia
        }
    }

}
