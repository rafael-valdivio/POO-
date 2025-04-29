package org.teiacoltec.poo.animal.Tipos.classe.ave;

import org.teiacoltec.poo.animal.Tipos.AnimalAereo;
import org.teiacoltec.poo.animal.Tipos.AnimalDomestico;

import org.teiacoltec.poo.excecoes.IdadeInvalidaException;
import org.teiacoltec.poo.excecoes.NomeInvalidoException;
import org.teiacoltec.poo.excecoes.SomInvalidoException;
public class Maritaca extends Ave implements AnimalDomestico, AnimalAereo{
    public Maritaca(String nome, int idade, String som, double envergaduraAsas) throws NomeInvalidoException, IdadeInvalidaException, SomInvalidoException {
        super(nome, idade, som, envergaduraAsas, false);
    }
    
    @Override
    public void brincar(){
        System.out.println(get_nome()+" está brincando");
    }
    @Override
    public void levar_para_passear(){
        System.out.println(get_nome()+ " saiu para passear com seu dono");
    }

    @Override
    public void voarAlto(){
        System.out.println(get_nome() + " está voando alto e fugiu de casa");
    }

    public void imitar_humano(){
        System.out.println(get_nome()+" está imitando seu dono");
    }
}