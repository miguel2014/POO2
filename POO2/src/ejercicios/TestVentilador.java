package ejercicios;

public class TestVentilador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ventilador v=new Ventilador();
		System.out.println(v);
		v.setColor("rojo");
		v.setRadio(432);
		v.setEncendido(true);
		v.setRapidez(Velocidad.MEDIO);
		System.out.println(v);
	}

}
