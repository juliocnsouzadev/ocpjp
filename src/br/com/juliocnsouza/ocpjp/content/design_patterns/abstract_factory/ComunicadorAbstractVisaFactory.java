package br.com.juliocnsouza.ocpjp.content.design_patterns.abstract_factory;

/**
 * ComunicadorAbstractVisaFactory.java -> Job:
 * <p>
 * @since 30/03/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class ComunicadorAbstractVisaFactory implements ComunicadorAbstractFactory {

    @Override
    public Emissor createEmissor() {
        return new EmissorFactory().create( EmissorFactory.Tipo.VISA );
    }

    @Override
    public Receptor createReceptor() {
        return new ReceptorFactory().create( ReceptorFactory.Tipo.VISA );
    }

}
