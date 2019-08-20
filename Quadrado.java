package evandro.exercicio;

public class Quadrado extends Quadrilatero{

	public Quadrado(double lado) {
		super(lado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculaArea() {
		return  l1 * l1;
	}
	
	@Override
	public double calculaPerimetro() {
		return l1 * 4;
	}
	
	public String toString() {
		return "Quadrado";
	}
}
