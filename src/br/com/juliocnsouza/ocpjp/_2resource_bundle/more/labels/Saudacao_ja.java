package br.com.juliocnsouza.ocpjp._2resource_bundle.more.labels;

import java.util.ListResourceBundle;

/**
 * Saudacao_en.java -> Job:
 * <p>
 * @since 08/02/2015
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class Saudacao_ja extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][]{ { Keys.OLA_COMO_VAI.toString() ,
                                 new StringBuilder( "こんにちは、元気ですか？ ("
                                 + "Kon'nichiwa, genkidesuka?)" ) } };
    }

}
