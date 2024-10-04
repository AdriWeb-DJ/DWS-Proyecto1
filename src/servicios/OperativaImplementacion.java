/**
 * 
 */
package servicios;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import controlador.Inicio;
import dto.AlumnoDto;

/**
 * Implementacion y detalle de los metodos de la operativa
 * 
 * @author nrojlla
 */
public class OperativaImplementacion implements OperativaInterfaz {

	Scanner sc = new Scanner(System.in);

	public void RegistroAlumno() throws IOException {

		long id = utils.Utils.CalcularId();
		System.out.println("Ingrese nombre");
		String nombre = sc.nextLine().trim();
		System.out.println("Ingrese apellidos");
		String apellidos = sc.nextLine().trim();
		System.out.println("Ingrese DNI");
		String dni = sc.nextLine().trim();
		System.out.println("Ingrese telefono");
		int telefono = sc.nextInt();
		sc.nextLine();
		LocalDate fchNacimiento = SolicitarFch();

		AlumnoDto nuevoAlumno = new AlumnoDto();

		nuevoAlumno.setIdAlumno(id);
		nuevoAlumno.setNombreAlumno(nombre);
		nuevoAlumno.setApellidosAlumno(apellidos);
		nuevoAlumno.setDniAlumno(dni);
		nuevoAlumno.setTelAlumno(telefono);
		nuevoAlumno.setFchaNacimientoAlumno(fchNacimiento);

		Inicio.listaAlumno.add(nuevoAlumno);

		System.out.println("Alumno registrado exitosamente.");

		utils.Utils.MostrarListaAlumnos();
	}

	private LocalDate SolicitarFch() throws IOException {
		LocalDate fechDate = LocalDate.of(9999, 12, 31);
		boolean esValido = false;

		do {
			try {
				System.out.println("Ingrese fecha de nacimiento (DD-MM-AAAA)");
				String fechaNaciCliente = sc.nextLine();

				DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
				fechDate = LocalDate.parse(fechaNaciCliente, formato);
				esValido = true;

			} catch (DateTimeParseException e) {
				System.out.println("Formato de fecha inválido. Intente de nuevo.");
			}

		} while (!esValido);

		return fechDate;
	}

	@Override
	public void ModificarAlumno() throws IOException {

		System.out.println("Ingrese su dni");
		String dni = sc.nextLine();

		for (AlumnoDto var : Inicio.listaAlumno) {

			if (var.getDniAlumno().equals(dni)) {

				byte opcionSeleccionada = 0;

				opcionSeleccionada = Inicio.mi.MenuModificarDatos();

				switch (opcionSeleccionada) {
				case 1:

					System.out.println("Has seleccionado cambiar nombre.");
					System.out.println("Ingrese su nuevo nombre.");
					String nombre = sc.nextLine();
					var.setNombreAlumno(nombre);
					System.out.println("Cambiado con exito.");
				case 2:

					System.out.println("Has seleccionado cambiar nombre.");
					System.out.println("Ingrese su nuevo apellido nombre.");
					String apellidos = sc.nextLine();
					var.setApellidosAlumno(apellidos);
					System.out.println("Cambiado con exito.");
					break;
				case 3:

					System.out.println("Has seleccionado cambiar nombre.");
					System.out.println("Ingrese su nuevo dni.");
					String dniNuevo = sc.nextLine();
					var.setDniAlumno(dniNuevo);
					System.out.println("Cambiado con exito.");
					break;

				case 4:

					System.out.println("Has seleccionado cambiar correo.");
					System.out.println("Ingrese su nuevo correo.");
					String correo = sc.nextLine();
					var.setDniAlumno(correo);
					System.out.println("Cambiado con exito.");
					break;

				case 5:

					System.out.println("Has seleccionado cambiar telefono.");
					System.out.println("Ingrese su nuevo telefono.");
					int telNuevo = sc.nextInt();
					sc.next();
					var.setTelAlumno(telNuevo);
					System.out.println("Cambiado con exito.");
					break;

				case 6:

					LocalDate fchaFormateada;

					System.out.println("Has seleccionado cambiar fecha de nacimiento.");
					System.out.println("Ingrese su nueva fecha de nacimiento (DD-MM-AAAA).");
					String fchNueva = sc.nextLine();
					DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
					fchaFormateada = LocalDate.parse(fchNueva, formato);
					var.setFchaNacimientoAlumno(fchaFormateada);

					System.out.println("Cambiado con exito.");
					break;

				default:
					System.out.println("Opcion no disponible" + opcionSeleccionada);
				}

			} else {

				System.out.println("No existe en la base de datos");
			}
		}

	}

	@Override
	public void EliminarAlumno() throws IOException {

		System.out.println("Ingrese su dni");
		String dni = sc.nextLine();

		boolean encontrado = false;
		for (AlumnoDto var : Inicio.listaAlumno) {
			if (var.getDniAlumno().equals(dni)) {
				Inicio.listaAlumno.remove(var);
				System.out.println("Alumno eliminado con éxito.");
				encontrado = true;
				break;
			}
		}

		if (!encontrado) {
			System.out.println("Ha habido un error, intentelo otra vez.");
		}

	}

}
