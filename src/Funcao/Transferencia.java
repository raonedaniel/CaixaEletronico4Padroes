package Funcao;

import Interfaces.Funcoes;

public class Transferencia implements Funcoes {

    //Atributos
    String Funcao = "BANCO DO BRASIL";
    String descricao = "BANCO DO BRASIL";
    String opcao = "ContaCorrente";

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
