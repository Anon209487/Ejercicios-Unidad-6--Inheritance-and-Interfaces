/**
 * 
 */
package analisisact1;

/**
 * 
 */
public class Vehiculo {
	private String marca = "";
	private String modelo = "";
	private String color = "";
	private String matrícula = "";
	protected boolean motorEncido = false;
	private int marchaActual = 0;
	private double velocidadaActual = 0;

	Vehiculo() {

	}

	Vehiculo(String marca, String modelo, String color, String matrícula) {
		if (marca != null && !marca.equals("")) {
			this.marca = marca;
		}
		if (modelo != null && !modelo.equals("")) {
			this.modelo = modelo;
		}
		if (color != null && !color.equals("")) {
			this.marca = marca;
		}
		if (matrícula != null && !matrícula.equals("")) {
			this.marca = marca;
		}
	}

	/**
	 * @return the marchaActual
	 */
	public double getMarchaActual() {
		return marchaActual;
	}

	/**
	 * @param marchaActual the marchaActual to set
	 */
	public void setMarchaActual(int marchaActual) {
		if (marchaActual > 0) {
			this.marchaActual = marchaActual;
		}

	}

	/**
	 * @return the velocidadaActual
	 */
	public double getVelocidadaActual() {
		return velocidadaActual;
	}

	/**
	 * @param velocidadaActual the velocidadaActual to set
	 */
	public void setVelocidadaActual(double velocidadaActual) {
		if (velocidadaActual > 0) {
			this.velocidadaActual = velocidadaActual;
			if (velocidadaActual < 30 && velocidadaActual >= 50) {
				setMarchaActual(1);
			} else if (velocidadaActual < 30 && velocidadaActual >= 50) {
				setMarchaActual(2);
			} else if (velocidadaActual < 50 && velocidadaActual >= 70) {
				setMarchaActual(3);
			} else if (velocidadaActual < 70 && velocidadaActual >= 50) {
				setMarchaActual(4);
			} else if (velocidadaActual > 100) {
				setMarchaActual(5);
			}

		}
	}

	public boolean Parar() {
		boolean motorEncido = true;
		return motorEncido;
	}

	public boolean Arrancar() {
		boolean motorEncido = true;
		return motorEncido;
	}

	public String toString() {
		String vehiculo = "El veihiculo es : " + "/n";
		vehiculo += "marca " + marca + "/n";
		vehiculo += "modelo " + modelo + "/n";
		vehiculo += "color " + color + "/n";
		vehiculo += "matrícula " + matrícula + "/n";
		return vehiculo;
	}

}
