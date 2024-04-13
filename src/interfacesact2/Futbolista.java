/**
 * 
 */
package interfacesact2;

/**
 * 
 */
public class Futbolista {
	private int nmeroCamiseta;
	private int edad;
	private String nombre;
	private int numeroGloses;

	Futbolista() {
	}

	Futbolista(int nmeroCamiseta, int edad, String nombre, int numeroGloses) {
		if (nmeroCamiseta > 0) {
			this.nmeroCamiseta = nmeroCamiseta;
		}
		if (edad > 0) {
			this.edad = edad;
		}
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		if (numeroGloses > 0) {
			this.numeroGloses = numeroGloses;
		}
	}

	/**
	 * @return the nmeroCamiseta
	 */
	public int getNmeroCamiseta() {
		return nmeroCamiseta;
	}

	/**
	 * @param nmeroCamiseta the nmeroCamiseta to set
	 */
	public void setNmeroCamiseta(int nmeroCamiseta) {
		if (nmeroCamiseta > 0) {
			this.nmeroCamiseta = nmeroCamiseta;
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
	 * @return the numeroGloses
	 */
	public int getNumeroGloses() {
		return numeroGloses;
	}

	/**
	 * @param numeroGloses the numeroGloses to set
	 */
	public void setNumeroGloses(int numeroGloses) {
		if (numeroGloses > 0) {
			this.numeroGloses = numeroGloses;
		}

	}

	/**
	 * 
	 */
	public String toString() {
		String ret = "EL futbolista tiene como atributos:" + "\n";
		ret += " nmeroCamiseta: " + nmeroCamiseta + "\n";
		ret += " nombre: " + nombre + "\n";
		ret += " edad: " + edad + "\n";
		ret += " numero Gloses: " + numeroGloses + "\n";
		return ret;
	}

	/**
	 * 
	 * @param o
	 * @return
	 */
	public int compareTo(Object o) {
		int res = 0;
		Futbolista futbolistaComparacion = (Futbolista) o;
		if (this.nmeroCamiseta != futbolistaComparacion.nmeroCamiseta) {
			if (this.nmeroCamiseta < futbolistaComparacion.nmeroCamiseta) {
				res = -1;
			} else if (this.nmeroCamiseta > futbolistaComparacion.nmeroCamiseta) {
				res = 1;
			}
		} else if (this.nmeroCamiseta == futbolistaComparacion.nmeroCamiseta) {
			int comparedResult = this.nombre.compareTo(futbolistaComparacion.nombre);
			if (comparedResult < 0) {
				res = -1;
			} else if (comparedResult > 0) {
				res = 1;
			}
		}
		return res;
	}

	/**
	 * 
	 */
	public boolean equals(Object obj) {
		boolean res = false;
		Futbolista FutbolistaComparacion = (Futbolista) obj;
		if (nombre == FutbolistaComparacion.nombre) {
			res = true;
		}

		return res;

	}

}
