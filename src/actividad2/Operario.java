package actividad2;

public class Operario extends Empleado{

	protected Operario(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		String nombreYFuncion = super.toString();
		return nombreYFuncion = nombreYFuncion + " --> " + " Operario ";
	}

}
