package fabricas;

import FabricasConcretas.Bradesco;
import FabricasConcretas.Itau;
import FabricasConcretas.BancoDoBrasil;
import Interfaces.Funcoes;

public abstract class FabricaAbstrata {

    //Atributos
    protected String bandeira;

    public static Object[] getListaDeFabricas() {
        Object[] lista = {"BANCO DO BRASIL", "ITAU", "BRADESCO"};
        return lista;
    }

    public String getBandeira() {
        return bandeira;
    }

    public abstract Object[] getListaDeFuncoes();

    public abstract Funcoes getFuncoes(String funcoes);

    public static FabricaAbstrata getInstance(String bandeira) {
        if (bandeira == null) {
            return null;
        } else if (bandeira.equals("BANCO DO BRASIL")) {
            return new BancoDoBrasil();
        } else if (bandeira.equals("ITAU")) {
            return new Itau();
        } else if (bandeira.equals("BRADESCO")) {
            return new Bradesco();
        } else {
            return null;
        }
    }
}
