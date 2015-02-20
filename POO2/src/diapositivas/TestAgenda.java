package diapositivas;

import java.util.ArrayList;
import java.util.Arrays;

public class TestAgenda {
	public static void main(String[] args) {
		//int[] numeros={1,2,3,4};
		Contactos[] contacto={new Contactos("Mine", 156235465),
				new Contactos("This",12345678),
				new Contactos("Oan",12344444)};
		//Convierto el array Contacto en una lista
		//Tenemos un array de agenda que funciona asi
		//this.lista=new ArrayList<Contactos>();
		
		Agenda agenda =new Agenda(Arrays.asList(contacto));
		System.out.println(agenda);
		//agenda.addContacto(new Contactos("New",1, 2222222));
		//Da excepcion
		Agenda agenda1=new Agenda();//agenda vacia
		for (int i = 0; i < contacto.length; i++) {
			agenda1.addContacto(contacto[i]);
		}
		agenda1.addContacto(new Contactos("New",2222222));
		Contactos c1=new Contactos("nombre",22);
		System.out.println(agenda1);
		agenda1.deleteContacto(c1);
		System.out.println(agenda1);
		//Actualizar nombre
		c1 =new Contactos("",12345678);
		agenda1.addContacto(c1);
		agenda1.actualizarNombre(c1, "NOMBRE");
		agenda1.actualizarTelefono(c1, 1234567);
		System.out.println(agenda1);
	}
}
