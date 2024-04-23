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
	private int réstamo = 10;

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
		this.numero = numero;
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
		this.anyo = anyo;
	}

	/**
	 * @return the réstamo
	 */
	public int getRéstamo() {
		return réstamo;
	}

	/**
	 * @param réstamo the réstamo to set
	 */
	public void setRéstamo(int réstamo) {
		this.réstamo = réstamo;
	};

	public int prestamo() {
		return anyo;
	}

	public String toString() {
		String Revistas = super.toString();
		Revistas += "\n" + "anyo " + anyo + "\n";
		Revistas += "\n" + "numero " + numero + "\n";
		return Revistas;
	}
}
