package actividad2;

public class Oficial extends Operario {

	protected Oficial(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		String nombreYFuncion = super.toString();
		return nombreYFuncion = nombreYFuncion + " --> " + " Oficial ";
	}

}
