/**
 * 
 */
package analisisact3;

/**
 * 
 */
public class Transacion {
	private double porcentaje;
	private String fecha = "";
	private double importe;

	Transacion() {
	}

	Transacion(double porcentaje, String fecha, double importe) {
		if (porcentaje > 0) {
			this.porcentaje = porcentaje;
		}
		if (importe > 0) {
			this.importe = importe;
		}
		if (fecha != null && !fecha.equals("")) {
			this.fecha = fecha;
		}
	}

	/**
	 * @return the porcentaje
	 */
	public double getPorcentaje() {
		return porcentaje;
	}

	/**
	 * @param porcentaje the porcentaje to set
	 */
	public void setPorcentaje(double porcentaje) {
		if (porcentaje > 0) {
			this.porcentaje = porcentaje;
		}
	}

	/**
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(String fecha) {
		if (fecha != null && !fecha.equals("")) {
			this.fecha = fecha;
		}
	}

	/**
	 * @return the importe
	 */
	public double getImporte() {
		return importe;
	}

	/**
	 * @param importe the importe to set
	 */
	public void setImporte(double importe) {
		this.importe = importe;
	}

	public String toString() {
		String transacion = "La transaccion tiene los siguentes datos:" + "/n";
		transacion += "porcentaje" + porcentaje + "%" + "/n";
		transacion += "fecha" + fecha + "/n";
		transacion += "importe" + importe + "$" + "/n";
		return transacion;
	}
}
