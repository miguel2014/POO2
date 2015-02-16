package diapositivas;

import java.util.ArrayList;
import java.util.Arrays;

public class TestAgenda {
	public static void main(String[] args) {
		//int[] numeros={1,2,3,4};
		Contactos[] contacto={new Contactos("Mine", 15, 156235465),
				new Contactos("This", 151,12345678),
				new Contactos("Oan", 152, 12344444)};
		//Convierto el array Contacto en una lista
		//Tenemos un array de agenda que funciona asi
		//this.lista=new ArrayList<Contactos>();
		
		Agenda agenda =new Agenda(Arrays.asList(contacto));
		System.out.println(agenda);
		agenda.addContacto(new Contactos("New",1, 2222222));
		Contacto c1=new Contacto("nombre",11,22);
	}
}
