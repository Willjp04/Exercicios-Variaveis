/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javacore.introducaoclasses.Classes.test;

import Javacore.introducaoclasses.Classes.Professor;

/**
 *
 * @author Forceone
 */
public class ProfessorTest {

    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "José Ricardo";
        professor.matricula = "01234";
        professor.rg = "12345678";
        professor.cpf = "4588755644";

        System.out.println("NOME " + professor.nome);
        System.out.println("MATRICULA " + professor.matricula);
        System.out.println("RG " + professor.rg);
        System.out.println("CPF " + professor.cpf);

    }

}
