package ejercicios;

public class Rectangulo {
	private double ancho;
	private double alto;
	//Variable de clase
	private static int numeroRectangulo=0;
	public Rectangulo() {
		this.ancho = 1;
		this.alto = 1;
		numeroRectangulo++;
	}
	public Rectangulo(double ancho, double alto) {
		this.ancho = ancho;
		this.alto = alto;
		numeroRectangulo++;
	}
	public double areaRectangulo(){
		return this.alto*this.ancho;
	}
	public double perimetroRectangulo(){
		return (2*this.alto)+(2*this.ancho);
	}
	public static int getNumeroRectangulo() {
		return numeroRectangulo;
	}
	//Usamos una clase interna
	public static class NumeroRectangulos{
		public static int devuelveNumRectangulos(){
			return numeroRectangulo;
		}
	}
	@Override
	public String toString() {
		return "Rectangulo [ancho=" + ancho + ", alto=" + alto + "]";
	}	
}
