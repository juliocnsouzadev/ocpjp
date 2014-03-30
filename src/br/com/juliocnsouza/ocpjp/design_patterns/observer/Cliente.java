package br.com.juliocnsouza.ocpjp.design_patterns.observer;

import java.util.Observable;

/**
 * Cliente.java -> Job:
 * <p>
 * @since 29/03/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class Cliente extends Observable {

    private String nome;

    private String email;

    public Cliente( String nome , String email ) {
        this.nome = nome;
        this.email = email;
    }

    @Override
    public void notifyObservers() {
        setChanged();
        super.notifyObservers();
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

    @Override
    public String toString() {
        return nome + " em@il: " + email;
    }

}
