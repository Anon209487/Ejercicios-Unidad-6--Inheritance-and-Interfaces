/**
 * 
 */
package analisisact1;

/**
 * 
 */
public class MianVehiculo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vehiculo coche = new Vehiculo();
		coche.Arrancar();
		double velocidad = 0;
		while (coche.getVelocidadaActual() != 0) {
			coche.setVelocidadaActual(velocidad);
			gato(coche);
			try {
				Thread.sleep(5 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		coche.Parar();

	}

	private static void gato(Vehiculo coche) {
		int numeroAleatorio = (int) (Math.random() * (100 - 1));
		if (numeroAleatorio < 10) {
			coche.Parar();
		}
	}

}
