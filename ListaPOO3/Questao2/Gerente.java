package ListaPOO3.Questao2;

public class Gerente extends Empregado{
    private String nomeGerencia;

    public Gerente(){}

    public void setNomeGerente(String nomeGerente) { this.nomeGerencia = nomeGerente; }
    public String getNomeGerente() { return this.nomeGerencia; }

    public String toString(){ return "Nome: "+getNome()+" - Idade: "+getIdade()+"\n =Matricula: "+getMatricula()+
    " - Nome Gerencia: "+this.nomeGerencia+" - Valor Inss: R$"+valorInss(); }
}
