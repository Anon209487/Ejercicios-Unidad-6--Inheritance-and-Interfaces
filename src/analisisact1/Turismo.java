/**
 * 
 */
package analisisact1;

/**
 * 
 */
public class Turismo extends Vehiculo {
	private int plazas;
	private String uso = "";

	Turismo() {
		super();
	}

	Turismo(String marca, String modelo, String color, String matrícula, int plazas, String uso) {
		super(marca, modelo, color, matrícula);
		if (plazas > 0) {
			this.plazas = plazas;
		}
		if (uso != null && !uso.equals("")) {
			this.uso = uso;
		}
	}

	/**
	 * @return the plazas
	 */
	public int getPlazas() {
		return plazas;
	}

	/**
	 * @return the uso
	 */
	public String getUso() {
		return uso;
	}

	public boolean Parar() {
		return motorEncido;
	}

	public boolean Arrancar() {
		return motorEncido;
	}

	public int marchaSubir() {
		return 0;
	}

	public void marchaBajar() {
	}

	public String toString() {
		String Turismo=super.toString();
		Turismo 

		return vehiculo;
	}

}
