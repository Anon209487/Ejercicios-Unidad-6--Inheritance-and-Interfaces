/**
 * 
 */
package actividad1;

import java.util.Scanner;

/**
 * 
 */
public class HoraMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HoraExacta HoraExacta1 = HoraMain.crearHora();
		HoraMain.reloj(HoraExacta1);
		HoraMain.modificarsegundos(HoraExacta1);
	}
	public static HoraExacta crearHora() {
		Scanner scanner = new Scanner(System.in);
		int segundo;
		int minutos;
		int horas;
		System.out.println("selecciona hora minutos y segundos");
		horas = scanner.nextInt();
		minutos = scanner.nextInt();
		segundo = scanner.nextInt();
		HoraExacta HoraExacta1 = new HoraExacta(horas, minutos, segundo);
		scanner.close();
		return HoraExacta1;
	}

	public static void reloj(HoraExacta HoraExacta1) {
		while (true) {
			System.out.println(HoraExacta1.toString());
			HoraExacta1.setSegundo(HoraExacta1.getSegundos() + 1);

			if (HoraExacta1.getSegundos() == 60) {
				HoraExacta1.setMinutos(HoraExacta1.getMinutos() + 1);
				HoraExacta1.setSegundo(0);
			}
			if (HoraExacta1.getMinutos() == 60) {
				HoraExacta1.setHora(HoraExacta1.getHora() + 1);
				HoraExacta1.setMinutos(0);
			}
			if (HoraExacta1.getHora() == 24) {
				HoraExacta1.setHora(0);
			}

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}

	public static void modificarsegundos(HoraExacta tHoraExacta1) {
		tHoraExacta1.inc();
	}
}
