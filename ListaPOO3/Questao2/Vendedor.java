package ListaPOO3.Questao2;

public class Vendedor extends Empregado{
    private double valorVendas;
    private int qtdVendas;

    public Vendedor(){}

    public void setValorVendas(double valorVendas) { this.valorVendas = valorVendas; }
    public double getValorVendas() { return this.valorVendas; }
    public void setQtdVendas(int qtdVendas) { this.qtdVendas = qtdVendas; }
    public int getQtdVendas() { return this.qtdVendas; }

    public String toString(){ return "Nome: "+getNome()+" - Salário: R$"+getSalario()+" - Valor das Vendas: R$"
            +this.valorVendas+ " - Qtd de vendas: "+this.qtdVendas; }
}
