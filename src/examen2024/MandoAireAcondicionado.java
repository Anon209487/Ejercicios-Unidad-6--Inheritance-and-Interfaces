/**
 *  * @author nruiz
 */
package examen2024;

/**
 * MandoAireAcondicionado implementa Velocidad y hereda  MandoDistancia 
 */
public class MandoAireAcondicionado extends MandoDistancia implements Velocidad {
	private enum modosMando {
		frio, calor
	}

	private modosMando tipo;
	private double temperatura;
	private double velocidad = 0;
/**
 * cosntructor vacio 
 */
	public MandoAireAcondicionado() {

	}
/**
 *  cosntrcutor con todos l o parametros llama a la clase padre 
 * @param modelo
 * @param anchura
 * @param altura
 * @param precio
 * @param botonEncedido
 * @param tipoMando
 * @param temperatura
 * @param velocidad
 */
	public MandoAireAcondicionado(String modelo, double anchura, double altura, double precio, boolean botonEncedido,
			String tipoMando, double temperatura, double velocidad) {
		super(modelo, anchura, altura, precio, botonEncedido);

		if (tipoMando != null && !tipoMando.equals("")) {
			if (tipoMando.equals("calor") || tipoMando.equals("frio")) {
				tipo = modosMando.valueOf(tipoMando);
			} else {
				tipo = modosMando.frio;
			}
		}
		if (temperatura >= 0) {
			this.temperatura = temperatura;
		}
		if (velocidad >= 0 && velocidad <= 5) {
			this.velocidad = velocidad;
		}
	}
/**
 *  devuleve la temopertarura 
 * @return
 */
	public double getTemperatura() {
		return temperatura;
	}


/**
 * devuleve velocidad
 * @return
 */
	public double getVelocidad() {
		return velocidad;
	}


/**
 * devuelve el tipo 
 * @return
 */
	public String getTipo() {
		String getTipo = String.valueOf(tipo);
		return getTipo;
	}

/**
 * cambia el modo 
 */
	public void cambiarModo() {
		if (tipo == modosMando.calor) {
			tipo = modosMando.frio;
		} else {
			tipo = modosMando.calor;
		}
	}
/**
 * cambia la temperatura 
 * @param temperatura
 */
	public void cambiarTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
/**
 * sube la velocidad
 */
	public void subirVelocidad() {
		if (velocidad < 5) {
			velocidad = velocidad + 3;
			if (velocidad > 5) {
				velocidad = 5;
			}
		}
	}
/**
 * baja la velocidad 
 */
	public void bajarVelocidad() {
		if (velocidad > 0) {
			velocidad = velocidad - 3;
		}
		if (velocidad < 0) {
			velocidad = 0;
		}
	}
/**
 * metdodo toString heredado que añade atributos 
 */
	@Override
	public String toString() {
		String mandoDistancia = super.toString();
		mandoDistancia += "tipo: " + tipo + "\n";
		mandoDistancia += "temperatura: " + temperatura + "\n";
		mandoDistancia += "velocidad: " + velocidad + "\n";
		return mandoDistancia;
	}
}
