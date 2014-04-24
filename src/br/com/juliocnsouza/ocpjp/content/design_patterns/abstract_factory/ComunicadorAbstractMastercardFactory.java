package br.com.juliocnsouza.ocpjp.content.design_patterns.abstract_factory;

/**
 * ComunicadorVisaFactory.java -> Job:
 * <p>
 * @since 30/03/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class ComunicadorAbstractMastercardFactory implements ComunicadorAbstractFactory {

    @Override
    public Emissor createEmissor() {
        return new EmissorFactory().create( EmissorFactory.Tipo.MASTERCARD );
    }

    @Override
    public Receptor createReceptor() {
        return new ReceptorFactory().create( ReceptorFactory.Tipo.MASTERCARD );
    }

}
