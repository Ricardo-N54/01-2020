package eng2020_1_a01;

public class Losango extends Poligono {

	public Losango(double base, double altura) {
		super(base, altura);
	}

	@Override
	public double area() {
		return getBase() * getAltura();
	}

	@Override
	public double perimetro() {
		return 4 * getBase();
	}

	@Override
	public String toString() {
		return "Losango [Base=" + getBase() + ", Altura=" + getAltura()
				+ ", perimetro=" + perimetro() + "]";
	}

}
