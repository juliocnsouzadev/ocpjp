package br.com.juliocnsouza.ocpjp.principios_oo;

/**
 * Planilha.java -> Job:
 * <p>
 * @since 26/03/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class Planilha implements Imprimivel {

    private String[][][][] dadosPlanilha;

    public Planilha() {
        init();
    }

    public void init() {
        dadosPlanilha = new String[ 5 ][ 5 ][ 5 ][ 5 ];
        for ( int a = 0 ; a < 5 ; a++ ) {
            for ( int b = 0 ; b < 5 ; b++ ) {
                for ( int c = 0 ; c < 5 ; c++ ) {
                    for ( int d = 0 ; d < 5 ; d++ ) {
                        dadosPlanilha[a][b][c][d] = "Posição: " + a + b + c + d;
                    }
                }
            }

        }
    }

    @Override
    public void imprimir() {
        System.out.println( "\nImprimindo Planilha" );
        for ( int a = 0 ; a < 5 ; a++ ) {
            for ( int b = 0 ; b < 5 ; b++ ) {
                for ( int c = 0 ; c < 5 ; c++ ) {
                    for ( int d = 0 ; d < 5 ; d++ ) {
                        if ( d < 4 ) {
                            System.out.print( dadosPlanilha[a][b][c][d] + "\t" );
                        }
                        else {
                            System.out.print( dadosPlanilha[a][b][c][d] + "\n" );
                        }
                    }
                }
            }

        }
    }

}
