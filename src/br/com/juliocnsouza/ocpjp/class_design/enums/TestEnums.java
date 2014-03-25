package br.com.juliocnsouza.ocpjp.class_design.enums;

/**
 * TestEnums.java -> Job:
 * <p>
 * @since 24/03/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class TestEnums {

    private NomesValidos nomeValido;

    public void setNomeValido( NomesValidos nomeValido ) {
        this.nomeValido = nomeValido;
    }

    public TestEnums( NomesValidos nomeValido ) {
        this.nomeValido = nomeValido;
    }

    public void mostrar() {
        System.out.println(
                "Eu garanto que esse nome é valido! \nNome: " + nomeValido.name() );
    }

    public static void main( String[] args ) {
        TestEnums test = new TestEnums( NomesValidos.JOSE );
        test.mostrar();
        test.setNomeValido( NomesValidos.ANTONIO );
        test.mostrar();
        test.setNomeValido( NomesValidos.MARIA );
        test.mostrar();
    }

}
