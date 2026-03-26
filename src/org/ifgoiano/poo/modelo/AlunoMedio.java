package org.ifgoiano.poo.modelo;

public class AlunoMedio extends Aluno {
    private String responsavel;

    public AlunoMedio(String nome, String matricula, String telefone, int idAluno, Turma turma, String responsavel) {
        super(nome, matricula, telefone, idAluno, turma);
        this.responsavel = responsavel;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
}
