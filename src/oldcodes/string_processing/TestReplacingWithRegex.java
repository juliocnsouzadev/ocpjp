package oldcodes.string_processing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * TestReplacingWithRegex.java -> Job:
 * <p>
 * @since 21/05/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class TestReplacingWithRegex {

    public static void main( String[] args ) {
        String regexIP01 = "^((25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]{1,2})\\.){3}(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]{1,2})$";
        String regexIP02 = "\\b((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)(\\.)){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\b";
        String ip = "O ip é: 255.245.188.123";

        Pattern pattern = Pattern.compile( regexIP02 ); //188.188.123
        Matcher matcher = pattern.matcher( ip );

        String testReplace = matcher.replaceAll( "pegadinha do malandro" );

        System.out.println( ip + " é um ip? " + ( matcher.matches()
                                                  ? "Sim"
                                                  : "Não" ) );

        System.out.println( "-> " + testReplace );

    }

}
