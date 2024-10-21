/**
 * 
 */
package servicios;

import java.io.IOException;
import java.util.Scanner;

/**
 * Implementacion y detalle de los metodos de la lista del menu interfaz
 * 
 * @author aprasto 17/10/2024
 */
public class MenuImplementacion implements MenuInterfaz {

	Scanner sc = new Scanner(System.in);

	public byte MenuPrincipal() throws IOException {

		System.out.println("============MENU============");
		System.out.println("0. Cerrar menu");
		System.out.println("1. Alta Usuario");
		System.out.println("2. Baja Usuario");
		System.out.println("3. Modificar datos Usuario");
		System.out.println("4. Alta Club");
		System.out.println("5. Baja Club");
		System.out.println("6. Modificar datos Club");
		System.out.println("============================");
		System.out.println("Seleccione una opcion: ");
		System.out.println("============================");
		
		byte opcion = sc.nextByte();
		return opcion;
	}
}
