package org.ifgoiano.poo.modelo;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        ProfessorEfetivo professor = new ProfessorEfetivo(1, "121314",
                "Gabriel da Silva Vieira", "64992765422",
                "gabriel.edu@gmail.com",1,
                new Date(2026, 3,26), new Date(2027, 3,26 ));

        ProfessorTemporario professor2 = new ProfessorTemporario(1, "121314",
                "João Bueno", "649923323453",
                "joao.edu@gmail.com","1265");


        Curso cursoSuperior = new Curso( "Sistemas de Informação", 1,
                "Curso de tecnologia focado no mercado de trabalho");
        Curso cursoMedio = new Curso( "Ensino Médio", 1,
                "Curso para passar no enem e etc");
        Turma turmaSuperior = new Turma("2025.1", "123454", new Date(2025, 2,17), 1, cursoSuperior);
        Turma turmaMedio = new Turma("2025.1", "123454", new Date(2025, 2,17), 1, cursoMedio);
        Disciplina disciplina = new Disciplina("Programação Orientada a Objetos", 72, "Resumo da Disciplina aqui",
                "Presencial", "1234", 1, professor, turmaSuperior);
        Disciplina disciplina2 = new Disciplina("História", 72, "Resumo da Disciplina aqui",
                "Presencial", "1234", 1, professor2, turmaSuperior);
        CursoProfessor curso = new CursoProfessor(1, "Sistemas de Informação/Gabriel", "Bla bla bla");
        AlunoMedio alunoMedio = new AlunoMedio("José Ruela Filho", "0202510",
                "63992222222", 1, turmaMedio, "José Ruela");
        AlunoSuperior alunoSuperior = new AlunoSuperior("José Ruela Filho", "0202510",
                "63992222222", 1, turmaSuperior);
        AlunoDisciplina alunoDisciplina = new AlunoDisciplina(1, alunoSuperior,
                disciplina);
        Avaliacao avaliacao = new Avaliacao(alunoDisciplina, 5);

    }
}