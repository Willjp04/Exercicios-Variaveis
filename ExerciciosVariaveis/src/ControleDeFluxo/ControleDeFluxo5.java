/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControleDeFluxo;

/**
 *
 * @author Forceone
 */
public class ControleDeFluxo5 {

    public static void main(String[] args) {
        //Dado um valor de um carro, descubra  em quantas vezes ele pode ser parcelado.
        //Porém as parcelas não podem ser menores do que mil.

        double valorCarro = 30000;
        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela >= 1000) {
                System.out.println("Parcela " + parcela + " R$ " + valorParcela);
            }

        }
    }

}
