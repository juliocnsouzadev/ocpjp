package br.com.juliocnsouza.ocpjp.content.design_patterns.abstract_factory;

/**
 * EmissorVisa.java -> Job:
 * <p>
 * @since 30/03/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class EmissorMastercard implements Emissor {

    @Override
    public void envia( String msg ) {
        System.out.println( "Enviando msg Mastercard..." );
        System.out.println( msg );
    }

}
