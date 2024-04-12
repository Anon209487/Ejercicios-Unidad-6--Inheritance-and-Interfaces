/**
 * 
 */
package interfacesact1;

import java.util.Scanner;

/**
 * 
 */
public class MainSocios {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		nuevoSocio();
		ArraySocio.imprmirArrayOrdenado();
	}

	/**
	 * 
	 */
	private static void nuevoSocio() {
		System.out.println("Añadir nuevo socio: ");

		System.out.println("nombre: ");
		String nombre = "";
		nombre = extracted().nextLine();

		System.out.println("id: ");
		int id = extracted().nextInt();

		System.out.println("edad: ");
		int edad = extracted().nextInt();

		Socio nuevoSocio = new Socio(id, nombre, edad);
		System.out.println(ArraySocio.nuevoSocio(nuevoSocio));
	}

	/**
	 * 
	 * @return
	 */
	private static Scanner extracted() {
		return new Scanner(System.in);
	}
}
