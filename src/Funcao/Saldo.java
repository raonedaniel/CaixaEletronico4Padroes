package Funcao;

import Interfaces.Funcoes;

public class Saldo implements Funcoes {

    //Atributos
    String Funcao = "BRADESCO";
    String descricao = "SALDO";
    String opcao = "Teste";

    //Metodos
    @Override
    public String getFuncao() {
        return Funcao;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public String getOpcao() {
        return opcao;
    }
}
