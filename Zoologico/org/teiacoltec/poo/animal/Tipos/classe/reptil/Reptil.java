package org.teiacoltec.poo.animal.Tipos.classe.reptil;

import org.teiacoltec.poo.animal.Animal; //include de uma classe
import org.teiacoltec.poo.excecoes.IdadeInvalidaException;
import org.teiacoltec.poo.excecoes.NomeInvalidoException;
import org.teiacoltec.poo.excecoes.SomInvalidoException;

public class Reptil extends Animal {
    private final String tipoDeEscama;

    public Reptil(String nome, int idade, String som, String tipoDeEscama) throws IdadeInvalidaException, NomeInvalidoException, SomInvalidoException {
        super(nome, idade, som);
        this.tipoDeEscama = tipoDeEscama;
    }

    public String get_tipodeEscama(){
        return tipoDeEscama;
    }

    public void rastejar() {
        System.out.println(get_nome() + " está rastejando com escamas " + tipoDeEscama + ".");
    }
}