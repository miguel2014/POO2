package ejercicios;

import ejercicios.Rectangulo.NumeroRectangulos;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Rectangulo r1=new Rectangulo();
	Rectangulo r2=new Rectangulo(15.20,1);
	Rectangulo r3=new Rectangulo(5.05,9.60);
	new Rectangulo();
	System.out.println(r1);
	System.out.println(r2);
	System.out.println(r3);
	System.out.println("Area "+r2.areaRectangulo());
	System.out.println("Perimetro "+r2.perimetroRectangulo());
	System.out.println("Rectangulo creados "+r2.getNumeroRectangulo());
	System.out.println("Rectangulo creados "+NumeroRectangulos.devuelveNumRectangulos());
	}

}
