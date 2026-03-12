package org.ifgoiano.poo.modelo;

public class AlunoDisciplina {

    private int idAlunoDisciplina;
    private Aluno aluno;
    private Disciplina diciplina;
    private Avaliacao avaliacao;

    public int getIdAlunoDisciplina() {
        return idAlunoDisciplina;
    }

    public void setIdAlunoDisciplina(int idAlunoDisciplina) {
        this.idAlunoDisciplina = idAlunoDisciplina;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDiciplina() {
        return diciplina;
    }

    public void setDiciplina(Disciplina diciplina) {
        this.diciplina = diciplina;
    }

    public Avaliacao getNota() {
        return avaliacao;
    }

    public void setNota(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }


}
