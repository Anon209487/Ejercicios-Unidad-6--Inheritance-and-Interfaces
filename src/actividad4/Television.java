/**
 * 
 */
package actividad4;

/**
 * 
 */
public class Television extends Electrodomestico {
	private double resoluci�n = 20;
	private boolean sintonizadorTDT = false;

	public Television() {

	}

	public Television(double precio, double doublepeso) {

		super(precio, doublepeso);
	}

	public Television(double preciobase, String color, char consumoenerg�tico, double peso, double resoluci�n,
			boolean sintonizadorTDT) {

		super(preciobase, color, consumoenerg�tico, peso);
		if (resoluci�n >= 0) {
			this.resoluci�n = resoluci�n;
		}

	}

	/**
	 * @return the resoluci�n
	 */

	public double getResoluci�n() {
		return resoluci�n;
	}

	/**
	 * @return the sintonizadorTDT
	 */
	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	public double precioFinal() {
		double precioFinal = super.precioFinal();

		if (this.resoluci�n > 40) {
			precioFinal = (precioFinal * 0.30) + precioFinal;
		}
		if (this.sintonizadorTDT == true) {
			precioFinal = +50;
		}
		return precioFinal;
	}
}
