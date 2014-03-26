package br.com.juliocnsouza.ocpjp.principios_oo;

import java.util.ArrayList;
import java.util.List;

/**
 * Impressora.java -> Job:
 * <p>
 * @since 26/03/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class Impressora {

    public static void main( String[] args ) {
        List<Imprimivel> filaImpressao = new ArrayList<>();
        filaImpressao.add( new Pdf() );
        filaImpressao.add( new Planilha() );
        filaImpressao.add( new Texto() );
        for ( Imprimivel imprimivel : filaImpressao ) {
            imprimivel.imprimir();
        }
    }

}
