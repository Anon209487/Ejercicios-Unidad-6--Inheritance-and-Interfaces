/**
 * 
 */
package interfacesact2;

import java.util.Scanner;

/**
 * 
 */
public class FutbolistaMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int selecion = 1;
		System.out.println("Bienbenido ");
		while (FutbolistaArray.contadorArray > FutbolistaArray.futbolistas.length || selecion == 0) {
			switch (selecion) {
			case 1:
				nuevoFutbolista();
				break;
			case 2:
				FutbolistaArray.listarFutbolistasOrdenaamente();
				break;
			case 0:
				System.out.println("Ha seleccionado salors ");
				break;
			}
			selecion = menu();

		}
		System.out.println("Fin ");
	}

	private static int menu() {

		int selecion = 0;

		System.out.println("1 nuevo futbolista: ");
		System.out.println("2 Listarv de manera ordenada: ");
		System.out.println("0 Salir: ");
		selecion = extracted().nextInt();
		return selecion;

	}

	private static void nuevoFutbolista() {
		int nmeroCamiseta;
		int edad;
		String nombre;
		int numeroGloses;
		System.out.println("nombre: ");
		nombre = extracted().nextLine();
		System.out.println("nmeroCamiseta: ");
		nmeroCamiseta = extracted().nextInt();
		System.out.println("edad: ");
		edad = extracted().nextInt();
		System.out.println("numeroGloses ");
		numeroGloses = extracted().nextInt();
		Futbolista nuevoFutbolista = new Futbolista(nmeroCamiseta, edad, nombre, numeroGloses);
		System.out.println("Se ha anyadidio nuevo Futbolista?" + FutbolistaArray.nuevoFutbolista(nuevoFutbolista));
	}

	private static Scanner extracted() {
		return new Scanner(System.in);
	}

}
