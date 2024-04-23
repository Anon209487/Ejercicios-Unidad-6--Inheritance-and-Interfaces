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
		coche.setVelocidadaActual(velocidad);

		try {
			Thread.sleep(5 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		coche.setVelocidadaActual(velocidad);
		coche.Parar();
	}

}
