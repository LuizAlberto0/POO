package ListaPOO1.Questao13;

public class Fornecedor {
    private String id;
    private String nome;
    private String cnpj;

    public Fornecedor(String id, String nome, String cnpj) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public String getId(){ return this.id; }
    public String getNome(){ return this.nome; }
    public String getCnpj(){ return this.cnpj; }

    public String toString(){ return "ID: "+id+" - Nome: "+nome+" - cnpj: "+cnpj; }
}
