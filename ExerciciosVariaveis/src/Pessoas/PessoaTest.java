package Pessoas;

import Pessoas.PessoaClasse;

public class PessoaTest {

    public static void main(String[] args) {
        PessoaClasse pessoa = new PessoaClasse();
        pessoa.nome = "Graciene da Silva Barros";
        pessoa.rg = "50737170-0";
        pessoa.cpf = "429.485.458-89";
        
        pessoa.imprimePessoa();
        System.out.println("----------------");
        
        PessoaClasse pessoa2 = new PessoaClasse();
        pessoa2.nome = "Willian Sostenes da Silva";
        pessoa2.rg = "49145247-0";
        pessoa2.cpf = "406.997.298-66";
        
        pessoa2.imprimePessoa();

    }
}
