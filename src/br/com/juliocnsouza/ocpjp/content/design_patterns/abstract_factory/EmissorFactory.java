package br.com.juliocnsouza.ocpjp.content.design_patterns.abstract_factory;

/**
 * EmissorFactory.java -> Job:
 * <p>
 * @since 30/03/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class EmissorFactory {

    public enum Tipo {

        VISA,
        MASTERCARD
    }

    public Emissor create( Tipo tipo ) {
        switch ( tipo ) {
            case VISA:
                return new EmissorVisa();
            case MASTERCARD:
                return new EmissorMastercard();
            default:
                throw new IllegalArgumentException( "Tipo emissor invalido" );
        }
    }
}
