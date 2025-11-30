package ListaPOO1.Questao6;

public class Funcionario {
    private String nome;
    private String id;
    private double salario;

    public Funcionario(){}

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    public double getSalario(){
        return salario;
    }
    public boolean verificaSalario(){
        return salario >= 0;
    }
    public boolean aplicarBonus(double valorBonus){
        if(valorBonus>=0){
            salario+=valorBonus;
            return true;
        }
        else return false;
    }
    public boolean reajustarSalario(double percentualAjuste){
        if(salario+(salario*(percentualAjuste/100))>=0){
            salario+=(percentualAjuste/100)*salario;
            return true;
        }
        else return false;
    }
    public String toString(){
        return "\n### Funcionário ###\n"+"ID: "+id+"\nNome: "+nome+"\nSalario: R$"+salario;
    }
}
