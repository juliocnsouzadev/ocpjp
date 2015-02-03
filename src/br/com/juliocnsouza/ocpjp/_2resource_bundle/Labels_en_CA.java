package br.com.juliocnsouza.ocpjp._2resource_bundle;

import java.util.ListResourceBundle;

/**
 * Labels_en_CA.java -> Job:
 * <p>
 * @since 03/02/2015
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class Labels_en_CA extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        String chave = "hello";
        StringBuilder valor = new StringBuilder( "do Java" );
        return new Object[][]{
            { chave ,
              valor }
        };
    }

}
