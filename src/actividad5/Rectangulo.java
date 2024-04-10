/**
 * 
 */
package actividad5;

/**
 * 
 */
class Rectangulo extends Poligono {
	private double base;
	private double altura;

	public Rectangulo() {
		super(4);
	}

	public Rectangulo(double lado1, double lado2) {
		super(4);
		this.base = lado1;
		this.altura = lado2;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double area() {
		return base * altura;
	}

	@Override
	public String toString() {
		return "Tipo: " + this.getClass().getSimpleName() + ", Numero de lados: " + numeroLados + ", Área: " + area();
	}

}
