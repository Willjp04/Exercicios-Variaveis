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
public class TesteExercicioCarro {

    public static void main(String[] args) {
        double valorCarro = 22000;
        int valorEntrada = 8000;
        for (int parcela = (int) valorCarro; parcela >= 1; parcela--) {
            double valorParcela = (valorCarro - valorEntrada) / parcela;
            if (valorParcela >= 500) {
                System.out.println("Parcela " + parcela + " R$ " + valorParcela);

            }

        }
    }

}
