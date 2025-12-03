package ProvaN2.Questao1;

public class Aluno {
    private int codigo;
    private int idade;
    private String nome;
    private String cpf;
    private String endereco;
    private boolean sexo;
    private Notas notas;

    public Aluno(int codigo, int idade, String nome, String cpf, String endereco, boolean sexo, Notas notas){
        this.codigo=codigo;
        this.idade=idade;
        this.nome=nome;
        this.cpf=cpf;
        this.endereco=endereco;
        this.sexo=sexo;
        this.notas = notas;
    }

    public void setCodigo(int codigo) { this.codigo = codigo; }
    public int getCodigo() { return this.codigo; }
    public void setIdade(int idade) { this.idade = idade; }
    public int getIdade() { return this.idade; }
    public void setNome(String nome) { this.nome = nome; }
    public String getNome() { return this.nome; }
    public void setCpf(String cpf) { this.cpf=cpf; }
    public String getCpf() { return this.cpf; }
    public void setEndereco(String endereco) { this.endereco=endereco; }
    public String getEndereco() { return this.endereco; }
    public void setSexo(boolean sexo) { this.sexo=sexo; }
    public boolean getSexo() {return this.sexo; }
    public void setNotas(Notas notas) { this.notas=notas; }
    public Notas getNotas() { return this.notas; }

    public String getSituacao(){
        if(this.notas.getMedia()>=6) return "APROVADO";
        else return "REPROVADO";
    }
    public String toString(){
        if(this.sexo) return "Código: "+this.codigo+" - Nome: "+this.nome+" - "+this.idade+" anos - cpf: "+this.cpf+" - Sexo: M - Endereço: "+this.endereco+" - "+getSituacao();
        else return "Código: "+this.codigo+" - Nome: "+this.nome+" - "+this.idade+" anos - cpf: "+this.cpf+" - Sexo: F - Endereço: "+this.endereco+" - "+getSituacao();

    }
}
