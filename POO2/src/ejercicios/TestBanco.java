package ejercicios;


public class TestBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Banco b=new Banco("MINE");
	b.addCuenta(new CuentaBancaria());
	b.addCuenta(new CuentaBancaria(5467864, 3));
	b.addCuenta(new CuentaBancaria());
	b.addCuenta(new CuentaBancaria(4, 3));
	System.out.println(b);
	System.out.println(b.cuentaconMayorSaldo());
	System.out.println(b.cuentaconMenorSaldo());
	}

}
