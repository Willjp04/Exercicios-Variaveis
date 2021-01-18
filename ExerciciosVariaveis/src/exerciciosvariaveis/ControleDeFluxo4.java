
package exerciciosvariaveis;

public class ControleDeFluxo4 {

    public static void main(String[] args) {
        int contador = 0;
        
       
        
// O WHILE EXECUTA SOMENTE SE FOR TRUE
        while (contador < 10) {
            System.out.println(contador);
            contador++;

        }
       
        

// O DO WHILE EXECUTA SENDO TRUE OU FALSE
      //  do {
         //   System.out.println("AQUI É O VALOR DE DO");

      //  } while (contador < 10);
        
        
        
          // O FOR PODE SE CRIAR UMA VARIAVEL LOCAL E VALIDAR
        for (int i = 0; i < 10; i++) {
            System.out.println("O valor de i é " + i);
            if(i == 5){
                break;
            }
            
           
        }

    }
}
