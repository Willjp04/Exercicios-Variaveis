/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosvariaveis;

/**
 *
 * @author Forceone
 */
public class OperadoresDeAtribuicao {
    public static void main(String[] args) {
        int salario = 2000;
        double comissao = 0.24;
         salario = salario + (salario *= comissao);
        
        
        System.out.println(salario);
        
    }
    
}
