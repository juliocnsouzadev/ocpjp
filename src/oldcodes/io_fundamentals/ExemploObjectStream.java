package oldcodes.io_fundamentals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * ExemploObjectStream.java -> Job:
 * <p>
 * @since 13/08/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class ExemploObjectStream {

    public static void main( String[] args ) {

        Map<String , String> programadores = new HashMap<>();
        programadores.put( "Julio Cesar" , "Java" );
        programadores.put( "Rafael Bruno" , "Java Script" );
        programadores.put( "Vanessa" , "C#" );
        programadores.put( "Marcelo" , "PHP" );

        try ( ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream( "object.data" ) ) ) {
            oos.writeObject( programadores );
        }
        catch ( FileNotFoundException ex ) {
            Logger.getLogger( ExemploObjectStream.class.getName() ).log( Level.SEVERE , null , ex );
        }
        catch ( IOException ex ) {
            Logger.getLogger( ExemploObjectStream.class.getName() ).log( Level.SEVERE , null , ex );
        }

        try ( ObjectInputStream ois = new ObjectInputStream( new FileInputStream( "object.data" ) ) ) {
            Object obj = ois.readObject();
            //verifica se o obj eh um Map
            if ( obj != null && obj instanceof Map ) {
                Map<String , String> programadoresMobilita = ( Map<String , String> ) obj;
                System.out.println( "Programador \t Especialidade \n" );
                for ( Map.Entry<String , String> programador : programadoresMobilita.entrySet() ) {
                    System.out.printf( "%s \t %s %n" , programador.getKey() , programador.getValue() );
                }
            }
        }
        catch ( FileNotFoundException ex ) {
            Logger.getLogger( ExemploObjectStream.class.getName() ).log( Level.SEVERE , null , ex );
        }
        catch ( IOException |
                ClassNotFoundException ex ) {
            Logger.getLogger( ExemploObjectStream.class.getName() ).log( Level.SEVERE , null , ex );
        }

    }

}
