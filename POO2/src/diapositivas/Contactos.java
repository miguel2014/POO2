package diapositivas;

public class Contactos {
	private String nombre;
	private int telefono;
	/**
	 * @param nombre
	 * @param edad
	 * @param telefono
	 */
	public Contactos(String nombre, int telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "Contactos [nombre=" + nombre + ", telefono="
				+ telefono + "]\n";
	}
	
}
