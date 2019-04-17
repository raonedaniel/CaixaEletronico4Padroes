package FabricasConcretas;

import Funcao.Extrato;
import Funcao.Saldo;
import Interfaces.Funcoes;
import fabricas.FabricaAbstrata;

public class Bradesco extends FabricaAbstrata {

    public Bradesco() {
        bandeira = "BRADESCO";
    }

    public Object[] getListaDeFuncoes() {
        Object[] lista = {"EXTRATO", "SALDO"};
        return lista;
    }

    @Override
    public Funcoes getFuncoes(String opcao) {
        if (opcao == null) {
            return null;
        } else if (opcao.equals("EXTRATO")) {
            return (Funcoes) new Extrato();
        } else if (opcao.equals("SALDO")) {
            return (Funcoes) new Saldo();
        } else {
            return null;
        }
    }
}
