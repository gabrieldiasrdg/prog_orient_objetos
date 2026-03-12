package org.ifgoiano.poo.modelo;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor(1, "121314",
                "Gabriel da Silva Vieira", "64992765422",
                "gabriel.edu@gmail.com");

        Curso curso = new Curso( "Sistemas de Informação", 1,
                "Curso de tecnologia focado no mercado de trabalho");

        Turma turma = new Turma("2025.1", "123454", new Date(2025,02,17), 1, Curso curso);
    }
}