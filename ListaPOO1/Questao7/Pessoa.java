package ListaPOO1.Questao7;

public class Pessoa {
    private String nome;
    private String cpf;
    private Endereco endereco;

    public Pessoa(){}

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCpf(){
        return cpf;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public String toString(){
        return "### Pessoa ###\nNome: "+nome+"\nCPF: "+cpf+"\nEndereço:"+endereco;
    }
}
