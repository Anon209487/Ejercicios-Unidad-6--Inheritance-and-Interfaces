/**
 * 
 */
package analisisact1;

/**
 * 
 */
public class Moto extends Vehiculo {
	private double cilindrada;

	Moto() {
		super();
	}

	Moto(String marca, String modelo, String color, String matrícula, int cilindrada) {
		super(marca, modelo, color, matrícula);
		if (cilindrada > 0) {
			this.cilindrada = cilindrada;
		}

	}

	/**
	 * @return the cilindrada
	 */
	public double getCilindrada() {
		return cilindrada;
	}

	public boolean Parar() {
		return super.Parar();
	}

	public boolean Arrancar() {
		return super.Arrancar();
	}

	public static boolean requiereCarnet() {
		boolean requiereCarnet = false;
		return requiereCarnet;
	}

	public String toString() {
		String Moto = super.toString();
		Moto += "\n" + "cilindrada " + cilindrada + "\n";
		return Moto;
	}
}