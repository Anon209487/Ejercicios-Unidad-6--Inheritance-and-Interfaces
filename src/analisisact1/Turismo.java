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

	Turismo(String marca, String modelo, String color, String matr�cula, int plazas, String uso) {
		super(marca, modelo, color, matr�cula);
		if (plazas > 0) {
			this.plazas = plazas;
		}
		if (uso != null && !uso.equals("") ) {
			if (uso.equals("profesional") || uso.equals("particular")) {
				this.uso = tiposUso.valueOf(uso);
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
