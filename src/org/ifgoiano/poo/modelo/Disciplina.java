package org.ifgoiano.poo.modelo;

public class Disciplina {
    private String nome;
    private int cargaHoraria;
    private String ementa;
    private String modalidade;
    private String codigo;
    private int idDisciplina;
    private Professor professor;
    private Turma turma;

    public Disciplina(String nome, int cargaHoraria, String ementa, String modalidade, String codigo, int idDisciplina, Professor professor, Turma turma) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.ementa = ementa;
        this.modalidade = modalidade;
        this.codigo = codigo;
        this.idDisciplina = idDisciplina;
        this.professor = professor;
        this.turma = turma;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}