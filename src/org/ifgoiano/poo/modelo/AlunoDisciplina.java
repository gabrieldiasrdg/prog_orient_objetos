package org.ifgoiano.poo.modelo;

public class AlunoDisciplina {

    private int idAlunoDisciplina;
    private Aluno aluno;
    private Disciplina disciplina;

    public AlunoDisciplina(int idAlunoDisciplina, Aluno aluno, Disciplina disciplina) {
        this.idAlunoDisciplina = idAlunoDisciplina;
        this.aluno = aluno;
        this.disciplina = disciplina;
    }

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

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }


}
