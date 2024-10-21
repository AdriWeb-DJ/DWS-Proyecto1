package servicios;

/**
 * Lista de los metodos de Fichero
 * 
 * @author aprasto 17/10/2024
 */

public interface FicheroInterfaz {
	
	/**
	 * Abrir, escribir y cerrar fichero log
	 * 
	 * @param mensaje
	 * @param fichero
	 */
	
	void EscribirFichero(String mensaje, String fichero);
}
