/**
 * 
 */
package analisisact2;

/**
 * 
 */
public class Revistas extends Biblioteca {
	private int anyo;
	private int numero;

	/**
	 * 
	 */
	Revistas() {

	}

	Revistas(int id, String titulo, int anyo, int numero) {
		super(id, titulo);
		if (anyo > 0) {
			this.anyo = anyo;
		}
		if (numero > 0) {
			this.numero = numero;
		}
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		if (numero > 0) {
			this.numero = numero;
		}

	}

	/**
	 * @return the anyo
	 */
	public int getAnyo() {
		return anyo;
	}

	/**
	 * @param anyo the anyo to set
	 */
	public void setAnyo(int anyo) {
		if (anyo > 0) {
			this.anyo = anyo;
		}
	}

	public int prestamo() {
		return 10;
	}

	public String toString() {
		String revista = super.toString();
		revista += "anyo " + anyo + "\n";
		revista += "numero " + numero + "\n";
		return revista;
	}
}
