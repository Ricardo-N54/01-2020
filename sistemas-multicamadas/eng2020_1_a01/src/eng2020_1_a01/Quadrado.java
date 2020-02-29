package eng2020_1_a01;

public class Quadrado extends Poligono implements Diagonal {

	public Quadrado(double lado) {
		super(lado, lado);
	}

	@Override
	public double diagonal() {
		return getAltura()*Math.sqrt(2);
	}
	
	@Override
	public double area() {
		return getAltura()*getBase();
	}

	@Override
	public double perimetro() {
		return (2 * getBase()) + (2 * getAltura());
	}

	@Override
	public String toString() {
		return "Quadrado [Base=" + getBase() + ", Altura=" + getAltura()
				+ ", perimetro=" + perimetro() + "]";
	}

}
