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
public class ResourceBundleTest {

    public static void main( String[] args ) {
        Locale localeEN = new Locale( "en" );
        Locale localeFR = new Locale( "fr" );

        ResourceBundle rb = ResourceBundle.getBundle( "Labels" , localeEN );
        System.out.println( rb.getString( "hello" ) );

        rb = ResourceBundle.getBundle( "Labels" , localeFR );
        System.out.println( rb.getString( "hello" ) );

    }

}
