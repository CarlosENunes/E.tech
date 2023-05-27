package dev.etech.agencia;

import dev.etech.utils.Utils;

public class Conta {

    private static int contadorConta = 1;
    private int conta;
    private Pessoa titular;
    private String documento;
    private double saldo = 0.0;

    public Conta(PessoaFisica titular){
        this.conta = contadorConta;
        this.titular = titular;
        this.documento = titular.getCpf();
        contadorConta +=1;
    }

    public Conta(PessoaJuridica titular){
        this.conta = contadorConta;
        this.titular = titular;
        this.documento = titular.getCnpj();
        contadorConta +=1;
    }

    public void sacar(double valor){
        if(valor > 0 && this.getSaldo() >= valor){
            setSaldo(getSaldo() - valor);
            System.out.println("Saque no valor de " + Utils.valorDoubleParaString(valor) + "foi realizado com sucesso!");
            System.out.println("Saldo disponivel atualiazo: " + Utils.valorDoubleParaString(getSaldo()));
        }else {
            System.out.println("Você não possui saldo suficiente! Saldo disponivel: " + Utils.valorDoubleParaString(this.getSaldo()));
        }
    }

    public void depositar(double valor){
        if(valor > 0){
            setSaldo(getSaldo() + valor);
            System.out.println("Deposito no valor de " + Utils.valorDoubleParaString(valor) + "foi realizado com sucesso!");
            System.out.println("Saldo em conta: " + Utils.valorDoubleParaString(getSaldo()));
        }else {
            System.out.println("Valor de deposito deve ser maior do que R$0.0");
        }
    }

    public void consultaSaldo(){
        Utils.valorDoubleParaString(getSaldo());
    }

    public void transferir(Conta contaDestino, Double valor){
        if(valor > 0 && this.getSaldo() >= valor){
            this.setSaldo(this.getSaldo() - valor);
            contaDestino.setSaldo((contaDestino.getSaldo() + valor));
            System.out.println("Transferencia no valor de " + Utils.valorDoubleParaString(valor) + " foi realizada com sucesso");
        }else{
            System.out.println("Voce não possui saldo suficiente! Saldo disponivel: " + Utils.valorDoubleParaString(this.getSaldo()));
        }
    }





    protected int getConta() {
        return conta;
    }

    protected void setConta(int conta) {
        this.conta = conta;
    }

    protected Pessoa getTitular() {
        return titular;
    }

    protected void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    protected String getDocumento() {
        return documento;
    }

    protected void setDocumento(String documento) {
        this.documento = documento;
    }

    protected double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "conta=" + conta +
                ", documento='" + documento + '\'' +
                ", saldo=" + Utils.valorDoubleParaString(saldo) +
                '}';
    }
}
