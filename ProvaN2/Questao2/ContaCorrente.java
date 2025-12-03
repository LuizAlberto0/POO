package ProvaN2.Questao2;

public class ContaCorrente implements Conta{
    private double saldo;

    public ContaCorrente(){}

    @Override
    public void depositar(double valor) {
        if(valor>0) this.saldo+=valor*0.8;
        else System.out.println("Valor inválido! Somente valores acima de 0 reais.");
    }
    @Override
    public void sacar(double valor) {
        if(valor<=saldo&&valor>=0) saldo-=valor*1.2;
        else System.out.println("Valor inválido! Somente valores acima de 0 ou saldo indisponível!");
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }
}
