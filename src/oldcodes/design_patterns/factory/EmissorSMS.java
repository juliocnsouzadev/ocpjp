package oldcodes.design_patterns.factory;

/**
 * EmissorSMS.java -> Job:
 * <p>
 * @since 30/03/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class EmissorSMS implements Emissor {

    @Override
    public void envia( String msg ) {
        System.out.println( "Enviando msg por SMS..." );
        System.out.println( msg );
    }

}
