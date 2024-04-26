/**
 * 
 */
package analisisact3;

/**
 * 
 */
public class CuentaAhorro extends CuentaBancaria {
	private double mantenimiento;
	private double interes;

	public CuentaAhorro() {

	}

	public CuentaAhorro(Titular Titular, double mantenimiento, double interes) {
		if (Titular != null) {
			super.añadirTitular(Titular);
		}
		if (mantenimiento > 0) {
			this.mantenimiento = mantenimiento;
		}
		if (interes > 0) {
			this.mantenimiento = interes;
		}
	}

	/**
	 * @return the mantenimiento
	 */
	public double getMantenimiento() {
		return mantenimiento;
	}

	/**
	 * @param mantenimiento the mantenimiento to set
	 */
	public void setMantenimiento(double mantenimiento) {
		if (mantenimiento > 0) {
			this.mantenimiento = mantenimiento;
		}
	}

	/**
	 * @return the interes
	 */
	public double getInteres() {
		return interes;
	}

	/**
	 * @param interes the interes to set
	 */
	public void setInteres(double interes) {
		if (interes > 0) {
			this.mantenimiento = interes;
		}
	}

	public double intereses() {
		if (fondos > 0) {

			fondos += fondos * mantenimiento;
			fondos += fondos;
		}
		return fondos;
	}

	public double cuotaMantenimiento() {
		fondos -= mantenimiento;
		return fondos;

	}
}
