/**
 * 
 */
package servicios;

import java.io.IOException;

/**
 * Lista de los metodos de la interfaz
 * 
 * @author nrojlla 200924
 */
public interface MenuInterfaz {
	/**
	 * Vista del menu principal
	 * 
	 * @return byte
	 * @author nrojlla 202924
	 * @throws IOException
	 */
	byte MenuPrincipal() throws IOException;

	/**
	 * Vista menu modificar datos
	 * 
	 * @return byte
	 * @author nrojlla 230924
	 * @throws IOException 
	 */

	byte MenuModificarDatos() throws IOException;

}
