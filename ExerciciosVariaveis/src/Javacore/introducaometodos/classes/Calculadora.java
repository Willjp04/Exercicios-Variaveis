/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javacore.introducaometodos.classes;

/**
 *
 * @author Forceone
 */
public class Calculadora {

    public void somaDoisNumeros(int num1, int num2) {
        System.out.println(num1 + num2);

    }

    public void subtraiDoisNumeros(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);

    }

    public void divideDoisNumeros(int num1, int num2) {
        if (num2 != 0) {
            System.out.println(num1 / num2);
            return;

        }
        System.out.println("ZERO NÃO PODE SER DIVIDIO");

    }

    public void iniciandoCalculadora() {
        System.out.println(" INICIANDO CALCULADORA ");
    }

    public void alteraDoisNumeros(int a, int b) {
        a = 30;
        b = 40;
        System.out.println("DENTRO DO ALTERA DOIS NUMEROS");
        System.out.println("a " + a);
        System.out.println("b " + b);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;

        }
        System.out.println(soma);
    }
    
    //UTILIZAÇÃO DO VAR ARGS
    public void varArgs(int... numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}
