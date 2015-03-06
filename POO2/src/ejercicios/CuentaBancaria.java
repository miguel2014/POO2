package ejercicios;

public class CuentaBancaria {
	private String numeroCuenta;
	private double saldo;
	private double interes;
	private int fechaCreacion;
	private static int numeroCuentas;
	
	public CuentaBancaria(double saldo, double interes,
			int fechaCreacion) {
		this.saldo = saldo;
		this.interes = interes;
		this.fechaCreacion = fechaCreacion;
		numeroCuentas++;
	}
	public CuentaBancaria(int fechaCreacion) {
		this.saldo =0;
		this.interes = 2.5;
		this.fechaCreacion = fechaCreacion;
		numeroCuentas++;
	}
	
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
	public int getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(int fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public static int getNumeroCuentas() {
		return numeroCuentas;
	}
	
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
	private String generarnumeroCuenta(){
		String entidad="1234";
		String oficina="5678";
		int [] array={4,8,5,10,9,7,3,6};
		int digitoControl=0;
		for (int i = 0; i < entidad.length(); i++) {
			digitoControl+=entidad.charAt(i)*array[i];
		}
		
		
		String resultado=entidad+"-"+oficina+"-"+digitoControl;
		return resultado;
	}
	@Override
	public String toString() {
		return "CuentaBancaria [numeroCuenta=" + numeroCuenta + ", saldo="
				+ saldo + "]";
	}
	
	public static void main(String[] args) {
		CuentaBancaria c1=new CuentaBancaria(25, 2.5, 15151500);
		System.out.println(c1.generarnumeroCuenta());
	}	
	
}
