/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javacore.introducaometodos.test;

import Javacore.introducaometodos.classes.Calculadora;

/**
 *
 * @author Forceone
 */
public class ParametrosTest {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int num1 = 5;
        int num2 = 10;
        calc.alteraDoisNumeros(num1, num2);
        System.out.println("DENTRO DO TESTE");
        System.out.println("Num1 " + num1);
        System.out.println("Num2 " + num2);

    }

}
