package ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private List<CuentaBancaria> cuentas;

	public Banco() {
		this.cuentas=new ArrayList<CuentaBancaria>();
	}
	public void addCuenta(CuentaBancaria c){
		if (!cuentas.contains(c)) {
			this.cuentas.add(c);
		}	
	}
	public void deleteCuenta(CuentaBancaria c){
		if (cuentas.contains(c)) {
			this.cuentas.remove(c);
		}
		
	}
}
