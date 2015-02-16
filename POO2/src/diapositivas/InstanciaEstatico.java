package diapositivas;

public class InstanciaEstatico {
public final int CONSTANTE=5;
public static final int OTRA_CONSTANTE=5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadrado c1=new Cuadrado(3);
		Cuadrado c2=new Cuadrado(4);
		System.out.println("Valor arista "+c1.getArista());
		System.out.println("Valor arista "+c2.getArista());
		
		System.out.println("Numero cuadrados "+c1.getNumeroCuadrado());
		//Mejor al ser un metodo estatico
		System.out.println("Numero cuadrados "+Cuadrado.getNumeroCuadrado());
		//System.out.println("Valor de la constante "+CONSTANTE);
		InstanciaEstatico i=new InstanciaEstatico();
		System.out.println("Valor de la constante "+i.CONSTANTE);
		//Mejor acceder a la constante con static
		System.out.println("Valor de la nueva constante "+OTRA_CONSTANTE);
		//Accedemos al metodo de instancia version1
		//Debemos crear un objeto o aprovechar alguno existente
		InstanciaEstatico nuevoObjeto=new InstanciaEstatico();
		System.out.println("Numero aleatorio v1 "+nuevoObjeto.version1());
		//Accedemos al metodo de clase version2
		//No hace falta crear o usar un objeto aunque se puede usar
		System.out.println("Numero aleatorio v2 F1 "+version2());
		System.out.println("Numero aleatorio v2 F2 "+InstanciaEstatico.version2());
		System.out.println("Numero aleatorio v2 F3 "+nuevoObjeto.version2());
		
	}
	//Metodo de instancia (debemos crear un objeto)
	public int version1(){
		return (int) (Math.random()*100);
	}
	//Metodo de clase
	public static int version2(){
		return (int) (Math.random()*100);		
	}
}
class Cuadrado{
	private int arista;
	private static int numeroCuadrado=0;
	
	public Cuadrado(int arista) {
		this.arista = arista;
		numeroCuadrado++;
	}
	
	public int getArista() {
		return arista;
	}

	public static int getNumeroCuadrado() {
		return numeroCuadrado;
	}
	public static int aristaporDos(){
	//	return arista*=2;
		return 1;
	}
}