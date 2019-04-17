/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author Raone
 */
public class DadosDaConta {

    private int agencia;
    private long conta;
    private float saldo;

    public DadosDaConta(int agencia, long conta, float saldo) {
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public long getConta() {
        return conta;
    }

    public float getSaldo() {
        return saldo;
    }

}
