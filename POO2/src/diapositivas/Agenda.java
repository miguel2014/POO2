package diapositivas;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	
	List <Contactos> lista;
	
	/**
	 * @param lista
	 * Crea una agenda a partir de otra agenda
	 */
	public Agenda(List<Contactos> lista) {
		this.lista = lista;
	}
	/**
	 * 
	 * Inicializa la agenda vacia
	 */

	public Agenda() {
		this.lista=new ArrayList<Contactos>();
	}
	public void addContacto(Contactos c ){
		this.lista.add(c);
	}
	public boolean existsContacto(Contactos c){
		return this.lista.contains(c);
	}
	public void deleteContacto(Contactos c){
		if (existsContacto(c)) {
			this.lista.remove(c);
		}	
	}
	/**
	 * 
	 * @param c objeto a modificar
	 * @param telefono nuevo numero
	 */
	public void actualizarTelefono(Contactos c,int telefono){
		if (this.existsContacto(c))
			c.setTelefono(telefono);
	}
	public void actualizarNombre(Contactos c,String nombre){
		if (this.existsContacto(c))
			c.setNombre(nombre);
	}
	@Override
	public String toString() {
		return lista.toString();
	}
	
}
