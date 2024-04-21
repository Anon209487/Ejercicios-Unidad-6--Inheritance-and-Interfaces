/**
 * 
 */
package interfacesact3;

/**
 * 
 */
public class Perro extends AnimalDomestico {
	@Override

	public String hacerRuido() {
		return "GUAU";

	}

	@Override

	public boolean hacerCaso() {
		boolean hacerCaso = false;
		int numeroAleatorio = (int) (Math.random() * (10 - 0 + 1));
		if (numeroAleatorio < 9) {
			hacerCaso = true;
		}
		return hacerCaso;
	}

	public boolean sacarPaseo() {
		return true;
	}
}
