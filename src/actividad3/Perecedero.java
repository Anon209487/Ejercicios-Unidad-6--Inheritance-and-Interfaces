/**
 * 
 */
package actividad3;

/**
 * 
 */
public class Perecedero extends Productos {
	private int diasCaducar;

	/**
	 * 
	 * @param nombre
	 * @param precio
	 * @param diasCaducar
	 */
	public Perecedero(String nombre, double precio, int diasCaducar) {
		super(nombre, precio);
		if (diasCaducar >= 0) {
			this.setDiasCaducar(diasCaducar);
		}

		// TODO Auto-generated constructor stub
	}

	/**@overwrite
	 * 
	 */
	public String toString() {
		String nombreYFuncion = super.toString();
		return nombreYFuncion = nombreYFuncion + " --> " + " Perecedero ";
	}

	/**
	 * @return the diasCaducar
	 */
	public int getDiasCaducar() {
		return diasCaducar;
	}

	/**
	 * @param diasCaducar the diasCaducar to set
	 */
	public void setDiasCaducar(int diasCaducar) {
		this.diasCaducar = diasCaducar;
	}

	public double calcular(int cantidadProductos) {
		Double resultado = super.calcular(cantidadProductos);
		if (diasCaducar == 1) {
			resultado = resultado / 4;
		}
		if (diasCaducar == 2) {
			resultado = resultado / 3;
		}
		if (diasCaducar == 3) {
			resultado = resultado / 2;
		}

		return resultado;
	}
}
