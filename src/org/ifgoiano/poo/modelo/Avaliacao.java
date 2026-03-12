package org.ifgoiano.poo.modelo;

public class Avaliacao {
    private AlunoDisciplina alunoDisciplina;
    private double nota;

    public Avaliacao(AlunoDisciplina alunoDisciplina, double nome) {
        this.alunoDisciplina = alunoDisciplina;
        this.nota = nota;
    }

    public AlunoDisciplina getAlunoDisciplina() {
        return alunoDisciplina;
    }

    public void setAlunoDisciplina(AlunoDisciplina alunoDisciplina) {
        this.alunoDisciplina = alunoDisciplina;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }


}
