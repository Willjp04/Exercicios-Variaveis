
package Arrays;


public class Arrays3 {
    public static void main(String[] args) {
        //FORMULAS DE SE INICIAR UM ARRAY.
        int[] numeros = new int[5];
        numeros[0]=1;
        numeros[1]=50;
        int[] numeros1 = {1,2,3,4,5}; // INDEX = 0 ATÉ 4.
        int[] numeros2 =  new int []{1,2,3,4,5};
//        for(int i = 0;  i<numeros2.length; i++){
//        System.out.println(numeros2[i]);
        
        for(int aux : numeros){
            System.out.println(aux);
        }
        
    }
    
}
