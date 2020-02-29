package eng2020_1_a01;

public class Triangulo extends Poligono {

	public Triangulo(double base, double altura) {
		super(base, altura);
	}

	@Override
	public double area() {
		return (getBase() * getAltura()) / 2;
	}

	@Override
	public double perimetro() {
		// TODO 
		return 0;
	}

	@Override
	public String toString() {
		return "Triangulo [Base=" + getBase() + ", Altura=" + getAltura()
				+ ", perimetro=" + perimetro() + "]";
	}

}
