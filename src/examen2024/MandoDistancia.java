/**
 * @author nruiz
 */
package examen2024;

/**
 * CLASE MandoDistancia QUE ENGLOBA LOS MANDOS A DISTANICA
 */
public class MandoDistancia implements Comparable<Object> {
	/**
	 * indica el modelo
	 */
	private String modelo = "";
	/**
	 * indica la anchura
	 */
	private double anchura;
	/**
	 * indica la altura
	 */
	private double altura;
	/**
	 * indica el precio
	 */
	private double precio;
	/**
	 * indica el botonEncedido
	 */
	private boolean botonEncedido = false;

	/**
	 * CONSTRUCTOR VACIO
	 */
	public MandoDistancia() {

	}

	/**
	 * CONSTRUCTOR COMPLETO
	 * 
	 * @param modelo
	 * @param anchura
	 * @param altura
	 * @param precio
	 * @param botonEncedido
	 */
	public MandoDistancia(String modelo, double anchura, double altura, double precio, boolean botonEncedido) {
		if (modelo != null && !modelo.equals("")) {
			this.modelo = modelo;
		}
		if (anchura > 0) {
			this.anchura = anchura;
		}
		if (altura > 0) {
			this.altura = altura;
		}
		if (precio > 0) {
			this.anchura = precio;
		}
		this.botonEncedido = botonEncedido;
	}

	/**
	 * ENCIENDE EL MANDO
	 */
	public void encenderMando() {
		botonEncedido = true;
	}

	/**
	 * apaga EL MANDO
	 */
	public void apagarMando() {
		botonEncedido = false;
	}

	/**
	 * compara el modelo de los objetos para ordenarlos
	 */
	public int compareTo(Object obj) {
		int res = 0;
		MandoDistancia per = (MandoDistancia) obj;
		int comparedResult = this.modelo.compareTo(per.modelo);
		if (comparedResult < 0) {
			res = -1;
		} else if (comparedResult > 0) {
			res = 1;
		}
		return res;
	}

	/**
	 * Compara objetos un mando es igual a otro si comparten el modelo
	 */
	public boolean equals(Object o) {
		boolean res = false;
		MandoDistancia mandoDistanciaComparacion = (MandoDistancia) o;
		if (modelo.equals(mandoDistanciaComparacion.modelo)) {
			res = true;
		}
		return res;
	}

	/**
	 * imprime mando
	 */
	public String toString() {
		String mandoDistancia = "modelo: " + modelo + "\n";
		mandoDistancia += "anchura: " + anchura + "\n";
		mandoDistancia += "altura: " + altura + "\n";
		mandoDistancia += "precio: " + precio + "\n";
		mandoDistancia += "botonEncedido: " + botonEncedido + "\n";
		return mandoDistancia;
	}
}
