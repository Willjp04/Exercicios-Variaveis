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
public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        //SOMA
        calc.somaDoisNumeros(5,5);
        //SUBTRAÇÃO
        calc.subtraiDoisNumeros(5,5);
        //MULTIPLICAÇÃO
        calc.multiplicaDoisNumeros(10, 10);
        //DIVISÃO
        calc.divideDoisNumeros(10, 2);
    }
    
    
    
}
