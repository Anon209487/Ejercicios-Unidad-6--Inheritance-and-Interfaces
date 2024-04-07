/**
 * 
 */
package actividad4;

/**
 * 
 */
public class Television extends Electrodomestico {
	private double resolución = 20;
	private boolean sintonizadorTDT = false;

	public Television() {

	}

	public Television(double precio, double doublepeso) {

		super(precio, doublepeso);
	}

	public Television(double preciobase, String color, char consumoenergético, double peso, double resolución,
			boolean sintonizadorTDT) {

		super(preciobase, color, consumoenergético, peso);
		if (resolución >= 0) {
			this.resolución = resolución;
		}

	}

	/**
	 * @return the resolución
	 */

	public double getResolución() {
		return resolución;
	}

	/**
	 * @return the sintonizadorTDT
	 */
	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	public double precioFinal() {
		double precioFinal = super.precioFinal();

		if (this.resolución > 40) {
			precioFinal = (precioFinal * 0.30) + precioFinal;
		}
		if (this.sintonizadorTDT == true) {
			precioFinal = +50;
		}
		return precioFinal;
	}
}
