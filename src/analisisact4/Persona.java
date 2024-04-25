/**
 * 
 */
package analisisact4;

/**
 * 
 */
public class Persona extends Contacto {

	private String cumplea�os = "";

	Persona() {
	}

	Persona(String nombre, String telefono, String cumplea�os) {
		super(nombre, telefono);

		if (cumplea�os != null && !cumplea�os.equals("")) {

			this.cumplea�os = cumplea�os;
		}

	}

	/**
	 * @return the cumplea�os
	 */
	public String getCumplea�os() {
		return cumplea�os;
	}

	/**
	 * @param cumplea�os the cumplea�os to set
	 */
	public void setCumplea�os(String cumplea�os) {
		if (cumplea�os != null && !cumplea�os.equals("")) {
			this.cumplea�os = cumplea�os;
		}
	}

	public String toString() {
		String persona = super.toString();
		persona+="cumplea�os" +cumplea�os + "/n";
		return persona;
	}
}
