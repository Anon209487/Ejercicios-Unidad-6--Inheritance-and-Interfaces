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
		int seleccion = 1;

		while (seleccion != 0) {
			seleccion = menu();
			switch (seleccion) {
			case 1:
				nuevoSocio();
				break;
			case 2:
				/**
				 * El array no pede tener posciones vacias para qu elo pueda ordenar no se por
				 * que
				 */
				imprmirArrayOrdenado();
				break;
			case 0:
				System.out.println("Salida: ");
				break;
			}

		}
	}

	private static void imprmirArrayOrdenado() {
		// TODO Auto-generated method stub
		if (ArraySocio.contador != 3) {
			System.out.println("Debe anyadir los tres empleads para imprimir : ");
		} else {
			ArraySocio.imprmirArrayOrdenado();
		}

	}

	/**
	 * 
	 */
	private static int menu() {

		System.out.println("1 nuevo socio: ");
		System.out.println("2 listar socios (de manera ordenada): ");
		System.out.println("0 Salir:: ");
		int seleccion = extracted().nextInt();

		return seleccion;
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
		System.out.println("Se ha anyadidio nuevo empleado?" + ArraySocio.nuevoSocio(nuevoSocio));
	}

	/**
	 * 
	 * @return
	 */
	private static Scanner extracted() {
		return new Scanner(System.in);
	}
}
