package org.ifgoiano.poo.service;

import org.ifgoiano.poo.modelo.Aluno;
import org.ifgoiano.poo.modelo.Disciplina;

import java.util.List;

public class AlunoServico {
    private Disciplina disciplina;

    public AlunoServico(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public boolean enviarAtividade(Aluno aluno, Disciplina disciplina) {
        System.out.println("Método enviar atividade");
        System.out.println("Aluno: "+ aluno.getNome());
        System.out.println("Disciplina: "+ disciplina.getNome());
        return true;
    }
    public List obterDisciplina(Aluno aluno) {
        System.out.println("Método obter disciplina");
        System.out.println("Aluno: "+ aluno.getNome());
        return null;
    }
}
