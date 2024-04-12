/**
 * 
 */
package interfacesact1;

/**
 * 
 */
public class Socio implements Comparable<Object> {
	private int id;
	private String nombre = "";
	private int edad;

	Socio() {
	}

	/**
	 * 
	 * @param id
	 * @param nombre
	 * @param edad
	 */
	Socio(int id, String nombre, int edad) {
		if (id > 0) {
			this.id = id;
		}
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		if (edad > 0) {
			this.edad = edad;
		}
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		if (id > 0) {
			this.id = id;
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
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		if (edad > 0) {
			this.edad = edad;
		}

	}

	/**
	 * 
	 */
	public String toString() {
		String imprimirSocio = "El anumal es: " + "/n";
		imprimirSocio += "id: " + this.id + "/n";
		imprimirSocio += "nombre: " + this.nombre + "/n";
		imprimirSocio += "edad: " + this.edad + "/n";

		return imprimirSocio;
	}

	/**
	 * 
	 */
	@Override
	public int compareTo(Object o) {
		int res = 0;
		Socio per = (Socio) o;
		if (this.id < per.id) {
			res = -1;
		} else if (this.id > per.id) {
			res = 1;
		}
		return res;
	}

}
