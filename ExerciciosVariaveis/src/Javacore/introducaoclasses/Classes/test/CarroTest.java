/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javacore.introducaoclasses.Classes.test;

import Javacore.introducaoclasses.Classes.Carro;

/**
 *
 * @author Forceone
 */
public class CarroTest {

    public static void main(String[] args) {
        Carro carro = new Carro();
         carro.placa = "ABC-123";
         carro.modelo = "CORSA WIND";
         carro.marca = "Chevrolet";
         carro.cor = "Azul";
         carro.velocidadeMaxima = 140;
         System.out.println("------------------");
         
         
         Carro carro2 = new Carro();
         carro2.placa = "AAA-3333";
         carro2.modelo = "FIESTA";
         carro2.marca = "FORD";
         carro2.cor = "PRETO";
         carro2.velocidadeMaxima = 160;
         
         
        
         
         System.out.println(" ESPECIFICAÇÃO VEICULO ");
           
         
         System.out.println("///////////////////");
         
         
        carro.imprime();
        
        
        System.out.println(" ESPECIFICAÇÃO VEICULO ");
         
         carro2.imprime();
       
        
        /* EXERCITANDO MÉTODOS COM PARAMETROS E ARGUMENTOS.
        carro.dadosDoCarro("CDB-7972 ", "CORSA ", "CHEVROLET ", "Azul ", 160);

        System.out.println("--------------------");
        carro.dadosDoCarro("AAA-5558", " UNO ", "FIAT ", "BRANCO ", 170);
        System.out.println("--------------------");
        carro.dadosDoCarro("BBB-8885 ", "FIESTA ", "FORD ", " PRETO ", 180);
        System.out.println("--------------------");

        carro.dadosDoCarro("CCC-1111 ", "GOL ", "Volkswagen ", "CINZA ", 160);*/
    }
    

}
