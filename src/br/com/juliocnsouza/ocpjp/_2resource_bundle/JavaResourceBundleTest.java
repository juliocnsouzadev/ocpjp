package br.com.juliocnsouza.ocpjp._2resource_bundle;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * ResourceBundleTest.java -> Job:
 * <p>
 * @since 02/02/2015
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class JavaResourceBundleTest {

    public static void main( String[] args ) {
        Locale localeEn_CA = new Locale( "en" , "CA" );

        ResourceBundle rb = ResourceBundle.getBundle( "Labels" , localeEn_CA );
        System.out.println( rb.getObject( "hello" ) );

    }

}
