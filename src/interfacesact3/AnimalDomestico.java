/**
 * 
 */
package interfacesact3;

/**
 * 
 */
public class AnimalDomestico extends Animal {
	/**
	 * 
	 */
	private String nombre = "";
	private String raza = "";
	private double peso = 0;
	private String color = "";

	public void vacunar() {
	}

	public boolean hacerCaso() {
		return false;
	}

	@Override

	public void comer() {
	}

	@Override

	public void dormir() {
	}

	@Override

	public String hacerRuido() {
		return "";
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the raza
	 */
	public String getRaza() {
		return raza;
	}

	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

}
