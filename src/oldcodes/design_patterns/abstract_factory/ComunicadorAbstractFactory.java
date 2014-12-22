package oldcodes.design_patterns.abstract_factory;

/**
 * ComunicadorAbstractFactory.java -> Job:
 * <p>
 * @since 30/03/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public interface ComunicadorAbstractFactory {

    Emissor createEmissor();

    Receptor createReceptor();

}
