package br.com.juliocnsouza.ocpjp.principios_oo;

/**
 * Planilha.java -> Job:
 * <p>
 * @since 26/03/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class Planilha implements Imprimivel {

    private String[][] dadosPlanilha;

    public Planilha() {
        init();
    }

    public void init() {
        dadosPlanilha = new String[ 5 ][ 5 ];
        for ( int a = 0 ; a < 5 ; a++ ) {
            for ( int b = 0 ; b < 5 ; b++ ) {
                String coluna = "";
                switch ( b ) {
                    case 0:
                        coluna = "A";
                        break;

                    case 1:
                        coluna = "B";
                        break;

                    case 2:
                        coluna = "C";
                        break;

                    case 3:
                        coluna = "D";
                        break;

                    case 4:
                        coluna = "E";
                        break;

                }
                if ( a == 0 ) {

                    dadosPlanilha[a][b] = "Coluna: " + coluna;
                }
                else {
                    dadosPlanilha[a][b] = "Celula: " + coluna + a;
                }
            }

        }
    }

    @Override
    public void imprimir() {
        System.out.println( "\nImprimindo Planilha" );
        for ( int a = 0 ; a < 5 ; a++ ) {
            for ( int b = 0 ; b < 5 ; b++ ) {
                if ( b < 4 ) {
                    System.out.print( dadosPlanilha[a][b] + "\t" );
                }
                else {
                    System.out.print( dadosPlanilha[a][b] + "\n" );
                }
            }

        }
    }

}
