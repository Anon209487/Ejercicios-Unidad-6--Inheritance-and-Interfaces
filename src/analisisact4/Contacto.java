/**
 * 
 */
package analisisact4;

/**
 * 
 */
public class Contacto {
	private String nombre = "";
	private String telefono = "";

	/**
	 * 
	 */
	public Contacto() {

	}

	Contacto(String nombre, String telefono) {
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

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public boolean equals(Contacto contacto) {
		boolean iguales = false;
		if (telefono.equalsIgnoreCase(contacto.getTelefono())) {
			iguales = true;
		}
		return iguales;
	}

	public String toString() {
		String contacto = "El contacto es :" + "/n";
		contacto += "nombre" + nombre + "/n";
		contacto += "telefono" + telefono + "/n";
		return contacto;
	}

}
