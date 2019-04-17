package Funcao;

import Interfaces.Funcoes;

public class ContaPoupanca implements Funcoes {

    //Atributos
    String funcao = "BRADESCO";
    String descricao = "BRADESCO";
    String opcao = "Conta";

    //Metodos
    @Override
    public String getFuncao() {
        return funcao;
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
