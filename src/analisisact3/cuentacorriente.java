package analisisact3;

public class cuentacorriente extends CuentaBancaria {
	private Transacion[] Transacciones = new Transacion[10];

	public cuentacorriente() {

	}

	public cuentacorriente(Titular Titular) {
		if (Titular != null) {
			añadirTitular(Titular);
		}

	}

	public void imprimirTransacciones() {

		for (int i = 0; i < Titulares.length; i++) {
			if (Titulares[i] != null) {
				System.out.println(Titulares[i]);
			}
		}
	}

	public void hacerTrnasaccion(Transacion transaccion) {
		int contador = 0;
		while (contador != Transacciones.length && Transacciones[contador] != null) {
			contador++;
		}
		Transacciones[contador] = transaccion;
	}

	/**
	 * @return the transacciones
	 */
	public Transacion[] getTransacciones() {
		return Transacciones;
	}

	/**
	 * @param transacciones the transacciones to set
	 */
	public void setTransacciones(Transacion[] transacciones) {
		Transacciones = transacciones;
	}

}
