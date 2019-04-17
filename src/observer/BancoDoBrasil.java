
package observer;

/**
 *
 * @author Raone
 */
public class BancoDoBrasil implements Observador{
    
    private DadosDaConta dados;
    private Sujeito caixaEletronico;  

    public BancoDoBrasil(Sujeito caixaEletronico) {
        this.caixaEletronico = caixaEletronico;
        this.caixaEletronico.incluirObservador(this);
    }
    
    @Override
    public void atualizar(DadosDaConta dados) {
        this.dados = dados;
        mostrarElementos();
    }
    public void mostrarElementos(){
        System.out.println("BANCO DO BRASIL");
        System.out.println("AGENCIA:" + dados.getAgencia());
        System.out.println("CONTA:" + dados.getConta());
        System.out.println("SALDO:" + dados.getSaldo());
    }
    
    
    
    
}
