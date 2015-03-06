package diapositivas;

import java.util.ArrayList;
import java.util.List;

public class TestClaseParametrizada {
	public static void main(String[] args) {
	//Clase Parametrizada a double
	ClaseParametrizada<Double> listadoble=new ClaseParametrizada();
	for (int i = 0; i < 10; i++) {
		listadoble.addLista(new Double(i));
	}
	Double valor=listadoble.devuelveObjetoPosicion((int) (Math.random()*10));
	System.out.println(valor);
	System.out.println(listadoble.devuelveObjetoPosicion(11));
	ClaseParametrizada<String> listaString=new ClaseParametrizada();
	for (int i = 0; i < 10; i++) {
		listaString.addLista("palabra "+i);
	}
	String texto=listaString.devuelveObjetoPosicion((int) (Math.random()*10));
	System.out.println(texto);
	}
}
class ClaseParametrizada<T>{
	List<T> lista;
	public ClaseParametrizada(){
		lista=new ArrayList<T>();
	}
	//añade objetos a la lista
	public void addLista(T t){
		this.lista.add(t);
	}
	public  T devuelveObjetoPosicion(int i){
		if (i<this.lista.size()) {
			return this.lista.get(i);
		}
		else return null;
	}
	
}	

