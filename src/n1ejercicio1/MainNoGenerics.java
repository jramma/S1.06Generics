package n1ejercicio1;

public class MainNoGenerics {

	public static void main(String[] args) {

		// No importa el orden de los argumentos porque los 3 son de tipo String
		NoGenericMethods persona1 = new NoGenericMethods("Juan", "Vazquez", "Ramirez");
		NoGenericMethods persona2 = new NoGenericMethods("Ramirez", "Juan", "Vazquez");
		NoGenericMethods persona3 = new NoGenericMethods("Vazquez", "Ramirez", "Juan");

		System.out.println(persona1);
		System.out.println(persona2);
		System.out.println(persona3);

	}

}
