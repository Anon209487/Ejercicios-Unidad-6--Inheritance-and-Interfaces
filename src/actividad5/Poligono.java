/**
 * 
 */
package actividad5;

/**
 * 
 */
abstract class Poligono {
	protected int numeroLados;

	public Poligono(int numeroLados) {
		this.numeroLados = numeroLados;
	}

	public int getNumeroLados() {
		return numeroLados;
	}

	public abstract double area();

	@Override
	public String toString() {
		return "Tipo: " + this.getClass().getSimpleName() + ", Numero de lados: " + numeroLados + ", Área: " + area();
	}
}
