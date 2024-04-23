/**
 * 
 */
package analisisact1;

/**
 * 
 */
public class Camion extends Vehiculo {
	private double pesoMximo;
	private boolean mercanciaPligrosa;

	Camion() {
		super();
	}

	Camion(String marca, String modelo, String color, String matrícula, int pesoMximo, boolean mercanciaPligrosa) {
		super(marca, modelo, color, matrícula);
		if (pesoMximo > 0) {
			this.pesoMximo = pesoMximo;
		}
		this.mercanciaPligrosa = mercanciaPligrosa;
	}

	/**
	 * @return the pesoMximo
	 */
	public double getPesoMximo() {
		return pesoMximo;
	}

	/**
	 * @return the mercanciaPligrosa
	 */
	public boolean isMercanciaPligrosa() {
		return mercanciaPligrosa;
	}

	public boolean Parar() {
		return super.Parar();
	}

	public boolean Arrancar() {
		return super.Arrancar();
	}

	public String toString() {
		String Camion = super.toString();
		Camion += "\n" + "pesoMximo " + pesoMximo + "\n";
		Camion += "mercanciaPligrosa " + mercanciaPligrosa + "\n";
		return Camion;
	}

}
