package Javacore.introducaoclasses.Classes;

public class Carro {

    public String placa;
    public String modelo;
    public String marca;
    public String cor;
    public float velocidadeMaxima;
    
    
    public void imprime(){
        System.out.println("-------------");
        System.out.println(this.placa);
        System.out.println(this.modelo);
        System.out.println(this.marca);
        System.out.println(this.cor);
        System.out.println(this.velocidadeMaxima);
       
    }




//MÉTODOS COM PARAMETROS

    public void dadosDoCarro(String placa, String modelo, String marca, String cor, int velocidadeMax) {
        System.out.println("PLACA DO  " + placa + " MODELO " + modelo + " MARCA " + marca + " VELOCIDADE MAX " + velocidadeMax);
    }

}
