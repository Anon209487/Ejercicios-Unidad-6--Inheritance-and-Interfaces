/**
 * 
 */
package analisisact3;

/**
 * 
 */
public class CuentaBancaria {
	Titular[] Titulares = new Titular[3];

	double fondos;
	double deuda;
	tipccuentas tipo;

	enum tipccuentas {
		ahorro, corriente
	}

	public CuentaBancaria() {

	}

	public CuentaBancaria(Titular Titular, String tipcsuentas) {
		if (Titular != null) {
			a�adirTitular(Titular);
		}
		if (tipcsuentas.equals("corriente")) {
			this.tipo = tipccuentas.corriente;
		} else if (tipcsuentas.equals("ahorro")) {
			this.tipo = tipccuentas.ahorro;
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
		String cuenta = "tipccuentas: " + tipo + "\n";
		cuenta += "Titulares: " + Titulares[0] + Titulares[1] + Titulares[2] + "\n";
		cuenta += "fondos: " + fondos + "\n";
		cuenta += "deuda: " + deuda + "\n";
		return cuenta;
	}

}
