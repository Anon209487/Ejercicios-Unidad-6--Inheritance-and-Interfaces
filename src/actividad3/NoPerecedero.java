/**
 * 
 */
package actividad3;

/**
 * 
 */
public class NoPerecedero extends Productos {
	/**
	 * 
	 */
	private String tipo = "";

	/**
	 * 
	 * @param nombre
	 * @param precio
	 * @param tipo
	 */
	public NoPerecedero(String nombre, double precio, String tipo) {
		super(nombre, precio);
		// TODO Auto-generated constructor stub
		if (tipo != null && tipo != "") {
			this.tipo = tipo;
		}

	}

	/**
	 * 
	 */
	public double calcular(int cantidadProductos) {
		Double resultado = super.calcular(cantidadProductos);
		return resultado;
	}

	/**
	 * 
	 */
	public String toString() {
		String nombreYFuncion = super.toString();
		return nombreYFuncion = nombreYFuncion + " --> " + " NoPerecedero ";
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		if (tipo != null && tipo != "") {
			this.tipo = tipo;
		}
	}
}
