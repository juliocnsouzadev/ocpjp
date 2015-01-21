package br.com.juliocnsouza.ocpjp._2stringparsing;

import java.util.Scanner;

/**
 * BuscaScanner.java -> Job:
 * <p>
 * @since 20/01/2015
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class BuscaScanner {

    public static void main( String[] args ) {
        System.out.print( "Entrada dado: " );
        System.out.flush();//input será 1bcds24dsfs44
        try {
            Scanner s = new Scanner( System.in );
            String tokken;
            do {
                tokken = s.findInLine( "\\d\\d" );
                System.out.println( "Encontrado: " + tokken );
            }
            while ( tokken != null );
        }
        catch ( Exception e ) {
            System.out.println( "Erro:" + e.getMessage() );
        }
    }
    /*
     * Saida esperada: Encontrado: 24 Encontrado: 44 Encontrado: null
     */

}
