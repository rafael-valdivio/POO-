//Esta é a classe abstrata, ou seja, que serve para todos os outros animais. El contém informações mais gerais.
package org.teiacoltec.poo.animal;

import org.teiacoltec.poo.excecoes.IdadeInvalidaException;
import org.teiacoltec.poo.excecoes.NomeInvalidoException;
import org.teiacoltec.poo.excecoes.SomInvalidoException;


public abstract class Animal {
    private final String nome;
    private final int idade;
    private final String som;

    //construtor para animais
    public Animal(String nome, int idade, String som) throws NomeInvalidoException, IdadeInvalidaException, SomInvalidoException {
        if (nome == null || nome.isEmpty()) {
            throw new NomeInvalidoException("Nome inválido: " + nome);
        }
        if (idade < 0) {
             throw new IdadeInvalidaException("Idade inválida: " + idade);
        }
        if (som == null || som.isEmpty()) {
             throw new SomInvalidoException("Som inválido: " + som);
         }

        this.nome = nome;
        this.idade = idade;
        this.som = som;
    }

    public String get_nome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void emitirSom() {
        System.out.println("O " + nome + " emite o som: " + som);
    }

    // Sobrecarga do método emitir Som
    public void emitirSom(int intensidade) {
        if (intensidade > 50) {
            System.out.print("O animal cujo nome é " + nome + " está emitindo um som ALTO\n");
        } else {
            System.out.println("O animal cujo nome é " + nome + " está emitindo um som baixo.\n");
        }
    }
}