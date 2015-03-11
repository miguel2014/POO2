package ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private List<CuentaBancaria> cuentas;
	private String nombreBanco;
	public Banco(String banco) {
		this.cuentas=new ArrayList<CuentaBancaria>();
		this.nombreBanco=banco;
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
	public List<CuentaBancaria> cuentaconMayorSaldo(){
		List<CuentaBancaria> lista=new ArrayList<CuentaBancaria>();
		double saldoMayor=0;
		for (CuentaBancaria cuentaBancaria : this.cuentas) {
			if (cuentaBancaria.getSaldo()>=saldoMayor)
				saldoMayor=cuentaBancaria.getSaldo();
		}
		for (CuentaBancaria cuentaBancaria : cuentas) {
			if (cuentaBancaria.getSaldo()==saldoMayor)
				lista.add(cuentaBancaria);	
		}
		return lista;	
	};	
	public List<CuentaBancaria> cuentaconMenorSaldo(){
		List<CuentaBancaria> lista=new ArrayList<CuentaBancaria>();
		double saldoMenor=Double.MAX_VALUE;
		for (CuentaBancaria cuentaBancaria : this.cuentas) {
			if (cuentaBancaria.getSaldo()<saldoMenor)
				saldoMenor=cuentaBancaria.getSaldo();
		}
		for (CuentaBancaria cuentaBancaria : cuentas) {
			if (cuentaBancaria.getSaldo()==saldoMenor)
				lista.add(cuentaBancaria);	
		}
		return lista;	
	}
	private double saldoMedio(){
		double saldoTotal=0;
		for (CuentaBancaria cuentaBancaria : cuentas) {
			saldoTotal+=cuentaBancaria.getSaldo();
		}
		return saldoTotal/cuentas.size();
	}
	@Override
	public String toString() {
		return "Nombre Banco "+this.nombreBanco+"\nNumero cuentas :"+this.cuentas.size()+" \nSaldo medio :"+this.saldoMedio()+" \nBanco [cuentas=" + cuentas + "]";
	};
		
}
