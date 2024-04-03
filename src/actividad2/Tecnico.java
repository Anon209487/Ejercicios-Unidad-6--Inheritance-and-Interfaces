package actividad2;

public class Tecnico extends Operario {

	protected Tecnico(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		String nombreYFuncion = super.toString();
		return nombreYFuncion = nombreYFuncion + " --> " + " Tecnico ";
	}

}
