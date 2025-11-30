package ListaPOO3.Questao4;

public class Animal {
    private String nome;
    private int idade;

    public Animal(){}

    public void setNome(String nome) { this.nome = nome; }
    public String getNome() { return this.nome; }
    public void setIdade(int idade) { this.idade = idade; }
    public int getIdade() { return this.idade; }

    public String emitirSom() { return this.nome+" emitiu um som!"; }
    public String toString() { return "Nome: "+this.nome+" - Idade: "+this.idade+" anos."; }
    public String movimentamento(){ return ""; }
}
