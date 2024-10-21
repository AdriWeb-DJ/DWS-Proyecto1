package servicios;

import java.io.IOException;
import java.sql.Connection;
import java.util.Scanner;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import controlador.Inicio;
import dto.UsuarioDto;
import servicios.MenuImplementacion;

public class UsuarioImplementacion implements UsuarioInterfaz {
	//Creamos las implementaciones
	Inicio main = new Inicio();
	Scanner sc = new Scanner(System.in);
	ConexionBdInterfaz cbd = new ConexionBdImplementacion();
	
	@Override
	public void RegistroUsuario() throws IOException {
		//Realizamos la conexion a la Base de Datos
		Connection conexion = cbd.conectarBd();
		try {
		System.out.println("======REGISTRO DE USUARIO======");
		System.out.println("Nombre: ");
		String nombreUsuario = sc.nextLine();
		System.out.println("Contraseña: ");
		String contUsuario = sc.nextLine();
		System.out.println("Repetir Contraseña: ");
		String contrepUsuario = sc.nextLine();
		System.out.println("===============================");
		
		while (!contUsuario.equals(contrepUsuario)) {
			System.out.println("La contraseñas no coinciden, introduzca de nuevo la contraseña: ");
			
			System.out.println("Contraseña: ");
			contUsuario = sc.nextLine();
			System.out.println("Repetir Contraseña: ");
			contrepUsuario = sc.nextLine(); 
		}
		
			// Generar un ID único
			long idUsuario = utils.Util.GenerarIdUsuario(conexion);
			UsuarioDto udDto = new UsuarioDto();
			udDto.setNombreUsuario(nombreUsuario);
			udDto.setContUsuario(contUsuario);
			udDto.setIdUsuario(0);
			
			String insertQuery = "INSERT INTO \"dlk_usuario\".usuario (id_usuario, nombre_usuario, contrasena) VALUES (?, ?, ?)";
			
			try (PreparedStatement ps = conexion.prepareStatement(insertQuery)){
				ps.setLong(1, idUsuario);
				ps.setString(2, nombreUsuario);
				ps.setString(3, contUsuario);
				
				ps.executeUpdate();
				conexion.close();
				System.out.println("Usuario creado y guardado con éxito en la base de datos.");
			}catch (SQLException e) {
				System.out.println("Error al insertar usuario en la base de datos: " + e.getMessage());
			}
		}catch(Exception e) {
			System.out.println("Ha habido un error en el sistema");
		}
	}
	
	public void IniciarSesion() {
		
		try {
			
			System.out.println("==========INICIAR SESION==========");
			System.out.println("Introduce los campos");
			
			System.out.println("Nombre");
			String nombreUsuario=sc.nextLine();

			System.out.println("Contraseña");
			String contUsuario=sc.nextLine();
			
			//Comprobamos conexion
			ConexionBdInterfaz ci = new ConexionBdImplementacion();
			cbd.conectarBd();
			
			System.out.println("Sesion iniciada.");
			
			MenuUsuario();
			
		} catch (Exception e) {
			// TODO: handle exception
			
		}
		}
	@Override
	public void ModificarUsuario() {
		//
	}
	public void MenuUsuario() {
		System.out.println("==========MENU USUARIO==========");
		System.out.println("0. Cerrar Menu");
		System.out.println("1. ¿Que desea realizar?");
		System.out.println("2. Registrar motos");
		System.out.println("3. Crear evento");
		System.out.println("4. Apuntarse evento");
		System.out.println("5. Ver Club");
		System.out.println("6. Registrarse en Club");
		
		//Obtenemos control
		boolean esCerrado=false;
		do {
			byte control=sc.nextByte();
			
			try {
				switch(control) {
				
					case 0:
						System.out.println("Accediendo a registro de motos ");
						esCerrado = true;
						
						break;
					case 1:
						System.out.println("Accediendo a creacion de eventos ");
						
						break;
					case 2:
						System.out.println("Accediendo a registro en un evento ");
						
						break;
						
					case 3:
						System.out.println("Accediendo al club ");
						
						break;
					case 4:
						System.out.println("Accediendo al registro en un club ");
						
						break;
												
					default:
						
						System.out.println("ERROR: Seleccione una opción valida");
						break;
					}
				
				}catch(Exception e) {
					System.out.println("Ha habido un error en el sistema");	
				}
			}while (!esCerrado);
	}
	@Override
	public byte MenuModificarUsuario() throws IOException {
			 
			System.out.println("==============================");
			System.out.println("¿Que dato quiere modificar?");
			System.out.println("1. Nombre");
			System.out.println("2. Descripcion");
			System.out.println("3. Imagen de Perfil");
			System.out.println("==============================");
			System.out.println("Seleccione una opcion: ");
			System.out.println("==============================");
			
			byte opcion = sc.nextByte();
			return opcion;
		}

	@Override
	public void EliminarUsuario() {
		// TODO Auto-generated method stub
		
	}

	



}
