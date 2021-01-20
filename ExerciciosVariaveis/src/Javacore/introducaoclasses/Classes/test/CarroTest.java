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
         
         System.out.println(" ESPECIFICAÇÃO VEICULO ");
           
         
         System.out.println("///////////////////");
         
         
         System.out.println(carro.placa);
         System.out.println(carro.modelo);
         System.out.println(carro.marca);
         System.out.println(carro.cor);
         System.out.println(carro.velocidadeMaxima + " Km");
         
         
    }
    
}
