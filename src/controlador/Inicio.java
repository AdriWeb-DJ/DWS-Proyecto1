package controlador;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import dto.UsuarioDto;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;
import servicios.UsuarioImplementacion;
import servicios.UsuarioInterfaz;
import servicios.FicheroInterfaz;
import servicios.FicheroImplementacion;

/**
 * Aplicacion de Usuarios
 * 
 * @author aprasto 17/10/2024
 */

public class Inicio {

	public static List<UsuarioDto> listaUsuario = new ArrayList<UsuarioDto>();
	
	
	
	public static void main(String[] args) {

		LocalDate fecha = LocalDate.now();
		String directorioFichero = "ficheros";
		String fichero = directorioFichero + File.separator + fecha + " FicheroLog.txt";
		
		MenuInterfaz mi = new MenuImplementacion();
		FicheroInterfaz fi = new FicheroImplementacion();
		
		byte opcionSeleccionar = 0;
		boolean esCerrado = false;
		String mensaje = "";

		UsuarioInterfaz ui = new UsuarioImplementacion();
		do {
			
			mensaje = "El menu ha sido iniciado";
			
			try {
				opcionSeleccionar = mi.MenuPrincipal();

				switch (opcionSeleccionar) {
				case 0:
					mensaje = "El menu ha sido cerrado";
					fi.EscribirFichero(mensaje, fichero);
					System.out.println(mensaje);
					esCerrado = true;
					break;
				case 1:
					mensaje = "Dar Alta Usuario";
					fi.EscribirFichero(mensaje, fichero);
					System.out.println(mensaje);
					ui.RegistroUsuario();
					break;
				case 2:
					mensaje = "Dar Baja Usuario";
					fi.EscribirFichero(mensaje, fichero);
					System.out.println(mensaje);
					ui.EliminarUsuario();
					break;
				case 3:
					mensaje = "Modificar Usuario";
					fi.EscribirFichero(mensaje, fichero);
					System.out.println(mensaje);
					ui.MenuModificarUsuario();
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;

				default:
					System.out.println("Opcion no disponible");
					break;
				}

			} catch (Exception e) {

				System.out.println("Opcion no disponible" + e.getMessage());
			}

		} while (!esCerrado);

	}

}
