
package exerciciosvariaveis;


public class Arrays5 {
    public static void main(String[] args) {
        int [][] dias = new int [2][2];
        dias[0][1] = 30;
        dias[0][1] = 31;
        
        dias[1][0] = 29;
        dias[1][1] = 28;
        for(int[] ref: dias ){
            for(int dia : ref){
                System.out.println(dia);
            }
            
        }
        
    }
}
