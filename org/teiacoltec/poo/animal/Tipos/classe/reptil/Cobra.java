package org.teiacoltec.poo.animal.Tipos.classe.reptil;
import org.teiacoltec.poo.animal.Tipos.AnimalTerrestre;

import org.teiacoltec.poo.excecoes.IdadeInvalidaException;
import org.teiacoltec.poo.excecoes.NomeInvalidoException;
import org.teiacoltec.poo.excecoes.SomInvalidoException;

public class Cobra extends Reptil implements AnimalTerrestre {
    public Cobra(String Nome, int idade, String som, String tipoDeEscama) throws NomeInvalidoException, IdadeInvalidaException, SomInvalidoException {
        super(Nome, idade, som, tipoDeEscama);
    }

    @Override
    public void andar(){
        System.out.println(get_nome() + "está andando");
    }


    public void picar(){
        System.out.println(get_nome() + " picou seu dono e ele se dirigiu ao hospital");
    }
}
