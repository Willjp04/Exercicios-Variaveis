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
public class ControleDeFluxo1 {

    public static void main(String[] args) {
        int idade = 18;
        int salario = 2000;
        boolean estaComDocumento = true;

        if (idade >= 18 && salario >= 2000 && estaComDocumento == true) {
            System.out.println(" Pode entrar no Clube");

        } else {
            System.out.println("Não pode entrar no clube");
        }

    }
};
