package servicios;

import java.sql.Connection;

/**
 * Lista de los metodos de ConexionBd
 * 
 * @author aprasto 17/10/2024
 */

public interface ConexionBdInterfaz {
	
	/**
	 * Metodos para conectar con la base de datos
	 * 
	 * @author aprasto 17/10/2024
	 * @return 
	 */
	
	Connection conectarBd ();
}
