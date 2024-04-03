package actividad2;

public class Directivo extends Empleado {

	protected Directivo(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		String nombreYFuncion = super.toString();
		return nombreYFuncion = nombreYFuncion + " --> " + " Directivo ";
	}

}
