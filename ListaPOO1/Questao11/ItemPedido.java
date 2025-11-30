package ListaPOO1.Questao11;

public class ItemPedido {
    private String descricao;
    private int quantidade;
    private double precoUnitario;

    public ItemPedido(){}

    public void setDescricao(String descricao) { this.descricao = descricao; }
    public String getDescricao() { return descricao; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }
    public int getQuantidade() { return quantidade; }
    public void setPrecoUnitario(double precoUnitario){ this.precoUnitario = precoUnitario; }
    public double getPrecoUnitario(){ return this.precoUnitario; }
    public double subTotal(){ return this.quantidade*this.precoUnitario; }
    public String toString(){ return "Descrição: "+this.descricao+" - Quantidade: "+this.quantidade+" - Preço unitário: R$"+this.precoUnitario; }
}
