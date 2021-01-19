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
public class Arrays2 {

    public static void main(String[] args) {

        int[] idade = new int[3];
        String[] nomes = new String[3];
        nomes[0] = "Helloisa";
        nomes[1] = "Joyce";
        nomes[2] = "Willian";
        idade[0] = 6;
        idade[1] = 25;
        idade[2] = 28;

        System.out.println();
        for (int n = 0; n < nomes.length; n++) {

            System.out.println((n + 1) + " Nome " + nomes[n] + " Tem " );
            

        }
     
        }

    }

}
