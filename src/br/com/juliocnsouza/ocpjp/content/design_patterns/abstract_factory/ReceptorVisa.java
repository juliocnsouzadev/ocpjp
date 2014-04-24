package br.com.juliocnsouza.ocpjp.content.design_patterns.abstract_factory;

/**
 * ReceptorVisa.java -> Job:
 * <p>
 * @since 30/03/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class ReceptorVisa implements Receptor {

    @Override
    public String recebe() {
        System.out.println( "Recebendo msg Visa..." );
        return "Msg Visa";
    }

}
