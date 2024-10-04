/**
 * 
 */
package utils;

import controlador.Inicio;
import dto.AlumnoDto;

/**
 * Clases utiles
 * 
 * @author nrojlla 200924
 */
public class Utils {

	/**
	 * Calcula el id de lista alumno
	 * 
	 * @author nrojlla 230924
	 * @return long
	 */
	public static long CalcularId() {
		long idNuevo = 0;
		int tamanioLista = Inicio.listaAlumno.size();

		if (tamanioLista > 0) {
			idNuevo = Inicio.listaAlumno.get(tamanioLista - 1).getIdAlumno() + 1;
		} else {
			idNuevo = 1;
		}

		return idNuevo;
	}

	/**
	 * Muestra la lista de alumnos
	 * 
	 * @author nrojlla 230924
	 */
	public static void MostrarListaAlumnos() {
		if (Inicio.listaAlumno.size() > 0) {

			for (AlumnoDto listAlumno : Inicio.listaAlumno) {
				System.out.println(listAlumno.toString());
			}

		} else {
			System.out.println("No hay nadie todavia.");
		}
	}

}
