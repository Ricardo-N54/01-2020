package eng2020_1_a01;

public class Trapezio extends Figura {

	private double baseMaior;
	private double baseMenor;
	private double altura;

	public Trapezio(double baseMaior, double baseMenor, double altura) {
		this.baseMaior = baseMaior;
		this.baseMenor = baseMenor;
		this.altura = altura;
	}

	@Override
	public double area() {
		return ((baseMaior + baseMenor) * altura) / 2;
	}

	@Override
	public double perimetro() {
		return 0;
	}

	@Override
	public String toString() {
		return "Trapezio [baseMaior=" + baseMaior + ", baseMenor=" + baseMenor + ", altura=" + altura + ", perimetro="
				+ perimetro() + "]";
	}

}
