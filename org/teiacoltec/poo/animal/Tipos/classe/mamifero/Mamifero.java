package org.teiacoltec.poo.animal.Tipos.classe.mamifero;

import org.teiacoltec.poo.animal.Animal;
import org.teiacoltec.poo.excecoes.IdadeInvalidaException;
import org.teiacoltec.poo.excecoes.NomeInvalidoException;
import org.teiacoltec.poo.excecoes.SomInvalidoException;

public class Mamifero extends Animal{ //recebeu de herança todas as caracteristicas de animal
    private final String tipoDePelo;
    private final boolean pode_amamentar;


    public Mamifero(String nome, int idade, String som, String tipoDePelo, boolean pode_amamentar) throws NomeInvalidoException, IdadeInvalidaException, SomInvalidoException {
        super(nome, idade, som);
        this.tipoDePelo = tipoDePelo;
        this.pode_amamentar = pode_amamentar;
    }

    public String get_tipoDePelo(){
        return tipoDePelo;
    }

    public void amamentar() {
        if (pode_amamentar)
            System.out.println(get_nome() + " está amamentando.");
        else
            System.out.println(get_nome() + " não pode amamentar");
    }
}

