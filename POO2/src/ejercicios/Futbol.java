package ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Futbol {
	private String nombreEquipo;
	private static final String[] NOMBRE_JUGADORES ={"portero","defensa1","defensa2","defensa3","defensa4",
		"centro1","centro2","centro3","delantero1","delantero2","delantero3"};
	private enum Puesto {
		PORTERO,DEFENSA,CENTRO,DELANTERO
	}
	public Futbol(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}
	@Override
	public String toString() {
		return "Futbol [nombreEquipo=" + nombreEquipo + "]";
	}
	
	
	
	public class Entrenador{
		private String nombre;
		private int experiencia;
		public Entrenador(String nombre, int experiencia) {
			this.nombre = nombre;
			this.experiencia = experiencia;
		}
		@Override
		public String toString() {
			return "Entrenador [nombre=" + nombre + ", experiencia="
					+ experiencia + "]";
		}
	}
	
	
	
	public class Jugador{
		private String nombre;
		private Puesto puesto;
		public Jugador(String nombre, Puesto puesto) {
			this.nombre = nombre;
			this.puesto = puesto;
		}
		@Override
		public String toString() {
			return "Jugador [nombre=" + nombre + ", puesto=" + puesto + "]";
		}
		
	}
	public Entrenador contratarEntrenador(String nombre,int experiencia){
		return new Entrenador(nombre, experiencia);
	}
	public List<Jugador> confeccionarEquipo(){
		List<Jugador> plantilla=new ArrayList<Jugador>();
		plantilla.add(new Jugador(NOMBRE_JUGADORES[0],Puesto.PORTERO));
		for (int i = 1; i <= 4; i++) {
			plantilla.add(new Jugador(NOMBRE_JUGADORES[i], Puesto.DEFENSA));
		}
		for (int i = 5; i <= 7; i++) {
			plantilla.add(new Jugador(NOMBRE_JUGADORES[i], Puesto.CENTRO));
		}
		for (int i = 8; i <= 10; i++) {
			plantilla.add(new Jugador(NOMBRE_JUGADORES[i], Puesto.DELANTERO));
		}
		return plantilla;
	}
	
}
