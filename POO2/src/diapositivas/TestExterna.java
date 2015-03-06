package diapositivas;

public class TestExterna {
	public static void main(String[] args) {
		Externa e1=new Externa(); //con referencia
		new Externa(); //sin referencia
		int numero=Externa.InternaEstatica.devuelveDos();
		int numero2=Externa.devuelveOtroDos();
		System.out.println(numero);
		System.out.println(numero2);
		System.out.println(e1.devuelveTres());
		int numero3=new Externa().devuelveTres();
		System.out.println(numero3);
		//int in =(e1).devuelveTres();	
	}
}
class Externa{
	//Constructor
	public Externa(){
		System.out.println("Creando una clase externa");
	}
	public static int devuelveOtroDos(){
		return 2;
	}
	//Clase interna estatica
	public static class InternaEstatica{
		public static int devuelveDos(){
			return 2;
		}
	}
	//Metodo instancia
	public int devuelveTres(){
		return 3;
	}
	//Clase interna no estatica de instancia
	public class Interna{
		public Interna(){
			System.out.println("Creado Interna");
		}
		public int devuelveOtroTres(){
			return 3;
			}
	}
}
	