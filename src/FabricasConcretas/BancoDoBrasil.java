package FabricasConcretas;

import Funcao.ContaCorrente;
import Funcao.ContaPoupanca;
import Interfaces.Funcoes;
import fabricas.FabricaAbstrata;

public class BancoDoBrasil extends FabricaAbstrata {

    //Metodos
    public BancoDoBrasil() {
        bandeira = "BANCO DO BRASIL";
    }

    public Object[] getListaDeFuncoes() {
        Object[] lista = {"CONTA CORRENTE", "CONTA POUPANCA"};
        return lista;
    }

    @Override
    public Funcoes getFuncoes(String opcao) {
        if (opcao == null) {
            return null;
        } else if (opcao.equals("CONTA CORRENTE")) {
            return (Funcoes) new ContaCorrente();
        } else if (opcao.equals("CONTA POUPANCA")) {
            return (Funcoes) new ContaPoupanca();
        } else {
            return null;
        }
    }
}
