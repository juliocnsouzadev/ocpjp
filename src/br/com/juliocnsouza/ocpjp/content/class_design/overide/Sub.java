package br.com.juliocnsouza.ocpjp.content.class_design.overide;

/**
 * Sub.java -> Job:
 * <p>
 * @since 05/04/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class Sub extends Base {

    @Override //metodos sobrescritos podem lançar apenas exceções não checadas se o metodo base não lançar
    public void metodo()
            throws RuntimeException {
        super.metodo();
        if ( true ) {
            throw new RuntimeException( "Lançada em tempo de execução" );//essa exceção irá parar a execução
        }
        System.out.println( "Sub" );
    }

    public static void main( String[] args ) {
        new Sub().metodo();
    }
}
