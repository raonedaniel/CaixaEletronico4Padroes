
package observer;

/**
 *
 * @author Raone
 */
public class CaixaEconomicaFederal implements Observador{
    
    private DadosDaConta dados;
    private Sujeito caixaEletronico;  

    public CaixaEconomicaFederal(Sujeito caixaEletronico) {
        this.caixaEletronico = caixaEletronico;
        this.caixaEletronico.incluirObservador(this);
    }
    
    @Override
    public void atualizar(DadosDaConta dados) {
        this.dados = dados;
        mostrarElementos();
    }
    public void mostrarElementos(){
        System.out.println("CAIXA ECONOMICA FEDERAL");
        System.out.println("AGENCIA:" + dados.getAgencia());
        System.out.println("CONTA:" + dados.getConta());
        System.out.println("SALDO:" + dados.getSaldo());
    }
    
    
    
    
}
