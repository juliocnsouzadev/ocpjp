package br.com.juliocnsouza.ocpjp.content.design_patterns.observer;

/**
 * TestObserver.java -> Job:
 * <p>
 * @since 29/03/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class TestObserver {

    public static void main( String[] args ) {
        Cliente cliente = new Cliente( "Julio" , "juliocnsouzadev@gmail.com" );
        cliente.addObserver( new ClienteEmailSender() );
        cliente.notifyObservers();
    }

}
