package ejercicios;

import java.time.LocalDate;

public class CuentaBancaria {
	private String cc;
	private String numeroCuenta;
	private double saldo;
	private double interes;
	private LocalDate fechaCreacion;
	private static int numeroCuentas;
	private static final String entidad="1234";
	private static final String oficina="5678";
	
	//Constructores
	
	public CuentaBancaria(double saldo, double interes
			) {
		this.cc=crearNumeroCuenta();
		this.numeroCuenta=numeroCuenta();
		this.saldo = saldo;
		this.interes = interes;
		this.fechaCreacion = LocalDate.now();
		numeroCuentas++;
	}
	public CuentaBancaria() {
		this.cc=crearNumeroCuenta();
		this.numeroCuenta=numeroCuenta();
		this.saldo =0;
		this.interes = 2.5;
		this.fechaCreacion = LocalDate.now();
		numeroCuentas++;
	}
	//Getter y setter
	
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getInteres() {
		return interes;
	}
	public void setInteres(double interes) {
		this.interes = interes;
	}
	
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}
	public static int getNumeroCuentas() {
		return numeroCuentas;
	}
	//Añadir y retirar dinero
	
	private double depositarDinero(double dinero){
	return	saldo+=dinero;
	}
	private double retirarDinero(double dinero){
		double dinerototal=0;
		if (saldo>0 || dinerototal>0) {
			dinerototal=saldo-=dinero;	
		}
		return dinerototal;
	}
	
	//Crear numeroCuenta 10
	private String crearNumeroCuenta(){
		int numero;
		String numeroCuenta="";	
		for (int i = 0; i < 10; i++) {
			 numero=(int) (Math.random()*10);
			numeroCuenta+=numero;
				}
		return numeroCuenta;
	}
	
	private int primerNumeroControl(){
		int [] array1={4,8,5,10,9,7,3,6};
		int primerDigito=0;
		int contador=0;
		for (int i = 0; i < entidad.length(); i++) {
			primerDigito+=Character.digit(entidad.charAt(i),10)*array1[i];
			contador++;
			//el problema es que con charat obtenemos el valor unicode de entidad
			//Para ello usamos Character.digit para solucionarlo
		}
		int cont2=0;
		for (int i = contador+1; i < array1.length; i++) {
			
			primerDigito+=Character.digit(oficina.charAt(cont2),10)*array1[i];
		}
		primerDigito=11-(primerDigito%11);
		if (primerDigito==10)
			return 1;
		if (primerDigito==11) {
			return 0;
		}
		return primerDigito;
	}
	private int segundoNumeroControl(){
		
		int [] array2={1,2,4,8,5,10,9,7,3,6};
		int cifra=0;
		int segundoDigito=0;
		for (int i = 0; i < array2.length; i++) {
			
			segundoDigito+=Character.digit(cc.charAt(i),10)*array2[i];
			
		}
		segundoDigito=11-(segundoDigito%11);
		if (segundoDigito==10)
			return 1;
		if (segundoDigito==11) {
			return 0;
		}
		return segundoDigito;
	}
	
	private String numeroCuenta(){
		return entidad+"-"+this.oficina+"-"+primerNumeroControl()+segundoNumeroControl()+"-"+this.cc;
	}
	
	
	@Override
	public String toString() {
		return "CuentaBancaria [numeroCuenta=" + numeroCuenta + ", saldo="
				+ saldo + ", interes=" + interes + ", fechaCreacion="
				+ fechaCreacion + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((numeroCuenta == null) ? 0 : numeroCuenta.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CuentaBancaria other = (CuentaBancaria) obj;
		if (numeroCuenta == null) {
			if (other.numeroCuenta != null)
				return false;
		} else if (!numeroCuenta.equals(other.numeroCuenta))
			return false;
		return true;
	}

	
}
