package ProvaN2.Questao2;

public class ContaPoupanca implements Conta{
    private double saldo;

    public ContaPoupanca(){}

    @Override
    public void depositar(double valor) {
        if(valor>0) this.saldo+=valor;
        else System.out.println("Valor inválido! Somente valores acima de 0 reais.");
    }
    @Override
    public void sacar(double valor) {
        if(valor<=saldo&&valor>=0) saldo-=valor;
        else System.out.println("Valor inválido! Somente valores acima de 0 ou saldo indisponível!");
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }
}
