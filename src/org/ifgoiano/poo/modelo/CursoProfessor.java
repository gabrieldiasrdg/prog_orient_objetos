package org.ifgoiano.poo.modelo;

public class CursoProfessor {
    private int idCursoProfessor;
    private String nome;
    private String descricao;

    public CursoProfessor(int idCursoProfessor, String nome, String descricao) {
        this.idCursoProfessor = idCursoProfessor;
        this.nome = nome;
        this.descricao = descricao;
    }

    public int getIdCursoProfessor() {
        return idCursoProfessor;
    }

    public void setIdCursoProfessor(int idCursoProfessor) {
        this.idCursoProfessor = idCursoProfessor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
