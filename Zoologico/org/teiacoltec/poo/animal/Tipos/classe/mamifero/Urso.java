package org.teiacoltec.poo.animal.Tipos.classe.mamifero;

import org.teiacoltec.poo.animal.Tipos.AnimalTerrestre;
import org.teiacoltec.poo.excecoes.IdadeInvalidaException;
import org.teiacoltec.poo.excecoes.NomeInvalidoException;   
import org.teiacoltec.poo.excecoes.SomInvalidoException;

public class Urso extends Mamifero implements AnimalTerrestre{
    public Urso(String nome, int idade, String som, String tipoDePelo) throws NomeInvalidoException, IdadeInvalidaException, SomInvalidoException {
        super(nome, idade, som, tipoDePelo, true);
    }


    public void hibernar(){
        System.out.println(get_nome() + " está hibernando na caverna");
    }

    @Override
    public void andar(){
        System.out.println(get_nome() + "está andando");
    }

}
