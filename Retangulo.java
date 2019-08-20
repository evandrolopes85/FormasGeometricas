package evandro.exercicio;

public class Retangulo extends Quadrilatero{

	public Retangulo(double base, double altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculaArea() {
		return l1 * l2;
	}
	
	@Override
	public double calculaPerimetro() {
		return (2 * (l1 + l2));
	}
	
	public String toString() {
		return "Retangulo";
	}
}
