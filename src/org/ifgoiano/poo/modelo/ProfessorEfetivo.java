package org.ifgoiano.poo.modelo;

import java.util.Date;

public class ProfessorEfetivo extends Professor{
    private Integer numeroContrato;
    private Date dataInicio;
    private Date dataFim;

    public ProfessorEfetivo(int idProfessor, String matricula, String nome,
                            String email, String telefone, Integer numeroContrato, Date dataInicio, Date dataFim) {
        super(idProfessor, matricula, nome, email, telefone);
        this.numeroContrato = numeroContrato;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }


    public Integer getNumeroContrato() {
        return this.numeroContrato;
    }

    public void setNumeroContrato(Integer numeroContrato) {
        this.numeroContrato = numeroContrato;
    }
}
