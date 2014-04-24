package br.com.juliocnsouza.ocpjp.content.design_patterns.factory;

/**
 * EmissorEmail.java -> Job:
 * <p>
 * @since 30/03/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class EmissorEmail implements Emissor {

    @Override
    public void envia( String msg ) {
        System.out.println( "Enviando msg por email..." );
        System.out.println( msg );
    }

}
