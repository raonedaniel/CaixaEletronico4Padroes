package Funcao;

import Interfaces.Funcoes;

public class Extrato implements Funcoes {

    //Atributos
    String funcao = "ITAU";
    String descricao = "ITAU";
    String opcao = "Teste";

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
