package br.com.juliocnsouza.ocpjp.cap02.fun_paint;

/**
 * @author Júlio César Nunes de Souza
 */
public class Circulo {

    private int xPos, yPos, radius;

    //construtor com valores padrao
    public Circulo() {
        this.xPos = 20;
        this.yPos = 20;
        this.radius = 10;
    }

    @Override
    public String toString() {
        return "centro = (" + xPos + "," + yPos + ") e raio " + radius;
    }

    public static void main( String[] args ) {
        //metodo toString automaticamente chamado para exibir o objeto
        System.out.println( new Circulo() );
    }

}
