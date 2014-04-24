package br.com.juliocnsouza.ocpjp.content.design_patterns.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * ClienteEmailSender.java -> Job:
 * <p>
 * @since 29/03/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class ClienteEmailSender implements Observer {

    @Override
    public void update( Observable o , Object arg ) {
        System.out.println(
                "Cliente criado: " + o + ". Enviando email de confirmação..." );
    }

}
