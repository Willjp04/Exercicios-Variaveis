/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OperadoresJava;

/**
 *
 * @author Forceone
 */
public class OperadoresLogicos {
    public static void main(String[] args) {
        int idade = 18;
        float salario = 2000f;
        float comissao = 20f;
        
        System.out.println(idade == 18 || salario <= 3000 || comissao > 20);
    }
}
