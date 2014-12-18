package oldcodes.class_design.nasted_classes;

/**
 * NastedClasses.java -> Job:
 * <p>
 * @since 24/03/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class NastedClasses {

    //classe estatica aninhada
    static class NastedStaticClass {

        public String atributo;

        public static void doSomething() {
            System.out.println( "De dentro de uma classe estatica aninhada" );
        }

        public void showAtributo() {
            this.atributo = "Hello";
            System.out.println( atributo );
        }

    }

    // inner class
    class InnerClass {

        private String atributo;

        public InnerClass() {
            this.atributo = "Novo atributo";
        }

        public void showAtributo() {
            System.out.println( atributo );
        }

    }

    //local inner class
    public void metodoComInnerClass() {
        class InnerClassEmMetodo {

            private String atributo = "Uhuu!";

            public InnerClassEmMetodo() {
                showAtributo();
            }

            public void showAtributo() {
                System.out.println( atributo );
            }
        }
        new InnerClassEmMetodo();
    }

    public interface ParaClasseAnomina {

        public void mostrarAtributo();
    }

    // inner class anomima
    public ParaClasseAnomina vaiCriarUmaInnerClassParaRetorno() {
        return new ParaClasseAnomina() {

            private String atributo = "Hey Ho, Let's go!";

            @Override
            public void mostrarAtributo() {
                System.out.println( atributo );
            }
        };
    }

    public void chamarMetodoInnerClass() {
        NastedClasses.InnerClass inner = new NastedClasses.InnerClass();
        inner.showAtributo();
    }

    public static void main( String[] args ) {
        NastedClasses.NastedStaticClass.doSomething();
        NastedClasses nastedClasses = new NastedClasses();
        nastedClasses.metodoComInnerClass();
        nastedClasses.vaiCriarUmaInnerClassParaRetorno().mostrarAtributo();
        nastedClasses.chamarMetodoInnerClass();
        InnerClass innerClass = nastedClasses.new InnerClass();
        innerClass.showAtributo();
    }

}
