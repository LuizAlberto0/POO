package ListaPOO3.Questao3;

public class Circulo extends Forma{
    private float raio;

    public Circulo() {}

    public void setRaio(float raio) { this.raio = raio; }

    @Override
    public float calcularPerimetro() { return (float)(2*Math.PI*this.raio); }
    @Override
    public float calcularArea() { return (float)(Math.PI*Math.pow(this.raio, 2)); }

    public String toString(){ return "Circulo -> raio: "+this.raio+" -> Area: "+calcularArea()+" - Perimetro: "+calcularPerimetro(); }
}
