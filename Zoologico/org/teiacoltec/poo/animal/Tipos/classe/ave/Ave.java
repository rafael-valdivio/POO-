package org.teiacoltec.poo.animal.Tipos.classe.ave;

import org.teiacoltec.poo.animal.Animal;
import org.teiacoltec.poo.excecoes.IdadeInvalidaException;
import org.teiacoltec.poo.excecoes.NomeInvalidoException; 
import org.teiacoltec.poo.excecoes.SomInvalidoException;



public class Ave extends Animal{
    private final double envergaduraAsas;
    private final boolean pode_voar;
 
    public Ave(String nome, int idade, String som, double envergaduraAsas, boolean pode_voar) throws NomeInvalidoException, IdadeInvalidaException, SomInvalidoException {    
        super(nome, idade, som);
        this.envergaduraAsas = envergaduraAsas;
        this.pode_voar = pode_voar;
    }

    public double get_envergadura(){
        return envergaduraAsas;
    }
 
    public void voar() {
        if (pode_voar) {
            System.out.println(get_nome() + " está voando com envergadura de " + envergaduraAsas + " metros.");
        } else {
            System.out.println(get_nome() + " não pode voar.");
        }
    }

    
 }