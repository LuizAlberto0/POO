package ListaPOO3.Questao2;

public class Empregado extends Pessoa{
    private double salario;
    private String matricula;

    public Empregado(){}

    public void setMatricula(String matricula) { this.matricula = matricula; }
    public String getMatricula() { return this.matricula; }
    public void setSalario(double salario) { this.salario = salario; }
    public double getSalario() { return this.salario; }

    public double valorInss(){ return this.salario*0.11; }
}
