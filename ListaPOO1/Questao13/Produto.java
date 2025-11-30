package ListaPOO1.Questao13;

public class Produto {
    private String sku;
    private String descricao;
    private double precoBase;

    public Produto(String sku, String descricao, double precoBase){
        this.sku = sku;
        this.descricao = descricao;
        this.precoBase = precoBase;
    }

    public String getSku(){ return this.sku; }
    public String getDescricao(){ return this.descricao; }
    public double getPrecoBase(){ return this.precoBase; }

    public String toString(){ return "SKU: "+sku+" - Descrição: "+descricao+" - Preço Base: R$"+precoBase; }
}
