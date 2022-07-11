package n1ejercicio2;

public class MainN1E2 {

	public static void main(String[] args) {
		// creo un objeto con argumentos genericos y uno persona con los mismos valores:
		GenericMethods posiblePersona = new GenericMethods ("Juan","Lopez",23);
		System.out.println(posiblePersona.toString());
		Persona persona = new Persona("Juan","Lopez",23);
		System.out.println(persona);
		// La diferencia es que en el generico no importa el orden ni el tipo
		// de los argumentos:
		GenericMethods posiblePersona1 = new GenericMethods ("Lopez",23,"Juan");
		GenericMethods posiblePersona2 = new GenericMethods (23,"Juan","Lopez");
		GenericMethods posiblePersona3 = new GenericMethods ('%',"Juan",23.45);
		System.out.println(posiblePersona1.toString());
		System.out.println(posiblePersona2.toString());
		System.out.println(posiblePersona3.toString());
	}

}
