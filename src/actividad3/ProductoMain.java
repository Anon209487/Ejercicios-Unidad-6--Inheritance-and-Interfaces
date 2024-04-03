/**
 * 
 */
package actividad3;

import java.util.Scanner;

/**
 * 
 */
public class ProductoMain {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		int posicion = 0;
		double precio = 0;
		String nombre = "";
		// TODO Auto-generated method stub
		int seleccion = 0;
		while (seleccion != 4) {
			System.out.println("-------------------------");
			System.out.println("1:Añadir producto.");
			System.out.println("2:Listar productos.");
			System.out.println("3:Eliminar producto.");
			System.out.println("4:Salir.");
			System.out.println("-------------------------");
			seleccion = new Scanner(System.in).nextInt();
			switch (seleccion) {
			case 1:
				System.out.println("selecciona nombre y precio");
				nombre = new Scanner(System.in).nextLine();
				precio = new Scanner(System.in).nextDouble();
				ProductoMain.anyadirProducto(precio, nombre);
				break;
			case 2:
				ArrayProductos.ListarroductosArray();
				break;

			case 3:
				posicion = new Scanner(System.in).nextInt();
				ProductoMain.Eliminarproducto(posicion);
				break;
			}
		}
	}

	public static void Eliminarproducto(int posicion) {

		if (posicion < 9 && posicion > 0) {
			ArrayProductos.EliminarproductoArray(posicion);
		}

	}

	public static void anyadirProducto(double precio, String nombre) {

		Productos producto = new Productos(nombre, precio);
		ArrayProductos.nuevoProductoArrayProductose(producto);

	}
}
