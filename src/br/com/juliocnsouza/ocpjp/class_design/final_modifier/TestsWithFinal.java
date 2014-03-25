package br.com.juliocnsouza.ocpjp.class_design.final_modifier;

/**
 * @author Júlio César Nunes de Souza
 */
public class TestsWithFinal {

    private final int x;

    private final StringBuilder sb;

    public TestsWithFinal( int x ) {
        this.x = x; // precisa ser inicializado em todos os construtores
        this.sb = new StringBuilder( "inserido via final" ); //o que é final é a referencia ao objeto
    }

    public TestsWithFinal() {
        this( 1 );
    }

    public StringBuilder getSb() {
        return sb;
    }

    public int getFinalInt( final int x ) {
        //x = 0; // nao compila ja que o parametro é final
        return x;
    }

    public static void main( String[] args ) {

        TestsWithFinal testes = new TestsWithFinal();
        System.out.println( "antes de alterar a referencia -> " + testes.getSb() );

        //passando a referencia para outra variavel
        StringBuilder sbMain = testes.getSb();
        sbMain.append( " (adicionado em outra variavel com a mesma referencia)" );
        System.out.println(
                "depois de alterar a referencia -> " + testes.getSb() );
    }

}
