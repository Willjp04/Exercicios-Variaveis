package ExercicioEstudante;

public class Estudante {

    public String nome;
    public int idade;
    public double[] notas;

    public void print() {
        System.out.println("Nome " + this.nome);
        System.out.println("idade " + this.idade);
        for(double nota : notas){
            System.out.print(nota+ " ");
           
            
        }
    }

    public void tirarMedia() {
        double media = 0;
        for (double nota : notas) {
            media += nota;
        }
        media = media / notas.length;

        if (media > 6) {
            System.out.println(" A média é " + media + " Situação: APROVADO ");

        } else {
            
            System.out.println(" A média é " + media + " Situação: REPROVADO ");
        }

    }
}
