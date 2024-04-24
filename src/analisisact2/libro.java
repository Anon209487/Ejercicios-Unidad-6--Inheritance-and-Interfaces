/**
 * 
 */
package analisisact2;

/**
 * 
 */
public class libro extends Biblioteca {
	private String autor = "";
	private String editorial = "";

	libro() {

	}

	libro(String autor, String editorial, int id, String titulo) {
		super(id, titulo);
		if (editorial != null && !editorial.equals("")) {
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
		if (editorial != null && !editorial.equals("")) {
			this.editorial = editorial;
		}
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
		if (autor != null && !autor.equals("")) {
			this.autor = autor;
		}
	}

	public int prestamo() {
		return 15;
	}

	public String toString() {
		String biblioteca = super.toString();
		biblioteca += "autor " + autor + "\n";
		biblioteca += "editorial " + editorial + "\n";
		return biblioteca;
	}
}
