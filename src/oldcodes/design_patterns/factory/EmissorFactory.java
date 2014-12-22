package oldcodes.design_patterns.factory;

/**
 * EmissorFactory.java -> Job:
 * <p>
 * @since 30/03/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class EmissorFactory {

    public enum Tipo {

        SMS,
        EMAIL,
        JMS
    }

    public Emissor create( Tipo tipo ) {
        switch ( tipo ) {
            case SMS:
                return new EmissorSMS();
            case EMAIL:
                return new EmissorEmail();
            case JMS:
                return new EmissorJMS();
            default:
                throw new IllegalArgumentException( "Tipo emissor invalido" );
        }
    }
}
