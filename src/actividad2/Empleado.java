/**
* 
*/
package actividad2;

/**
 * 
 */
public class Empleado {

	/**
	 * 
	 */
	protected String nombre = "";

	/**
	 * 
	 * @param nombre
	 */
	protected Empleado(String nombre) {
		if (nombre != null || nombre != "") {
			this.nombre = nombre;
		}

	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String toString() {
		return " " + this.nombre;
	}
}
