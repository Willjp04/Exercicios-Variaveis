
package Javacore.introducaoclassestest;
import Javacore.introducaoclasses.Estudante;


public class EstudanteTest {
    public static void main(String[] args) {
        Estudante willian = new Estudante();
        willian.nome = "Willian";
        willian.matricula = "19104745";
        willian.idade = 28;
        
        Estudante graciene = new Estudante();
        graciene.nome = "Graciene";
        graciene.matricula = "E0403294";
        graciene.idade = 25;
        
        System.out.println(willian.nome);
        System.out.println(willian.idade);
        System.out.println(graciene.matricula);
                
        
        System.out.println("//////////////");
        
        
        System.out.println(graciene.nome);
        System.out.println(graciene.idade);
        System.out.println(graciene.matricula);
        
        
        
    }
}
