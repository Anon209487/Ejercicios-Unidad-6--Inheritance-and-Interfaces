/**
 * 
 */
package actividad3;

/**
 * 
 */
public class ArrayProductos {
	static Producto[] productos = new Producto[10];

	/**
	 * 
	 * @param nombre
	 */
	public static void nuevoProductoArrayProductose(Producto nombre) {
		boolean verificacion = false;
		int contador = 0;
		for (int j = 0; j < 9; j++) {
			if (productos[j] != null && (productos[j].equals(nombre))) {
				verificacion = true;
			}
		}
		if (nombre != null) {
			while (contador < productos.length && verificacion == false) {
				if (productos[contador] == null) {
					productos[contador] = nombre;

				}

				contador++;
			}
		}

	}

	/**
	 * 
	 */

	public static void ListarroductosArray() {
		for (int i = 0; i < productos.length; i++) {
			if (productos[i] != null) {
				System.out.println(productos[i]);
			}

		}

	}

	/**
	 * 
	 * @param posicion
	 */
	public static void EliminarproductoArray(String nombre, double precio) {
		// TODO Auto-generated method stub

		Producto producto = new Producto(nombre, precio);
		for (int j = 0; j < 9; j++) {
			if (productos[j] != null && (productos[j].equals(producto))) {

				productos[j] = null;

			}
		}

	}

}
