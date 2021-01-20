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
public class TesteExercicioValidacao {

    public static void main(String[] args) {
        //COMPRAR APARTAMENTO.
        double valorApto = 350000;
        int valorEntrada = 50000;
        int quantidadeParcelas = 149;
        int anos = 12;
        int idadeAtual = 25;
        for (int parcela = (int) valorApto; parcela >= 1; parcela--) {
            double valorParcela = (valorApto - valorEntrada) / parcela;
            if (valorParcela <= 2000) {
                continue;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);

        }
        anos = quantidadeParcelas / anos;
        System.out.println("Parcelando em " + quantidadeParcelas + " VEZES " + " Você pagará por " + anos + " ANOS ");
        System.out.println("Você estando com " + idadeAtual + " Anos" + " Você quitará o apto com " + (idadeAtual + 12 + " Anos "));

    }

}
