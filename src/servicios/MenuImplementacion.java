/**
 * 
 */
package servicios;

import java.io.IOException;
import java.util.Scanner;

/**
 * Implementacion y detalle de los metodos de la lista menu interfaz
 * 
 * @author nrojlla 200924
 */
public class MenuImplementacion implements MenuInterfaz {

	Scanner sc = new Scanner(System.in);

	@Override
	public byte MenuPrincipal() throws IOException {

		System.out.println("=========MENU=========");
		System.out.println("0. Cerrar menu");
		System.out.println("1. Registrar alumno");
		System.out.println("2. Modificar datos");
		System.out.println("3. Eliminar alumno");
		System.out.println("Seleccione una opcion");
		System.out.println("======================");
		byte opcion = sc.nextByte();
		return opcion;
	}

	@Override
	public byte MenuModificarDatos() throws IOException {
		
		System.out.println("==============================");
		System.out.println("¿Que dato quiere modificar?");
		System.out.println("1. Nombre");
		System.out.println("2. Apellidos");
		System.out.println("3. Dni");
		System.out.println("4. Correo");
		System.out.println("5. Telefono");
		System.out.println("6. Fecha de nacimiento");
		System.out.println("==============================");
		System.out.println("Seleccione una opcion");
		System.out.println("==============================");
		byte opcion = sc.nextByte();
		return opcion;
	}

}
