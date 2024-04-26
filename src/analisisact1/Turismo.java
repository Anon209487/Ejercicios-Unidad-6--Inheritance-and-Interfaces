/**
 * 
 */
package analisisact1;

/**
 * 
 */
public class Turismo extends Vehiculo {
	private int plazas;
	private tiposUso uso;

	private enum tiposUso {
		profesional, particular
	};

	Turismo() {
		super();
	}

	Turismo(String marca, String modelo, String color, String matrícula, int plazas, String uso) {
		super(marca, modelo, color, matrícula);
		if (plazas > 0) {
			this.plazas = plazas;
		}
		if (uso != null && !uso.equals("")) {
			if (uso.equalsIgnoreCase("profesional")) {
				this.setUso(tiposUso.profesional);
			} else if (uso.equalsIgnoreCase("particular")) {
				this.setUso(tiposUso.particular);
			}
		}
	}

	public boolean Parar() {
		return super.Parar();
	}

	public boolean Arrancar() {
		return super.Arrancar();
	}

	public String toString() {
		String Turismo = super.toString();
		Turismo += "\n" + "plazas " + plazas + "\n";
		Turismo += "uso " + plazas + "\n";
		return Turismo;
	}

	/**
	 * @return the uso
	 */
	public tiposUso getUso() {
		return uso;
	}

	/**
	 * @param uso the uso to set
	 */
	public void setUso(tiposUso uso) {
		this.uso = uso;
	}

}
