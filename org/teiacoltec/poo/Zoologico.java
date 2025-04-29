package org.teiacoltec.poo;

import org.teiacoltec.poo.animal.Animal;
import org.teiacoltec.poo.excecoes.*;

public class Zoologico {
    //atributo animal que armazena os animal
    private final Animal[] animais;
    private int numero_animais=4;
    private int index;
    private boolean existe;

    public Zoologico(int numero_animais){
        animais = new Animal[numero_animais];
        this.numero_animais = numero_animais;
        index = 0;
    }
    
    void adicionarAnimal(Animal animal) throws JaExisteAnimalException, AnimalNaoEncontradoException{
        boolean aux = false;
        aux = buscarAnimal(animal.get_nome());
        if (aux){
            throw new JaExisteAnimalException("O animal já existe");
        }
        animais[index] = animal;     
        index++;
        
    }
    

    void removerAnimal(Animal animal){
        int aux = index_animal(animal.get_nome());
        animais[aux] = animais[numero_animais - 1];
        animais[numero_animais-1] = null;
        numero_animais--;
    }


    int index_animal(String nome){
        int index_aux_animal =0 ;
        for (int i=0; i < index; i++){
            if (animais[i].get_nome().compareToIgnoreCase(nome) == 0){
                index_aux_animal = i;
                break;
            }
        }
        return index_aux_animal;
    }


    public boolean buscarAnimal(String nome) throws AnimalNaoEncontradoException{
        existe = false;
        for (int i=0; i < index; i++){
            if (animais[i].get_nome().compareToIgnoreCase(nome) == 0){
                existe = true;
                break;
            }
            
        }
        if (!existe) {
            throw new AnimalNaoEncontradoException("O animal não foi existe.");
        }
        return existe;
    }



    void listarAnimais(){
        for (int i=0; i<index; i++){
            System.out.println(animais[i]);
        }
    }



    // void removerAnimal(String nome){
    //     private Animal[] animais_atualizado;
    //     System.arraycopy(this, index, this, index, index);
    // }

    //ultima posicao -> == posicao que quero tirar -> ultima posicao == null -> numero_animais--

    // void buscarAnimal(){}; String compareto 
    // void listarAnimais(){};






    //for (int i; i < animais.length; i++{ tabela.exibiranimal()})
}
