/**
 * 
 */
package analisisact4;

/**
 * 
 */
public class Empresa extends Contacto {
	private String p�ginaweb = "";

	Empresa() {
	}

	Empresa(String nombre, String telefono, String p�ginaweb) {
		super(nombre, telefono);

		if (p�ginaweb != null && !p�ginaweb.equals("")) {

			this.p�ginaweb = p�ginaweb;
		}
	}

	/**
	 * @return the p�ginaweb
	 */
	public String getP�ginaweb() {
		return p�ginaweb;
	}

	/**
	 * @param p�ginaweb the p�ginaweb to set
	 */
	public void setP�ginaweb(String p�ginaweb) {
		if (p�ginaweb != null && !p�ginaweb.equals("")) {

			this.p�ginaweb = p�ginaweb;
		}
	}

	public String toString() {
		String empresa = super.toString();
		empresa += "empresa" + empresa + "/n";
		return empresa;
	}
}
