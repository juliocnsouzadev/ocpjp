package br.com.juliocnsouza.ocpjp._2resource_bundle.more;

import br.com.juliocnsouza.ocpjp._2resource_bundle.more.labels.Keys;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * MoreJavaResourceBundle.java -> Job:
 * <p>
 * @since 08/02/2015
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class MoreJavaResourceBundle {

    public static void main( String[] args ) {
        List<Locale> locales = Arrays.asList( Locale.ENGLISH , Locale.FRENCH , Locale.GERMAN ,
                                              Locale.ITALIAN , Locale.JAPANESE );
        for ( Locale locale : locales ) {
            ResourceBundle rb = ResourceBundle.getBundle(
                    "br.com.juliocnsouza.ocpjp._2resource_bundle.more.labels.Saudacao" , locale );
            System.out.println( "Olá, como vai? em "
                    + locale.getDisplayLanguage() + ": "
                    + rb.getObject( Keys.OLA_COMO_VAI.toString() ) );
        }
    }

}
