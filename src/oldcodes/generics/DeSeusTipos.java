package oldcodes.generics;

/**
 * DeSeusTipos.java -> Job:
 * <p>
 * @since 01/04/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class DeSeusTipos<T1 , T2 , T3 , T4> {

    private T1 value01;

    private T2 value02;

    private T3 value03;

    private T4 value04;

    public DeSeusTipos( T1 value01 , T2 value02 , T3 value03 , T4 value04 ) {
        this.value01 = value01;
        this.value02 = value02;
        this.value03 = value03;
        this.value04 = value04;
    }

    public T1 getValue01() {
        return value01;
    }

    public void setValue01( T1 value01 ) {
        this.value01 = value01;
    }

    public T2 getValue02() {
        return value02;
    }

    public void setValue02( T2 value02 ) {
        this.value02 = value02;
    }

    public T3 getValue03() {
        return value03;
    }

    public void setValue03( T3 value03 ) {
        this.value03 = value03;
    }

    public T4 getValue04() {
        return value04;
    }

    public void setValue04( T4 value04 ) {
        this.value04 = value04;
    }

    @Override
    public String toString() {
        return "DeSeusTipos{" + "value01=" + value01 + ", value02=" + value02 + ", value03=" + value03 + ", value04=" + value04 + '}';
    }

}
