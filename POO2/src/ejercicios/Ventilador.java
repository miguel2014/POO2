package ejercicios;

public class Ventilador {
	private Velocidad rapidez=Velocidad.LENTO;
	private boolean encendido=false;
	private double radio=50;
	private String color="blanco";
	public Velocidad getRapidez() {
		return rapidez;
	}
	public void setRapidez(Velocidad rapidez) {
		this.rapidez = rapidez;
	}
	public boolean isEncendido() {
		return encendido;
	}
	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Ventilador [rapidez=" + rapidez + ", encendido=" + encendido
				+ ", radio=" + radio + ", color=" + color + "]";
	}
	
}
