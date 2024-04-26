/**
 * 
 */
package analisisact3;

/**
 * 
 */
public class CuentaBancaria {
	Titular[] Titulares = new Titular[3];

	protected double fondos;
	protected double deuda;

	public CuentaBancaria() {

	}

	public CuentaBancaria(Titular Titular) {
		if (Titular != null) {
			a�adirTitular(Titular);
		}

	}

	public double ingresarDinero(double dinero) {
		if (dinero > 0) {

			fondos += dinero;
		}
		return fondos;

	}

	public double retirarDinero(double dinero) {
		if (dinero < 0) {

			fondos += dinero;
		}
		return fondos;
	}

	public void eliminarTitular(Titular Titular) {
		for (int i = 0; i < Titulares.length; i++) {
			if (Titulares[i] != null && Titular.equals(Titulares[i])) {
				Titulares[i] = null;
			}
		}

	}

	public boolean a�adirTitular(Titular Titular) {
		boolean a�adirTitular = true;
		int contador = 0;
		for (int i = 0; i < Titulares.length; i++) {
			if (Titulares[i] != null && Titular.equals(Titulares[i])) {
				a�adirTitular = false;
			}
		}
		if (a�adirTitular) {
			while (Titulares[contador] != null && contador < Titulares.length) {
				contador++;
			}
			Titulares[contador] = Titular;
		}
		return a�adirTitular;
	}

	public double prestamo(double dinero) {
		if (dinero > 0) {

			deuda += dinero * 0.25;
			fondos += dinero;
		}
		return fondos;
	}

	public String toString() {
		String cuenta = "cuenta " + "\n";
		cuenta += "Titulares: " + Titulares[0] + Titulares[1] + Titulares[2] + "\n";
		cuenta += "fondos: " + fondos + "\n";
		cuenta += "deuda: " + deuda + "\n";
		return cuenta;
	}

}
