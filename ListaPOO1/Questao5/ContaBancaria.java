package ListaPOO1.Questao5;

public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;

    public ContaBancaria(){}

    public void setNumero(String numeroConta){
        this.numero = numeroConta;
    }
    public String getNumero(){
        return numero;
    }
    public void setTitular(String nome){
        this.titular = nome;
    }
    public String getTitular(){
        return titular;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public double getSaldo(){
        return saldo;
    }

    public Boolean deposito(double valorDeposito){
        if(valorDeposito>0) {
            System.out.println("Operação realizada com sucesso!");
            saldo+= valorDeposito;
            return true;
        }
        else{
            System.out.println("Operação falhou. Somente valores acima de 0!");
            return false;
        }
    }
    public Boolean saque(double valorSaque){
        if(saldo>0&&valorSaque<saldo&&valorSaque>0){
            System.out.println("Saque realizado com êxito!");
            saldo-=valorSaque;
            return true;
        }
        else return !(saldo <= 0) && !(valorSaque > saldo) && !(valorSaque<0);
    }
    public String exibirSaldo(){
        return "\nNúmero: "+numero+"\nSaldo: R$"+saldo;
    }
    public void telaConta(){
        System.out.println("### Conta de Número "+numero+" ###");
        System.out.println("Titular: "+titular);
        System.out.println("Operações possíveis:");
        System.out.println("(0) - Depósito.");
        System.out.println("(1) - Saque.");
        System.out.println("(2) - Exibir Saldo.");
        System.out.println("(3) - Sair.");
    }
    public String toString(){
        return "Número: "+numero+"\nTitular: "+titular+"\nSaldo: R$"+saldo;
    }
}
