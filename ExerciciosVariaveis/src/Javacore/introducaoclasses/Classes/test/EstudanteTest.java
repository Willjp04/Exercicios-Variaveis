package Javacore.introducaoclasses.Classes.test;

import Javacore.introducaoclasses.Classes.Estudante;

public class EstudanteTest {

    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        /*  willian.nome = "Willian";
        willian.matricula = "19104745";
        willian.idade = 28;
        
        Estudante graciene = new Estudante();
        graciene.nome = "Graciene";
        graciene.matricula = "E0403294";
        graciene.idade = 25;
        
        
        
        System.out.println(willian.nome);
        System.out.println(willian.idade + " anos");
        System.out.println(willian.matricula);
                
        
        System.out.println("//////////////");
        
        
        System.out.println(graciene.nome);
        System.out.println(graciene.idade+ " anos");
        System.out.println(graciene.matricula);
         */

        //TESTE DE METODOS COM PARAMETROS
        estudante.dadosAluno("Willian", "19104745", 28);
        System.out.println("------------------------");

        estudante.dadosAluno("Graciene", "E0403294", 25);

        System.out.println("------------------------");
        estudante.dadosAluno("Helloisa", "123456", 6);

    }
}
