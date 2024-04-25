/**
 * 
 */
package analisisact4;

/**
 * 
 */
public class Persona extends Contacto {

	private String cumpleaños = "";

	Persona() {
	}

	Persona(String nombre, String telefono, String cumpleaños) {
		super(nombre, telefono);

		if (cumpleaños != null && !cumpleaños.equals("")) {

			this.cumpleaños = cumpleaños;
		}

	}

	/**
	 * @return the cumpleaños
	 */
	public String getCumpleaños() {
		return cumpleaños;
	}

	/**
	 * @param cumpleaños the cumpleaños to set
	 */
	public void setCumpleaños(String cumpleaños) {
		if (cumpleaños != null && !cumpleaños.equals("")) {
			this.cumpleaños = cumpleaños;
		}
	}

	public String toString() {
		String persona = super.toString();
		persona+="cumpleaños" +cumpleaños + "/n";
		return persona;
	}
}
