/**
 * 
 */
package interfacesact2;

import java.util.Arrays;

/**
 * 
 */
public class FutbolistaArray {
	public static Futbolista[] futbolistas = new Futbolista[5];
	public static int contadorArray = 0;

	public static boolean nuevoFutbolista(Futbolista nuevoFutbolista) {
		boolean verificacioinNuevoFutbolista = false;
		boolean verificacioinRepetido = false;
		int contador = 0;
		for (int i = 0; i < futbolistas.length; i++) {
			if (futbolistas[i] != null) {
				if (nuevoFutbolista.equals(futbolistas[i])) {
					verificacioinRepetido = true;
				}
			}
			if (verificacioinRepetido == false) {
				while (futbolistas[contador] != null && contador < futbolistas.length) {
					contador++;
				}
				futbolistas[contador] = nuevoFutbolista;
				verificacioinNuevoFutbolista = true;
			}
		}
		return verificacioinNuevoFutbolista;
	}

	public static void listarFutbolistasOrdenaamente() {
		Arrays.sort(FutbolistaArray.futbolistas);
		for (int i = 0; i < futbolistas.length; i++) {
			if (futbolistas[i] != null) {
				System.out.print(futbolistas[i]);
			}
		}
	}
}
