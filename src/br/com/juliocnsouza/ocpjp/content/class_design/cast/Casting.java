package br.com.juliocnsouza.ocpjp.content.class_design.cast;

/**
 * Casting.java -> Job:
 * <p>
 * @since 05/04/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class Casting {

    public static void main( String[] args ) {
        Base base = new Base();
        Sub sub = new Sub();
        Sub sub2 = ( Sub ) base; //compila mas lança ClassCastException em tempo de execução
        Object obj = ( Object ) base; // cast explicito desnecessario, ja que base é um Object
        //String str = (String)base; // nao compila estão em uma hierarquia diferente
        String str = ( String ) obj; //compila mas lança ClassCastException em tempo de execução
        Base base2 = ( Base ) sub; // cast explicito desnecessario, ja que sub é um Base
    }

}
