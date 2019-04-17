package Funcao;

import Interfaces.Funcoes;

public class Pagamentos implements Funcoes {

    //Atributos
    String Funcao = "BRADESCO";
    String descricao = "BRADESCO";
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
