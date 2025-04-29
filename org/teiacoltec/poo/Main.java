package org.teiacoltec.poo;

import org.teiacoltec.poo.animal.Tipos.classe.ave.Ave;
import org.teiacoltec.poo.animal.Tipos.classe.ave.Maritaca;
import org.teiacoltec.poo.animal.Tipos.classe.mamifero.Gato;
import org.teiacoltec.poo.animal.Tipos.classe.mamifero.Mamifero;
import org.teiacoltec.poo.animal.Tipos.classe.mamifero.Urso;
import org.teiacoltec.poo.animal.Tipos.classe.reptil.Cobra;
import org.teiacoltec.poo.animal.Tipos.classe.reptil.Reptil;
import org.teiacoltec.poo.excecoes.AnimalNaoEncontradoException;
import org.teiacoltec.poo.excecoes.IdadeInvalidaException;
import org.teiacoltec.poo.excecoes.JaExisteAnimalException;
import org.teiacoltec.poo.excecoes.NomeInvalidoException;
import org.teiacoltec.poo.excecoes.SomInvalidoException;

public class Main {

    public static void main(String[] args) {
        try{
            testa_classes(); 
            testa_especies();
        } catch (NomeInvalidoException | IdadeInvalidaException | SomInvalidoException | AnimalNaoEncontradoException | JaExisteAnimalException e) {
            System.out.println("Erro ao criar animal: " + e.getMessage());
        }
    }

    public static void testa_classes() throws NomeInvalidoException, IdadeInvalidaException, SomInvalidoException {
        Mamifero mamifero_qualquer = new Mamifero("Simba", 5, "Miau", "curto e brilhoso", false);
        Ave ave_qualquer = new Ave("Zeca", 3, "araurauraura", 43.0, true);
        Reptil reptil_qualquer = new Reptil("Crocodilo", 2, "shshshhs", "ásperas e melequentas");

        // Exibindo informações e ações específicasduda
        Tabela.exibirAnimal(mamifero_qualquer);
        Tabela.exibirAnimal(ave_qualquer);
        Tabela.exibirAnimal(reptil_qualquer);

        System.out.println("\nTESTANDO AS INTENSIDADES");
        mamifero_qualquer.emitirSom(1);
        ave_qualquer.emitirSom(80);
    }

    public static void testa_especies() throws NomeInvalidoException, IdadeInvalidaException, SomInvalidoException, AnimalNaoEncontradoException, JaExisteAnimalException{

        Zoologico zoologico = new Zoologico(4);



        Gato garfild = new Gato("Garfild", 3, "miau", "macio");
        Tabela.exibirAnimal(garfild);
        garfild.brincar();
        garfild.defecar_na_areia();
        Tabela.interagir_animal_domestico(garfild);


        Maritaca louro = new Maritaca("Louro", 3, "ahahahha", 27);
        Tabela.exibirAnimal(louro);
        louro.brincar();
        louro.voarAlto();
        Tabela.interagir_animal_domestico(louro);

        if (garfild.get_nome().equalsIgnoreCase(louro.get_nome())){
            System.out.println("");
        }

        

        //animal[i].getnome.compareToIgnoreCase...(nome)
        

        Cobra duda = new Cobra("Duda", 16, "shsh", "nojenta");
        Tabela.exibirAnimal(duda);
        

        Urso pardo = new Urso("Pardo", 28, "rugido forte e estridente", "macio");
        Tabela.exibirAnimal(pardo);
        

        try {
            zoologico.buscarAnimal("Cachorro");
            zoologico.adicionarAnimal(duda);
            zoologico.adicionarAnimal(pardo);
            zoologico.adicionarAnimal(duda);
            zoologico.adicionarAnimal(louro);
            zoologico.adicionarAnimal(garfild);

        } catch (AnimalNaoEncontradoException | JaExisteAnimalException e) {
            System.out.println("Erro ao buscar animal." + e.getMessage());
        }

    }
}