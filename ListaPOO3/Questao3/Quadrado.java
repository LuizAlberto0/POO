package ListaPOO3.Questao3;

public class Quadrado extends Retangulo{
    public Quadrado(){}

    @Override
    public float calcularPerimetro() { return this.getLado()*4; }
    @Override
    public float calcularArea() { return this.getLado()*this.getLado(); }

    @Override
    public String toString() { return "Quadrado -> lado: "+getLado()+" -> Area: "+calcularArea()+" - Perimetro: "+calcularPerimetro(); }
}
