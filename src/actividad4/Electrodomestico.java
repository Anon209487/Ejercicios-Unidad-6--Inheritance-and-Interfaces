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
	private char consumoenerg�tico = 'F';
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

	public Electrodomestico(double preciobase, String color, char consumoenerg�tico, double peso) {

		if (consumoenerg�tico != ' ') {
			comprobarConsumoEnergetico(consumoenerg�tico);
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
			this.consumoenerg�tico = letra;
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
		if (this.consumoenerg�tico == 'A') {
			precioFinal = +100;

		}
		if (this.consumoenerg�tico == 'B') {
			precioFinal = +80;

		}
		if (this.consumoenerg�tico == 'C') {
			precioFinal = +60;

		}
		if (this.consumoenerg�tico == 'D') {
			precioFinal = +40;

		}
		if (this.consumoenerg�tico == 'E') {
			precioFinal = +20;

		}
		if (this.consumoenerg�tico == 'F') {
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
	 * @return the consumoenerg�tico
	 */
	public char getConsumoenerg�tico() {
		return consumoenerg�tico;
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
