/**
 * 
 * @author nruiz
 */

package examen2024;

/**
 * clase MandoTelevision que hereda de MandoDistancia y contiene la interfaz
 * Volumen
 */
public class MandoTelevision extends MandoDistancia implements Volumen {
	private int canal;
	private int volumen;

	/**
	 * constrcutor vacio
	 */
	public MandoTelevision() {

	}

	/**
	 * construcror toodos los parametros llama al constructor padre
	 * 
	 * @param modelo
	 * @param anchura
	 * @param altura
	 * @param precio
	 * @param botonEncedido
	 * @param volumen
	 * @param canal
	 */
	public MandoTelevision(String modelo, double anchura, double altura, double precio, boolean botonEncedido,
			int volumen, int canal) {
		super(modelo, anchura, altura, precio, botonEncedido);
		if (volumen >= 0) {
			this.volumen = volumen;
		}
		if (canal >= 0) {
			this.canal = canal;
		}
	}

	/**
	 * retorna el canal
	 * 
	 * @return
	 */
	public int getCanal() {
		return canal;
	}

	/**
	 * retorna el volumen
	 * 
	 * @return
	 */
	public int getVolumen() {
		return volumen;
	}

	/**
	 * cambia el canal
	 * 
	 * @param canal
	 */
	public void cambiarCanal(int canal) {
		if (canal >= 0) {
			this.canal = canal;
		}
	}

	/**
	 * sube el volumen
	 */
	public void subirVolumen() {
		volumen += 5;
	}

	/**
	 * baja el volumen
	 */
	public void bajarVolumen() {
		volumen -= 5;
	}
/**
 * metodo toString que modifica a la clase padre y añade sus atributos 
 */
	@Override
	public String toString() {
		String mandoDistancia = super.toString();
		mandoDistancia += "canal: " + canal + "\n";
		mandoDistancia += "volumen: " + volumen + "\n";
		return mandoDistancia;
	}
}
