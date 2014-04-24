package br.com.juliocnsouza.ocpjp.content.collections.compare;

/**
 * Pessoa.java -> Job:
 * <p>
 * @since 15/04/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class Pessoa implements Comparable<Pessoa> { //implementa a interface Comparable

    private String nome;
    private String email;
    private Integer idade;

    public Pessoa() {
        super();
    }

    public Pessoa( String nome , String email , Integer idade ) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome( String nome ) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail( String email ) {
        this.email = email;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade( Integer idade ) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "\n" + nome + " (" + idade + " ano(s)) email: " + email;
    }

    @Override
    public int compareTo( Pessoa o ) {
        return this.nome.compareTo( o.nome ); //comparação de pessoas é feita pelo nome
    }

}
