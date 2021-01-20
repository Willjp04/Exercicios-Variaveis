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
public class ControleDeFluxo6 {

    public static void main(String[] args) {
        double valorCarro = 30000;
        for (int parcela = (int) valorCarro; parcela >= 1; parcela--) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela <= 1000) {
                continue;

            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);

        }
    }
}
