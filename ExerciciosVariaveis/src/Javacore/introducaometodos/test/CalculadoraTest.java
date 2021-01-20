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
        calc.somaDoisNumeros(5,5);
        calc.subtraiDoisNumeros(5,5);
        calc.multiplicaDoisNumeros(10, 10);
    }
    
    
    
}
