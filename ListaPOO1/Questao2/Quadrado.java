package ListaPOO1.Questao2;

public class Quadrado {
    private double lado;

    public Quadrado(double l){
        this.lado = l;
    }
    public double getLado(){
        return lado;
    }
    public double area(){
        return lado*lado;
    }
    public double perimetro(){
        return 4*lado;
    }
}
