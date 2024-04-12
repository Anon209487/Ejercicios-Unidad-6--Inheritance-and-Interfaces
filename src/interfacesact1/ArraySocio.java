/**
 * 
 */
package interfacesact1;

import java.util.Arrays;


/**
 * 
 */
public class ArraySocio {
	public static Socio[] socios = new Socio[10];

	/**
	 * 
	 */
	public static void imprmirArrayOrdenado() {
		Arrays.sort(ArraySocio.socios);
		for (int i = 0; i < socios.length; i++) {
			System.out.println(socios[i]);
		}
	}

	/**
	 * 
	 * @param nuevoSocio
	 * @return
	 */
	public static boolean nuevoSocio(Socio nuevoSocio) {
		boolean nuevoSocioVerificacion = false;
		int contador = 0;
		while (socios[contador] == null) {
			contador++;
			nuevoSocioVerificacion = true;
		}
		socios[contador] = nuevoSocio;
		return nuevoSocioVerificacion;

	}



}
