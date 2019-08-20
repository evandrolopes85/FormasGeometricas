package evandro.exercicio;

public class Circulo implements FormaGeometrica{
	public double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}

	@Override
	public double calculaArea() {
		return 3.14159 * (raio * raio);
	}

	@Override
	public double calculaPerimetro() {
		return 2 * 3.14159 * raio;
	}
	
	public String toString() {
		return "Circulo";
	}
}
