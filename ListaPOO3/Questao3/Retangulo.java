package ListaPOO3.Questao3;

public class Retangulo extends Forma{
    private float lado;
    private float altura;

    public Retangulo(){}

    public void setLado(float lado) { this.lado = lado; }
    public void setAltura(float altura) { this.altura = altura; }
    public float getLado() { return this.lado; }

    @Override
    public float calcularArea() { return this.lado*this.altura; }
    @Override
    public float calcularPerimetro() { return 2*this.lado+2*this.altura; }

    public String toString(){ return "Retângulo -> lado: "+this.lado+" - altura: "+this.altura+" -> "+
    "Area: "+calcularArea()+" - Perimetro: "+calcularPerimetro(); }
}
