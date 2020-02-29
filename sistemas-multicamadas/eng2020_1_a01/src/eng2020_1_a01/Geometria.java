package eng2020_1_a01;

import java.util.ArrayList;

public class Geometria {

	public Geometria() {
	}

	public static void main(String[] args) {
		ArrayList<Figura> figuras = new ArrayList();
		figuras.add(new Circulo(1.0));
		figuras.add(new Circulo(10.0));
		figuras.add(new Retangulo(5.0,10.0));
		figuras.add(new Quadrado(10));
		figuras.add(new Triangulo(10.0, 1.0));
		figuras.add(new Losango(10.0, 1.0));
		figuras.add(new Trapezio(10.0, 9.0, 5.0));

		for(Figura figura: figuras) {
			System.out.println("-------------------------------------------------------------------------");
			System.out.println(figura);
			System.out.println("Área = " + figura.area());
			if (figura instanceof Diagonal) {
				Diagonal d = (Diagonal) figura;				
				System.out.println("Diagonal = " + d.diagonal());
			}
		}
	}

}
