package oldcodes.io_fundamentals;

import java.io.Console;
import java.util.Arrays;

/**
 * Login.java -> Job:
 * <p>
 * @since 12/06/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class Login {

    public static void main( String[] args ) {
        Console console = System.console();
        if ( console != null ) {
            String userName = null;
            char[] password = null;

            boolean isUser = false;
            boolean isPassword = false;

            while ( !( isUser && isPassword ) ) {
                userName = console.readLine( "Digite seu login: " );
                password = console.readPassword( "Digite sua senha: " );
                isUser = userName.equals( "juliocnsouza" );
                isPassword = new String( password ).equals(
                        "ocpjp" );
                Arrays.fill( password , ' ' );

                if ( isUser && isPassword ) {
                    System.out.println( "login efetuado com sucesso!" );
                }
                else if ( isUser && !isPassword ) {
                    System.out.println( "senha incorreta!" );
                }
                else {
                    System.out.println( "usuário incorreto" );
                }
            }
        }
    }

}
