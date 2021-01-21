package ExercicioEstudante;
import ExercicioEstudante.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        
        Estudante estudante1 = new Estudante();
        
        estudante1.nome = "Willian ";
        estudante1.idade = 28;
        double[] notas = {6,4,1};
        
        estudante1.notas = notas;
        estudante1.print();
        estudante1.tirarMedia();
    }

    
    
    
    
}
