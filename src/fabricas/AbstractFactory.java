package fabricas;

import Interfaces.Funcoes;
import javax.swing.JOptionPane;

public class AbstractFactory {

    public static void imprimir(Funcoes obj, String bandeira) {
        String saida = "Bandeira: " + bandeira + "\n";
        saida += "Funcao: " + obj.getFuncao() + "\n";
        saida += "Descrição: " + obj.getDescricao() + "\n";
        saida += "Opcao: " + obj.getOpcao();
        JOptionPane.showMessageDialog(null, saida);
    }

    public static void main(String[] args) {
        // TODO code application logic here

        boolean controle1 = true;
        Object tipoDaFabrica;
        Object[] opcoesDeFabricas = FabricaAbstrata.getListaDeFabricas();
        do {
            tipoDaFabrica = JOptionPane.showInputDialog(null,
                    "Deseja finalizar o programa?",
                    "Finalização",
                    JOptionPane.PLAIN_MESSAGE,
                    null, opcoesDeFabricas,
                    opcoesDeFabricas[2]);

            FabricaAbstrata objFabricaAbstrata = FabricaAbstrata.getInstance(tipoDaFabrica.toString());

            String fabrica = objFabricaAbstrata.getBandeira();
            boolean controle2 = true;
            Object objetoDaFuncao;
            Object[] opcoesDeFuncoes = objFabricaAbstrata.getListaDeFabricas();
            do {
                objetoDaFuncao = JOptionPane.showInputDialog(null,
                        "Deseja finalizar o programa?",
                        "Finalização",
                        JOptionPane.PLAIN_MESSAGE,
                        null, opcoesDeFuncoes,
                        opcoesDeFuncoes[0]);
                if (objetoDaFuncao == null) {
                    controle2 = false;
                } else {
                    Funcoes objetoFuncao = objFabricaAbstrata.getFuncoes(objetoDaFuncao.toString());
                    imprimir(objetoFuncao, fabrica);
                }
            } while (controle2);

        } while (controle1);

    }
}
