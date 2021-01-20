/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author Forceone
 */
public class TesteArraysMultidimensionais {
    public static void main(String[] args) {
        String[][] nomes = {{"Helloisa","Joyce","Willian"}};
        for(String[] lista : nomes){
            for(String n : lista){
                System.out.println(n);
            }
        }
    }
    
}
