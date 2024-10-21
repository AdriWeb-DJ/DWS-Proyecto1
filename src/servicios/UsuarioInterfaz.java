package servicios;

import java.io.IOException;

public interface UsuarioInterfaz {

	public void RegistroUsuario() throws IOException;
	public void ModificarUsuario();
	public byte MenuModificarUsuario() throws IOException;
	public void EliminarUsuario();
}
