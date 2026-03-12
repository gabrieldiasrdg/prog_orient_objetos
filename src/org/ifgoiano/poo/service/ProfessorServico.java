package org.ifgoiano.poo.service;

import org.ifgoiano.poo.modelo.Aluno;
import org.ifgoiano.poo.modelo.Disciplina;

public class ProfessorServico {
    public boolean lancarNota(Aluno aluno, Disciplina disciplina) {
        System.out.println("Método lançar nota");
        System.out.println("Aluno: "+ aluno.getNome());
        System.out.println("Disciplina: "+ disciplina.getNome());
        return true;
    }

    public boolean lancarPresenca(Aluno aluno, Disciplina disciplina) {
        System.out.println("Método lançar presença");
        System.out.println("Aluno: "+ aluno.getNome());
        System.out.println("Disciplina: "+ disciplina.getNome());
        return true;
    }

    public boolean lancarAtividade(Disciplina disciplina) {
        System.out.println("Método lançar atividade");
        System.out.println("Disciplina: "+ disciplina.getNome());
        return true;
    }

    public boolean lancarPlanoDeEnsino(Disciplina disciplina) {
        System.out.println("Método lançar plano de ensino");
        System.out.println("Disciplina: "+ disciplina.getNome());
        return true;
    }
}

