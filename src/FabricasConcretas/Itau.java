package FabricasConcretas;

import Funcao.Pagamentos;
import Funcao.Transferencia;
import Interfaces.Funcoes;
import fabricas.FabricaAbstrata;

public class Itau extends FabricaAbstrata {

    public Itau() {
        bandeira = "ITAU";
    }

    public Object[] getListaDeFuncoes() {
        Object[] lista = {"PAGAMENTOS", "TRANSFERENCIA"};
        return lista;
    }

    @Override
    public Funcoes getFuncoes(String opcao) {
        if (opcao == null) {
            return null;
        } else if (opcao.equals("PAGAMENTOS")) {
            return (Funcoes) new Pagamentos();
        } else if (opcao.equals("TRANSFERENCIA")) {
            return (Funcoes) new Transferencia();
        } else {
            return null;
        }
    }
}
