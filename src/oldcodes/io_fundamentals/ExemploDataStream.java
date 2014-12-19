package oldcodes.io_fundamentals;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * ExemploDataStream.java -> Job:
 * <p>
 * @since 13/08/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class ExemploDataStream {

    public static void main( String[] args ) {
        //escreva alguns dados no arquivo "temp.data"
        try ( DataOutputStream dos
                               = new DataOutputStream( new FileOutputStream( "temp.data" ) ) ) {
            for ( int i = 0 ; i < 10 ; i++ ) {
                dos.writeByte( i );
                dos.writeShort( i );
                dos.writeInt( i );
                dos.writeLong( i );
                dos.writeFloat( i );
                dos.writeDouble( i );
            }

        }
        catch ( FileNotFoundException ex ) {
            Logger.getLogger( ExemploDataStream.class.getName() ).log( Level.SEVERE , null , ex );
        }

        catch ( IOException ex ) {
            Logger.getLogger( ExemploDataStream.class.getName() ).log( Level.SEVERE , null , ex );
        }

        //agora vamos ler os dados escritos
        try ( DataInputStream dis = new DataInputStream( new FileInputStream( "temp.data" ) ) ) {
            for ( int i = 0 ; i < 10 ; i++ ) {
                System.out.printf( "%d %d %d %d %g %g %n" ,
                                   dis.readByte() ,
                                   dis.readShort() ,
                                   dis.readInt() ,
                                   dis.readLong() ,
                                   dis.readFloat() ,
                                   dis.readDouble() );
            }
        }
        catch ( FileNotFoundException ex ) {
            Logger.getLogger( ExemploDataStream.class.getName() ).log( Level.SEVERE , null , ex );
        }
        catch ( IOException ex ) {
            Logger.getLogger( ExemploDataStream.class.getName() ).log( Level.SEVERE , null , ex );
        }
    }

}
