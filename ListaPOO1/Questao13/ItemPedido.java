package ListaPOO1.Questao13;

public class ItemPedido {
    private Produto produto;
    private int quantidade;
    private double precoUnitario;

    public ItemPedido(Produto p){
        this.produto = p;
        this.precoUnitario = p.getPrecoBase()*1.2;
    }

    public Produto getProduto(){ return this.produto; }
    public void setProduto(Produto p){
        this.produto = p;
    }

    public int getQuantidade(){ return this.quantidade; }
    public void setQuantidade(int quantidade){
        if(quantidade<1) throw new IllegalArgumentException("A quantidade de itens deve ser, ao menos, 1.");
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario(){ return this.precoUnitario; }
    public void setPrecoUnitario(double precoUnitario){
        if(precoUnitario<=0) throw new IllegalArgumentException("O preço unitário deve ser, ao menos, maior que 0.");
        this.precoUnitario = precoUnitario;
    }

    public double subTotal(){ return quantidade*precoUnitario; }

    public String toString(){ return "Produto: "+produto+"\nQuantidade: "+quantidade+" - Preço Unitário: R$"+precoUnitario; }
}
