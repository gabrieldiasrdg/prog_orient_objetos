package org.ifgoiano.poo.modelo;

import java.util.Date;

public class ProfessorTemporario extends Professor {
    private String numeroEditalConcurso;

    public ProfessorTemporario(int idProfessor, String matricula, String nome,
                            String email, String telefone, String numeroEditalConcurso) {
        super(idProfessor, matricula, nome, email, telefone);
        this.numeroEditalConcurso = numeroEditalConcurso;
    }

    public String getNumeroEditalConcurso() {
        return this.numeroEditalConcurso;
    }

    public void setNumeroEditalConcurso(String numeroEditalConcurso) {
        this.numeroEditalConcurso = numeroEditalConcurso;
    }
}
