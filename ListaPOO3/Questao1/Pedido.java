package ListaPOO3.Questao1;

public class Pedido {
    private String nome;
    private double valor;

    public Pedido(){}

    public void setNome(String nome) { this.nome = nome; }
    public String getNome() { return nome; }
    public void setValor(double valor) { this.valor = valor; }
    public double getValor() { return valor; }
    public String toString(){ return "Nome: "+this.nome+" - Valor: R$"+this.valor+"\n"; }
}
