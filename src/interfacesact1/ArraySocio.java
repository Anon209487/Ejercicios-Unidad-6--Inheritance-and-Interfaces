/**
 * 
 */
package interfacesact1;

import java.util.Arrays;

/**
 * 
 */
public class ArraySocio {
	public static Socio[] socios = new Socio[3];
	public static int contador = 0;

	/**
	 * 
	 */
	public static void imprmirArrayOrdenado() {

		Arrays.sort(ArraySocio.socios);
		for (int i = 0; i < socios.length; i++) {
			if (socios[i] != null) {
				System.out.println(socios[i]);
			}

		}
	}

	/**
	 * 
	 * @param nuevoSocio
	 * @return
	 */
	public static boolean nuevoSocio(Socio nuevoSocio) {
		boolean nuevoSocioVerificacion = false;
		boolean socioRepetido = false;
		// que no se repita el objeto
		int contador = 0;
		for (int i = 0; i < socios.length; i++) {
			if (socios[i] != null) {

				if (socios[i].equals(nuevoSocio)) {
					socioRepetido = true;

				}
			}
		}
		// posicion libre
		if (socioRepetido == false) {
			while (socios[contador] != null && contador < socios.length - 1) {
				contador++;

			}
			socios[contador] = nuevoSocio;
			contador++;
			nuevoSocioVerificacion = true;
		}

		return nuevoSocioVerificacion;

	}

}
