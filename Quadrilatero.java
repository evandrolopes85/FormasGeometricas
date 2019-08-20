package evandro.exercicio;

public abstract class Quadrilatero implements FormaGeometrica{
	public double l1;
	public double l2;
	public double l3;
	public double l4;

	
	public Quadrilatero(double l1, double l2, double l3, double l4) {
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
		this.l4 = l4;
	}
	
	public Quadrilatero(double l1, double l2) {
		this(l1, l2, 0, 0);
	}
	
	public Quadrilatero(double l1) {
		this(l1, 0, 0, 0);
	}
	
	@Override
	public double calculaPerimetro() {
		return this.l1 + this.l2 + this.l3 + this.l4;
	}
}
