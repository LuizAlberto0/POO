package ListaPOO1.Questao3;

public class Aluno {
    private String nome;
    private String matricula;
    private double n1;
    private double n2;
    private double notaTrabalho;
    private double Media;
    private double notaFaltante;

    public Aluno(){};

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public String getMatricula(){
        return matricula;
    }
    public void setN1(double n1){
        this.n1 = n1;
    }
    public double getN1(){
        return n1;
    }
    public void setN2(double n2){
        this.n2 = n2;
    }
    public double getN2(){
        return n2;
    }
    public void setNotaTrabalho(double notaTrabalho){
        this.notaTrabalho = notaTrabalho;
    }
    public double getNotaTrabalho(){
        return notaTrabalho;
    }
    public void calcularMedia(){
        Media = (n1+n2+notaTrabalho)/3;
    }
    public void notaFaltante(){
        notaFaltante = 5-Media;
    }
    public String toString(){
        if(notaFaltante<=0) return "Matrícula: "+matricula+"\nNome: "+nome+"\nNota 1: "+n1+"\nNota2: "+n2+
                "\nNota de trabalho: "+notaTrabalho+"\nMedia: "+Media+"\n";
        else return "Matrícula: "+matricula+"\nNome: "+nome+"\nNota 1: "+n1+"\nNota2: "+n2+
                "\nNota de trabalho: "+notaTrabalho+"\nMedia: "+Media+"\nNota faltante para média 5: "+notaFaltante+"\n";
    }
}
