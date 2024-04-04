/**
 * 
 */
package actividad4;

/**
 * 
 */
public class Lavadora extends Electrodomestico {
	private double carga = 5;

	public Lavadora() {
		// TODO Auto-generated constructor stub
	}

	public Lavadora(double precio, double doublepeso) {
		// TODO Auto-generated constructor stub
		super(precio, doublepeso);
	}

	public Lavadora(double preciobase, String color, char consumoenergético, double peso, double carga) {

		// TODO Auto-generated constructor stub
		super(preciobase, color, consumoenergético, peso);
		if (carga >= 0) {
			this.carga = carga;
		}

	}

	/**
	 * @return the carga
	 */
	public double getCarga() {
		return carga;
	}

	/**
	 * @param carga the carga to set
	 */
	public void setCarga(double carga) {
		this.carga = carga;
	}

}
