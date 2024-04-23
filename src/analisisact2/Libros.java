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
	private int r�stamo = 15;

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
	 * @return the r�stamo
	 */
	public int getR�stamo() {
		return r�stamo;
	}

	/**
	 * @param r�stamo the r�stamo to set
	 */
	public void setR�stamo(int r�stamo) {
		this.r�stamo = r�stamo;
	};

	public int prestamo() {
		return r�stamo;
	}

	public String toString() {
		String Biblioteca = super.toString();
		Biblioteca += "\n" + "autor " + autor + "\n";
		Biblioteca += "\n" + "editorial " + editorial + "\n";
		return Biblioteca;
	}
}
