package oldcodes.class_design.enums;

/**
 * NomesValidos.java -> Job:
 * <p>
 * @since 24/03/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public enum NomesValidos {

    JOSE( "Jose" ),
    MARIA( "Maria" ),
    ANTONIO( "Antonio" );

    private final String nome;

    NomesValidos( String nome ) {
        this.nome = nome;
    }

}
