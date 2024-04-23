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
	private boolean motorEncido = false;
	private boolean motorapagado = true;
	private double marchaActual = 0;
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
	 * @return the motorEncido
	 */
	public boolean isMotorEncido() {
		return motorEncido;
	}

	/**
	 * @param motorEncido the motorEncido to set
	 */
	public void setMotorEncido(boolean motorEncido) {
		this.motorEncido = motorEncido;
	}

	/**
	 * @return the motorapagado
	 */
	public boolean isMotorapagado() {
		return motorapagado;
	}

	/**
	 * @param motorapagado the motorapagado to set
	 */
	public void setMotorapagado(boolean motorapagado) {
		this.motorapagado = motorapagado;
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
	public void setMarchaActual(double marchaActual) {
		this.marchaActual = marchaActual;
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
		this.velocidadaActual = velocidadaActual;
	}

	public boolean Parar() {
		return motorEncido;
	}

	public boolean Arrancar() {
		return motorEncido;
	}

	public int marchaSubir() {
		return 0;
	}

	public void marchaBajar() {
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
