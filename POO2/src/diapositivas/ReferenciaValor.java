package diapositivas;

public class ReferenciaValor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inicial=2;
		System.out.println("Antes de cambiar " +inicial);
		modificarPrimitivo(inicial);
		System.out.println("Despues de cambiar " +inicial);
		System.out.println();
		Circulo c1 =new Circulo(5);
		System.out.println(c1);
		modificar(c1);
		System.out.println(c1.getRadio());
		Circulo c3=c1;
		System.out.println(c3);
		System.out.println(c3.getRadio());
		c1.setRadio(15);
		System.out.println(c1.getRadio());
		System.out.println(c3.getRadio());
		modificar(c3);
		System.out.println(c3);
		
	}
	public static void modificar(Circulo c2){
		System.out.println(c2);
		c2.setRadio(11);
		//System.out.println(c2.getRadio());
	}
	public static void modificarPrimitivo (int valorEnElMetodo){
		valorEnElMetodo*=2;
	}
}
class Circulo{
	private int radio;

	public Circulo(int radio) {
		this.radio = radio;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}	
}