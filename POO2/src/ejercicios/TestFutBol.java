package ejercicios;

import java.util.List;

import ejercicios.Futbol.Jugador;



public class TestFutBol {
	public static void main(String[] args) {
		Futbol f=new Futbol("Go to loose");
		Futbol.Entrenador e=f.contratarEntrenador("Entrenador", 4);
		System.out.println(e);
		List<Jugador> plantilla=f.confeccionarEquipo();
		System.out.println(plantilla);
	}
}
