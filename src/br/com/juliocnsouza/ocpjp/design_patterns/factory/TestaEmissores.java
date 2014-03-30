package br.com.juliocnsouza.ocpjp.design_patterns.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * TestaEmissores.java -> Job:
 * <p>
 * @since 30/03/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class TestaEmissores {

    public static void main( String[] args ) {
        EmissorFactory factory = new EmissorFactory();
        List<Emissor> emissores = new ArrayList<>();
        emissores.add( factory.create( EmissorFactory.Tipo.SMS ) );
        emissores.add( factory.create( EmissorFactory.Tipo.EMAIL ) );
        emissores.add( factory.create( EmissorFactory.Tipo.JMS ) );
        for ( Emissor emissor : emissores ) {
            emissor.envia( "Patter Factory" );
        }
    }

}
