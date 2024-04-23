package analisisact2;

public class DVD extends Biblioteca {
	private int anyo;
	private String director = "";
	tiposUso genero;
	private int réstamo = 5;

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
	};

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
		String DVD = super.toString();
		DVD += "\n" + "anyo " + anyo + "\n";
		DVD += "\n" + "director " + director + "\n";
		return DVD;
	}
}
