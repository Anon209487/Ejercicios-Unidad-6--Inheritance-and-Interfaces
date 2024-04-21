/**
 * 
 */
package interfacesact3;

/**
 * 
 */
public class Gato extends AnimalDomestico {
	/**
	 * 
	 */
	@Override
	public boolean hacerCaso() {
		boolean hacerCaso = false;
		int numeroAleatorio = (int) (Math.random() * (100 - 0 + 1));
		if (numeroAleatorio < 6) {
			hacerCaso = true;
		}
		return hacerCaso;
	}

	/**
	 * 
	 */
	@Override
	public String hacerRuido() {
		return "MIAU";

	}

	/**
	 * 
	 * @return
	 */
	public String toserBolaPelo() {
		return "guah!";
	}
}