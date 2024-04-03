/**
 * 
 */
package actividad3;



/**
 * 
 */
public class ArrayProductos {
	static Productos[] array = new Productos[10];

	/**
	 * 
	 */
	public static void nuevoProductoArrayProductose(Productos nombre) {
		boolean verificacion = false;
		int contador = 0;
		while (contador < array.length &&  verificacion==false) {
			if (array[contador] == null) {
				array[contador] = nombre;
				verificacion = true;
			}
			
			contador++;
		}
	}

	public static void ListarroductosArray() {
		for (int i = 0; i < array.length; i++) {
			if (array[i] != null) {
				System.out.println(array[i]);
			}

		}

	}

	public static void EliminarproductoArray(int posicion) {
		// TODO Auto-generated method stub
		array[posicion] = null;
	}

}
