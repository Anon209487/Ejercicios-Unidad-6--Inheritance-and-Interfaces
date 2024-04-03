/**
 * 
 */
package actividad3;

/**
 * 
 */

public class Productos {
	private String nombre;
	protected double precio;

	/**
	 * 
	 * @param nombre
	 * @param precio
	 */
	public Productos(String nombre, double precio) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		this.precio = precio;
	}
	public String toString() {
	
		return " nombre: " + nombre + " nombre: " + precio;
	}
	public double calcular(int cantidadProductos) {
		Double resultado = 0.0;
		if (cantidadProductos > 0) {
			resultado = this.precio * cantidadProductos;

		}
		return resultado;
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
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
