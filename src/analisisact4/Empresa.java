/**
 * 
 */
package analisisact4;

/**
 * 
 */
public class Empresa extends Contacto {
	private String páginaweb = "";

	Empresa() {
	}

	Empresa(String nombre, String telefono, String páginaweb) {
		super(nombre, telefono);

		if (páginaweb != null && !páginaweb.equals("")) {

			this.páginaweb = páginaweb;
		}
	}

	/**
	 * @return the páginaweb
	 */
	public String getPáginaweb() {
		return páginaweb;
	}

	/**
	 * @param páginaweb the páginaweb to set
	 */
	public void setPáginaweb(String páginaweb) {
		if (páginaweb != null && !páginaweb.equals("")) {

			this.páginaweb = páginaweb;
		}
	}

	public String toString() {
		String empresa = super.toString();
		empresa += "empresa" + empresa + "/n";
		return empresa;
	}
}
