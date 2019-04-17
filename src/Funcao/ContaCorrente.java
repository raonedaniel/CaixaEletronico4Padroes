package Funcao;

import Interfaces.Funcoes;

public class ContaCorrente implements Funcoes {

    //Atributos
    String funcao = "BANCO DO BRASIL";
    String descricao = "BANCO DO BRASIL";
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
