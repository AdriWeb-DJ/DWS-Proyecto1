package servicios;

import java.io.IOException;

/**
 * Lista de los metodos de la operativa
 * @author nrojlla 200924
 */
public interface OperativaInterfaz {

	/**
	 * Registro de un nuevo alumno
	 * @author nrojlla 200924
	 * @throws IOException 
	 */
	void RegistroAlumno() throws IOException;
	
	/**
	 * Modificar dato del alumno
	 * @author nrojlla 230924
	 * @throws IOException
	 */

	void ModificarAlumno() throws IOException;

	/**
	 * Elimina de la lista una alumno
	 * @author nrojlla 23092024
	 * @throws IOException 
	 */
	void EliminarAlumno() throws IOException;

}
