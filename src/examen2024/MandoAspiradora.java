/**
 * * @author nruiz
 */
package examen2024;

/**
 * MandoAspiradora hereda de MandoDistancia e implement Velocidad
 */
public class MandoAspiradora extends MandoDistancia implements Velocidad {
	private int velocidadAspiracion = 0;

	/**
	 * cosntrcutor vacio
	 */
	public MandoAspiradora() {

	}

	/**
	 * constructor con todos los parametros
	 * 
	 * @param modelo
	 * @param anchura
	 * @param altura
	 * @param precio
	 * @param botonEncedido
	 * @param velocidadAspiracion
	 */
	public MandoAspiradora(String modelo, double anchura, double altura, double precio, boolean botonEncedido,
			int velocidadAspiracion) {
		super(modelo, anchura, altura, precio, botonEncedido);
		if (velocidadAspiracion >= 0 && velocidadAspiracion <= 3) {
			this.velocidadAspiracion = velocidadAspiracion;
		}
	}

	/**
	 * devuelve la velocidad
	 * 
	 * @return
	 */
	public int getVelocidadAspiracion() {
		return velocidadAspiracion;
	}

	/**
	 * sube la velocidad
	 */
	public void subirVelocidad() {
		if (velocidadAspiracion < 3) {
			velocidadAspiracion++;
		}
	}

	/**
	 * baja la velocidad
	 */
	public void bajarVelocidad() {
		if (velocidadAspiracion > 0) {
			velocidadAspiracion--;
		}
	}

	/**
	 * toString modificado de la clase padre para anyadir atributos propios
	 */
	@Override
	public String toString() {
		String mandoDistancia = super.toString();
		mandoDistancia += "velocidadAspiracion: " + velocidadAspiracion + "\n";
		return mandoDistancia;
	}
}