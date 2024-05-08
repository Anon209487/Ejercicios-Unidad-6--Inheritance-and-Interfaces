/**
 *   @author nruiz
 */
package examen2024;

import java.util.Arrays;

/**
 * calse ejecutable
 */
public class Ejecutable {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MandoDistancia[] mandos = new MandoDistancia[10];
		mandos[0] = new MandoTelevision("WRR", 2, 3, 4, false, 0, 0);
		mandos[1] = new MandoAspiradora("WRW", 2, 3, 4, false, 2);
		mandos[2] = new MandoAspiradora("ERE", 2, 3, 4, false, 0);
		mandos[3] = new MandoAireAcondicionado("ERE", 2, 3, 4, false, null, 0, 0);
		mandos[4] = new MandoDistancia("EDG", 2, 3, 4, false);
		mandos[5] = new MandoMiniCadena("DGD", 2, 3, 4, false, 2);
		mandos[6] = new MandoDistancia("DGD", 2, 3, 4, false);
		mandos[7] = new MandoDistancia("DGDG", 2, 3, 4, false);
		mandos[8] = new MandoDistancia("DGD", 2, 3, 4, false);
		mandos[9] = new MandoDistancia("GDG", 2, 3, 4, false);
		Arrays.sort(mandos);
		for (int i = 0; i < mandos.length; i++) {
			mandos[i].encenderMando();
			System.out.println(mandos[i]);
			if (mandos[i] instanceof MandoTelevision == true) {
				MandoTelevision p = new MandoTelevision();
				p = (MandoTelevision) mandos[i];

				p.cambiarCanal(10);
				p.bajarVolumen();
				p.subirVolumen();
				System.out.println(" CANAL " + p.getCanal() + " VOLUMEN " + p.getVolumen());
			}
			if (mandos[i] instanceof MandoMiniCadena == true) {
				MandoMiniCadena p = new MandoMiniCadena();
				p = (MandoMiniCadena) mandos[i];
				p.bajarVolumen();
				p.subirVolumen();
				System.out.println(" VOLUMEN " + p.getVolumen());
			}
			if (mandos[i] instanceof MandoAspiradora == true) {
				MandoAspiradora p = new MandoAspiradora();
				p = (MandoAspiradora) mandos[i];
				p.bajarVelocidad();
				p.subirVelocidad();
				System.out.println(" VELOCIDAD " + p.getVelocidadAspiracion());
			}
			if (mandos[i] instanceof MandoAireAcondicionado == true) {
				MandoAireAcondicionado p = new MandoAireAcondicionado();
				p = (MandoAireAcondicionado) mandos[i];
				p.cambiarTemperatura(i);
				p.cambiarModo();
				p.bajarVelocidad();
				p.subirVelocidad();
				System.out.println(" Temperatura " + p.getTemperatura() + " VELOCIDAD " + p.getVelocidad() + " TIPO "
						+ p.getTipo());
			}

		}
	}
}
