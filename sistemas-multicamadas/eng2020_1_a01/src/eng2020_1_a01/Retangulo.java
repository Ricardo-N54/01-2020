package eng2020_1_a01;

public class Retangulo extends Poligono implements Diagonal{

	public Retangulo(double base, double altura) {
		super(base, altura);
	}

	@Override
	public double area() {
		return getBase() * getAltura();
	}

	@Override
	public double perimetro() {
		return (2 * getBase()) + (2 * getAltura());
	}

	@Override
	public double diagonal() {
		return Math.sqrt(Math.pow(getBase(), 2) + Math.pow(getAltura(), 2));
	}

	@Override
	public String toString() {
		return "Retangulo [Base=" + getBase() + ", Altura=" + getAltura()
				+ ", perimetro=" + perimetro() + "]";
	}
}
