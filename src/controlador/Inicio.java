package controlador;

import java.util.ArrayList;
import java.util.List;

import dto.AlumnoDto;
import servicios.FicheroInterfaz;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;
import servicios.OperativaImplementacion;
import servicios.OperativaInterfaz;

/**
 * Aplicacion de alumnos
 * 
 * @author nrojlla 200924
 */
public class Inicio {

	public static List<AlumnoDto> listaAlumno = new ArrayList<AlumnoDto>();
	public static MenuInterfaz mi = new MenuImplementacion();

	public static void main(String[] args) {

		byte opcionSeleccionar = 0;
		boolean esCerrado = false;

		OperativaInterfaz oi = new OperativaImplementacion();
		FicheroInterfaz fi = new FicheroImplementacion();
		do {
			
			fi.CargarFicheros();

			try {
				opcionSeleccionar = mi.MenuPrincipal();

				switch (opcionSeleccionar) {
				case 0:
					System.out.println("Has cerrado la aplicacion");
					esCerrado = true;
					break;
				case 1:
					System.out.println("Has seleccionado registrar a un alumno");
					oi.RegistroAlumno();
					break;
				case 2:
					System.out.println("Has seleccionado modificar");
					oi.ModificarAlumno();
					break;
				case 3:
					System.out.println("Has seleccionado dar baja");
					oi.EliminarAlumno();
					break;
				// case 4:
				// Utils.MostrarListaAlumnos();
				// break;

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
