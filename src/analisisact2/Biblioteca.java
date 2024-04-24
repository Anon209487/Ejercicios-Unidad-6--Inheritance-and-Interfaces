/**
 * 
 */
package analisisact2;

/**
 * 
 */
public abstract class Biblioteca implements Ficha {

	private int id;
	private String titulo = "";
	Biblioteca() {

	}

	Biblioteca(int id, String titulo) {
		if (id > 0) {
			this.id = id;
		}
		if (titulo != null && !titulo.equals("")) {
			this.titulo = titulo;
		}

	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	abstract int prestamo();

	public String toString() {
		String biblioteca = "El objeto es : " + "/n";
		biblioteca += "marca " + id + "/n";
		biblioteca += "modelo " + titulo + "/n";
		return biblioteca;
	}
}
