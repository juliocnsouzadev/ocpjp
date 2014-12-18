package oldcodes.class_design.app.graphicshape;

/**
 * @author Júlio César Nunes de Souza
 */
public class Circle extends Shape {

    private int xPos, yPos, radius;

    //construtor com valores padrao
    public Circle() {
        this( 20 , 20 , 10 );
    }

    public Circle( int xPos , int yPos , int radius ) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.radius = radius;
    }

    public Circle( int xPos , int yPos ) {
        this( xPos , yPos , 10 );
    }

    public void area() {
        // acessa variavel private dentro da propria classe
        System.out.println( "Area: " + ( 3.14 * radius * radius ) );
    }

    void fillCollor() {
        System.out.println( "Color: " + color ); //acessar varialvel protected da classe mae
    }

    //metodo sobrecarregado com diferente lista de paramentros
    public void fillCollor( int red , int green , int blue ) {

    }

    //metodo sobrecarregado com diferente lista de paramentros
    public void fillCollor( float hue , float saturation , float brightness ) {

    }

    @Override
    public String toString() {
        return "centro = (" + xPos + "," + yPos + ") e raio " + radius;
    }

}
