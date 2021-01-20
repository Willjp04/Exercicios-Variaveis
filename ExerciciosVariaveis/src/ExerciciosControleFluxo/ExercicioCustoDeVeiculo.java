/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciciosControleFluxo;

/**
 *
 * @author Forceone
 */
public class ExercicioCustoDeVeiculo {
    public static void main(String[] args) {
        //CUSTO DE FÁBRICA É CUSTO DIST + CUSTO IMPOSTO.
        //CUSTO DO DISTIBUIDOR 28%
        // CUSTO DE IMPOSTOS 45%
        
        int custoFabrica = 30000;
        double custoDist = 0.28;
        double custoImpo = 0.45;
        double soma1;
        double totalComDist;
        double soma2;
        double total;
        
        double valorFinal;
        
        System.out.println("O custo de fábrica do carro é " + "R$ " + custoFabrica + " Reais ");
        
        
        soma1 = custoFabrica * custoDist;
        
        soma2 = custoFabrica * custoImpo;
        
        total = soma1+soma2;
        
        valorFinal = total;
        
       
        
        
        
        System.out.println("O valor Final para o consumidor é " + "R$ " + valorFinal + " Reais");
        
        
        
        
        
        
    }
    
}
