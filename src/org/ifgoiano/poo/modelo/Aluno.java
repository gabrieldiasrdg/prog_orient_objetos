package org.ifgoiano.poo.modelo;

public class Aluno {
    private String nome;
    private String matricula;
    private String telefone;
    private int idAluno;
    private Turma turma;

    public Aluno(String nome, String matricula, String telefone, int idAluno, Turma turma) {
        this.nome = nome;
        this.matricula = matricula;
        this.telefone = telefone;
        this.idAluno = idAluno;
        this.turma = turma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}