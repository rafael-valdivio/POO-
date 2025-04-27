package org.teiacoltec.poo;

import org.teiacoltec.poo.animal.Animal;
import org.teiacoltec.poo.animal.Tipos.AnimalDomestico;
import org.teiacoltec.poo.animal.Tipos.classe.ave.Ave;
import org.teiacoltec.poo.animal.Tipos.classe.ave.Maritaca;
import org.teiacoltec.poo.animal.Tipos.classe.mamifero.Gato;
import org.teiacoltec.poo.animal.Tipos.classe.mamifero.Mamifero;
import org.teiacoltec.poo.animal.Tipos.classe.mamifero.Urso;
import org.teiacoltec.poo.animal.Tipos.classe.reptil.Cobra;
import org.teiacoltec.poo.animal.Tipos.classe.reptil.Reptil;

public class Tabela{
    public static void exibirAnimal(Animal animal) {
        System.out.println("------------------------------------------------");
        System.out.println("INFORMAÇÕES DO ANIMAL EM ANÁLISE:");
        System.out.println("Nome: " + animal.get_nome());
        System.out.println("Idade: " + animal.getIdade());
        animal.emitirSom();
        caracteristicas_classes(animal);
        System.out.println("------------------------------------------------");
        System.out.println("        FIM DO FICHAMENTO DO ANIMAL             ");
        System.out.println("\n\n\n");
    }





    public static void interagir_animal_domestico(AnimalDomestico animal) {
        System.out.println("Interação com animal doméstico:");
        animal.levar_para_passear();
        animal.brincar();
    }


    //insere na tabela características específicas de classes (mamífero, réptil, aves)
    public static void caracteristicas_classes(Animal animal){
        switch (animal) {
            case Mamifero mamifero -> {
                System.out.println("Tipo de pelo: " + mamifero.get_tipoDePelo());
                mamifero.amamentar();
            }
            case Ave ave -> {
                System.out.println("Envergadura: " + ave.get_envergadura() + " graus");
                ave.voar();
            }
            case Reptil reptil -> {
                System.out.println("Tipo de escama: " + reptil.get_tipodeEscama());
                reptil.rastejar();
            }
            default -> {
                // Aplicar exceções depois
                System.out.println("A classe apresentada não é válida.");
            }
        }
        
    }

// insere na tabela características específicas de espécies (urso, gato, maritaca, etc.)
    public static void caracteristicas_de_especies(Animal animal) {
        switch (animal) {
            case Gato gato -> {
                gato.brincar();
                gato.defecar_na_areia();
            }
            case Maritaca maritaca -> {
                maritaca.brincar();
                maritaca.voarAlto();
            }
            case Urso urso -> {
                System.out.println(urso.get_nome() + " é um urso acima do peso!");
            }
            case Cobra cobra -> {
                System.out.println(cobra.get_nome() + " é uma cobra perigosíssima!");
            }
            default -> {
                System.out.println("A espécie apresentada não é válida.");
            }
    }
}


}