package ListaPOO1.Questao4;

public class Estoque {
    private String nome;
    private int qtdAtual;
    private int qtdMinima;

    public Estoque(){ }
    public Estoque(String nome, int qtdAtual, int qtdMinima){
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }
    public void mudarNome(String nome){
        this.nome = nome;
    }
    public void mudarQtdMinima(int qtdMinima){
        this.qtdMinima = qtdMinima;
    }
    public void repor(int qtd){
        this.qtdAtual = qtd;
    }
    public void darBaixa(int qtd){
        this.qtdAtual -= qtd;
    }
    public String mostra(){
        return "\nNome Produto: "+nome+"\nQuantidade mínima: "+qtdMinima+"\nQuantidade atual: "+qtdAtual;
    }
    public boolean precisaRepor(){
        return qtdAtual <= qtdMinima;
    }
}
