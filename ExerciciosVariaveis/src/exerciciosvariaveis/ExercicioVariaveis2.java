/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosvariaveis;
import java.util.Calendar;

public class ExercicioVariaveis2 {
    public static void main(String[] args) {
        //LER A IDADE DA PESSOA EXPRESSA EM ANOS MESES E DIAS 
        // ESCREVA A IDADE DESSA PESSOA EXPRESSA APENAS EM DIAS
        // CONSIDERAR ANO 365 DIAS E MÊS COM 30 DIAS
        
        int idadeJoyce = 25;
        int mesesJoyce = 6;
               
        double anos = 365;
        int mes = 30;
     double idadeEmDias = anos*idadeJoyce;
        
      System.out.println("Joyce tem " + idadeJoyce + " Anos " + mesesJoyce + " Meses "+ "e " + idadeEmDias + " Dias" );

        System.out.println("//////////////");
        
        System.out.println("A idade da Joyce em dias é " + idadeEmDias);
        
                
    }
    
}
