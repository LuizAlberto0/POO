package ListaPOO1.Questao1;

public class Funcionario {
    private String nome;

    public Funcionario(){ }

    public String getNome(){
        return nome;
    }
    public void setNome(String n){
        this.nome = n;
    }
    public double calcularSalario(Double vendaBruta){
        if(vendaBruta>8000) return 382.33+(0.08675*vendaBruta);
        else return 177.12+(0.0387*vendaBruta);
    }
}
