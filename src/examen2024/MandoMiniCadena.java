/**
 * @author nruiz
 */
package examen2024;

/**
 * clase  MandoMiniCadena que hereda MandoDistancia e implementa Volumen
 */
public class MandoMiniCadena extends MandoDistancia implements Volumen {
	private int volumen;

	/**
	 * constructor vacio 
	 */
	public MandoMiniCadena() {
	}
/**
 *  constructor con todos los parametros que llama a la clase padre 
 * @param modelo
 * @param anchura
 * @param altura
 * @param precio
 * @param botonEncedido
 * @param volumen
 */
	public MandoMiniCadena(String modelo, double anchura, double altura, double precio, boolean botonEncedido,
			int volumen) {
		super(modelo, anchura, altura, precio, botonEncedido);
		if (volumen >= 0) {
			this.volumen = volumen;
		}
	}
/**
 * devueleve el volumen 
 * @return
 */
	public int getVolumen() {
		return volumen;
	}
/**
 * sube el volumen  
 */

	public void subirVolumen() {
		volumen += 10;
	}
/**
 * baja el voñumen 
 */
	public void bajarVolumen() {
		volumen -= 10;
	}
/**
 * toString de la clase padre reimplementado para añyadir los atributos 
 */
	@Override
	public String toString() {
		String mandoDistancia = super.toString();
		mandoDistancia += "volumen: " + volumen + "\n";
		return mandoDistancia;
	}
}
