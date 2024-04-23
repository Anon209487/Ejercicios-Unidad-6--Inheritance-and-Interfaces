/**
 * 
 */
package analisisact2;

/**
 * 
 */
public class Libros extends Biblioteca {
	private String autor = "";
	private String editorial = "";
	private int réstamo = 15;

	Libros() {

	}

	Libros(String autor, String editorial, int id, String titulo) {
		super(id, titulo);
		if (titulo != null && !titulo.equals("")) {
			this.editorial = editorial;
		}
		if (autor != null && !autor.equals("")) {
			this.autor = autor;
		}
	}

	public String getEditorial() {
		return editorial;
	}

	/**
	 * @param editorial the editorial to set
	 */
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
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
		return réstamo;
	}

	public String toString() {
		String Biblioteca = super.toString();
		Biblioteca += "\n" + "autor " + autor + "\n";
		Biblioteca += "\n" + "editorial " + editorial + "\n";
		return Biblioteca;
	}
}
