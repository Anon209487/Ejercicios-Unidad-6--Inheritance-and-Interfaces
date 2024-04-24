package analisisact2;

public class DVD extends Biblioteca {
	private int anyo;
	private String director = "";
	tiposUso genero;
	

	private enum tiposUso {
		documental, serie, película
	}

	DVD() {

	}

	DVD(int id, String titulo, int anyo, String director, String genero) {

		super(id, titulo);
		if (director != null && !director.equals("")) {
			this.director = director;
		}
		if (anyo > 0) {
			this.anyo = anyo;
		}
		if (genero != null && !genero.equals("")) {

			if (genero.equals("documental")) {
				this.genero = tiposUso.documental;
			} else if (genero.equals("serie")) {
				this.genero = tiposUso.serie;
			} else if (genero.equals("película")) {
				this.genero = tiposUso.película;
			}
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

	/**
	 * @return the director
	 */
	public String getDirector() {
		return director;
	}

	/**
	 * @param director the director to set
	 */
	public void setDirector(String director) {
		if (director != null && !director.equals("")) {
			this.director = director;
		}
	}



	public int prestamo() {
		return 5;
	}

	public String toString() {
		String dvd = super.toString();
		dvd += "anyo " + anyo + "\n";
		dvd += "director " + director + "\n";
		return dvd;
	}
}
