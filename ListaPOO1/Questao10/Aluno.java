package ListaPOO1.Questao10;

public class Aluno {
    private String nome;
    private String matricula;

    public Aluno(){}

    public void setNome(String nome) { this.nome = nome; }
    public String getNome() { return nome; }
    public void setMatricula(String matricula) { this.matricula = matricula; }
    public String getMatricula() { return matricula; }
    public String toString(){ return "Matrícula: "+matricula+" - Nome: "+nome+"\n"; }
}
