package Javacore.introducaoclasses.Classes;

public class Carro {

    public String placa;
    public String modelo;
    public String marca;
    public String cor;
    public float velocidadeMaxima;
//MÉTODOS COM PARAMETROS

    public void dadosDoCarro(String placa, String modelo, String marca, String cor, int velocidadeMax) {
        System.out.println(placa + modelo + marca + velocidadeMax);
    }

}
