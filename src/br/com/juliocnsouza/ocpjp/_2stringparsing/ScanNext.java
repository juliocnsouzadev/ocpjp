package br.com.juliocnsouza.ocpjp._2stringparsing;

import java.util.Scanner;

/**
 * ScanNext.java -> Job:
 * <p>
 * @since 01/02/2015
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class ScanNext {

    public static void main( String[] args ) {
        boolean b, b2;
        int i;
        String hits = "";
        String texto = "as coisas eram true para 2 porém deram false para 1";
        Scanner scan1 = new Scanner( texto );
        Scanner scan2 = new Scanner( texto );

        while ( b = scan1.hasNext() ) {
            hits += "\nSó String:\t" + scan1.next();
        }

        while ( b = scan2.hasNext() ) {
            if ( scan2.hasNextInt() ) {
                hits += "\nInteger: \t" + scan2.nextInt();
            }
            else if ( scan2.hasNextBoolean() ) {
                hits += "\nBoolean:\t" + scan2.nextBoolean();
            }

            else {
                hits += "\nString: \t" + scan2.next();
            }
        }
        System.out.println( hits );
    }

}
