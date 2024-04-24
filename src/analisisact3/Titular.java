/**
 * 
 */
package analisisact3;

/**
 * 
 */
public class Titular {
	private String DNI = "";
	private String nombre = "";
	private String apellidos = "";
	private String teléfono;

	Titular() {

	}

	/**
	 * 
	 */
	Titular(String DNI, String nombre, String apellidos, String teléfono) {
		if (DNI != null && !DNI.equals("")) {

			this.DNI = DNI;
		}
		if (nombre != null && !nombre.equals("")) {

			this.nombre = nombre;
		}
		if (apellidos != null && !apellidos.equals("")) {

			this.apellidos = apellidos;
		}
		if (teléfono != null && !teléfono.equals("")) {

			this.teléfono = teléfono;
		}
	}

	/**
	 * @return the dNI
	 */
	public String getDNI() {
		return DNI;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @return the teléfono
	 */
	public String getTeléfono() {
		return teléfono;
	}

	public String toString() {
		String titular = "DNI: " + DNI + "\n";
		titular += "nombre: " + nombre + "\n";
		titular += "apellidos: " + apellidos + "\n";
		titular += "teléfono: " + teléfono + "\n";
		return titular;
	}

	/**
	 * funcion de la clase equals
	 */
	public boolean equals(Object o) {
		boolean res = false;
		Titular empleadoComparacion = (Titular) o;
		if (DNI.equals(empleadoComparacion.DNI)) {
			res = true;
		}
		return res;
	}
}
