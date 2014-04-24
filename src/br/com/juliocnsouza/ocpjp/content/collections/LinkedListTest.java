package br.com.juliocnsouza.ocpjp.content.collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

/**
 * LinkedListTest.java -> Job:
 * <p>
 * @since 15/04/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class LinkedListTest {

    public static void otherTest() {
        List<String> planets = new LinkedList<>( Arrays.asList( "Mercurio" ,
                                                                "Venus" ,
                                                                "Terra" ) );
        ListIterator<String> paraFrente = planets.listIterator();
        ListIterator<String> paraTras = planets.listIterator( planets.size() );

        int counter = 0;
        while ( paraFrente.hasNext() && paraTras.hasPrevious() ) {
            counter++;
            String f = paraFrente.next();
            String t = paraTras.previous();
            String qlq = planets.get( new Random().nextInt( planets.size() - 1 ) );
            System.out.println(
                    "\nTentativa " + counter + " comparando " + t + " com " + f + " com " + qlq + "\n" );
            if ( f.equals( t ) && f.equals( qlq ) ) {
                System.out.println(
                        "São iguais : " + f + "\nDepois de " + counter + " tentativas" );
                break;
            }
            if ( paraFrente.hasNext() == false ) {
                paraFrente = planets.listIterator();
            }
            if ( paraTras.hasPrevious() == false ) {

                paraTras = planets.listIterator( planets.size() );
            }
        }
    }

    public static void main( String[] args ) {
        otherTest();
    }

}
