/**
 * 
 */
package actividad4;

/**
 * 
 */
public class Electrodomestico {
	private double preciobase = 100;
	private String color = "blanco";
	private char consumoenergético = 'F';
	private double peso = 5;

	/**
	 * 
	 */
	public Electrodomestico() {

	}

	public Electrodomestico(double preciobase, double peso) {

		if (preciobase >= 0) {
			this.preciobase = preciobase;
		}
		if (peso >= 0) {
			this.peso = peso;
		}

	}

	public Electrodomestico(double preciobase, String color, char consumoenergético, double peso) {

		if (consumoenergético != ' ') {
			comprobarConsumoEnergetico(consumoenergético);
		}

		if (color != null && color != "") {
			comprobarColor(color);
		}

		if (preciobase >= 0) {
			this.preciobase = preciobase;
		}
		if (peso >= 0) {
			this.peso = peso;
		}
	}

	public void comprobarConsumoEnergetico(char letra) {
		if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'F' || letra == 'E') {
			this.consumoenergético = letra;
		}

	}

	public void comprobarColor(String color) {
		color = color.toLowerCase();
		if (color == "blanco" || color == "negro" || color == "rojo" || color == "azul" || color == "gris") {
			this.color = color;
		}
	}

	public double precioFinal() {
		double precioFinal = preciobase;
		if (this.consumoenergético == 'A') {
			precioFinal = +100;

		}
		if (this.consumoenergético == 'B') {
			precioFinal = +80;

		}
		if (this.consumoenergético == 'C') {
			precioFinal = +60;

		}
		if (this.consumoenergético == 'D') {
			precioFinal = +40;

		}
		if (this.consumoenergético == 'E') {
			precioFinal = +20;

		}
		if (this.consumoenergético == 'F') {
			precioFinal = +10;

		}
		if (this.peso >= 80) {
			precioFinal = +100;

		}
		if (this.peso < 80 && this.peso >= 50) {
			precioFinal = +80;

		}
		if (this.peso < 50 && this.peso >= 20) {
			precioFinal = +50;

		}
		if (this.peso < 20 && this.peso >= 0) {
			precioFinal = +10;

		}
		return precioFinal;

	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @return the consumoenergético
	 */
	public char getConsumoenergético() {
		return consumoenergético;
	}

	/**
	 * @return the preciobase
	 */
	public double getPreciobase() {
		return preciobase;
	}

	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}

}
