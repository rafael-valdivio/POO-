package org.teiacoltec.poo.animal.Tipos.classe.mamifero;

import org.teiacoltec.poo.animal.Tipos.AnimalDomestico;
import org.teiacoltec.poo.animal.Tipos.AnimalTerrestre;
import org.teiacoltec.poo.excecoes.IdadeInvalidaException;
import org.teiacoltec.poo.excecoes.NomeInvalidoException;   
import org.teiacoltec.poo.excecoes.SomInvalidoException;

public class Gato extends Mamifero implements AnimalDomestico, AnimalTerrestre{
    public Gato(String nome, int idade, String som, String tipoDePelo) throws NomeInvalidoException, IdadeInvalidaException, SomInvalidoException {
        super(nome, idade, som, tipoDePelo, true);
    }


    public void defecar_na_areia(){
        System.out.println(get_nome() + " está defecando na caixa de areia.");
    }

    @Override
    public void brincar(){
        System.out.println(get_nome() + " está brincando com sua bolinha de lã favorita.");
    
    }

    @Override
    public void levar_para_passear() {
        System.out.println(get_nome() + " está passeando no parque.");
    }

    @Override
    public void andar(){
        System.out.println(get_nome() + "está andando");
    }

}


