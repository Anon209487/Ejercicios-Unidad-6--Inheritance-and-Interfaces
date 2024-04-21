/**
 * 
 */
package actividad4;

public class EjecutableProductos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		double sumaLavadora = 0;
		double sumaElectrodomesticos = 0;
		double sumaTelevision = 0;
		Electrodomestico[] electrodomesticos = new Electrodomestico[9];
		Electrodomestico electrodomestico1 = new Electrodomestico(2.2, "blanco", 'C', 442);
		electrodomesticos[0] = electrodomestico1;
		Electrodomestico lavadora = new Lavadora(24, "Rojo", 'D', 8.8, 38);
		electrodomesticos[1] = lavadora;
		Electrodomestico lavadora2 = new Lavadora(24, "Rojo", 'D', 8.8, 38);
		electrodomesticos[4] = lavadora2;
		Electrodomestico television = new Television(46, "azul", 'E', 54, 324, true);
		electrodomesticos[2] = television;
		Electrodomestico television2 = new Television(46, "azul", 'E', 54, 324, true);
		electrodomesticos[3] = television2;
		for (int i = 0; i < electrodomesticos.length; i++) {
			if (electrodomesticos[i] != null) {
				System.out.println(
						"--------------------------------------------------------------------------------------------------------------------------");
				System.out.print("| La clase es: (" + electrodomesticos[i].getClass().getName() + ")   ===>   ");
				System.out
						.print("| El precio final es: (" + electrodomesticos[i].precioFinal() + ") $ " + "   ===>   ");
				System.out.print("| El precio base es: (" + electrodomesticos[i].getPreciobase() + ") $ " + "\n");
				System.out.println(
						"-------------------------------------------------------------------------------------------------------------------------");

				if (electrodomesticos[i] instanceof Lavadora == true) {
					sumaLavadora = (electrodomesticos[i].precioFinal() + sumaLavadora);
				}
				if (electrodomesticos[i] instanceof Electrodomestico == true) {
					sumaElectrodomesticos = (electrodomesticos[i].precioFinal() + sumaElectrodomesticos);
				}
				if (electrodomesticos[i] instanceof Television == true) {
					sumaTelevision = (electrodomesticos[i].precioFinal() + sumaTelevision);
				}
			}
		}
		System.out.println("\n"
				+ "--------------------------------------------------------------------------------------------------------------------------");
		System.out.println("| La suma de la clase televisores es: (" + sumaTelevision + ") $ ");
		System.out.println("| La suma de la clase Electrodomesticos es: (" + sumaElectrodomesticos + ") $ ");
		System.out.println("| La suma de la clase Lavadora es: (" + sumaLavadora + ") $ ");

		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------------");
	}
}
