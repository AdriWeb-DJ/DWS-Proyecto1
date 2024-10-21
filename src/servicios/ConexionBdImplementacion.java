package servicios;

import java.sql.*;

/**
 * Implementacion de los metodos de ConexionBdInterfaz
 * 
 * @author aprasto 17/10/2024
 */

public class ConexionBdImplementacion implements ConexionBdInterfaz {
	
    public Connection conectarBd() {

        String url = "jdbc:postgresql://localhost:5432/proyecto_motos";

        String usuario = "postgres";

        String contraseña = "psw-123";

        Connection conex = null;
        
        try {

            // Cargar el controlador de la base de datos (opcional desde JDBC 4.0)

            Class.forName("org.postgresql.Driver");


            // Obtener la conexión usando DriverManager

             conex = DriverManager.getConnection(url, usuario, contraseña);


            if (conex == null) {

                System.out.println("Conexión establecida con éxito.");

                conex.close();

            }

        } catch (SQLException | ClassNotFoundException e) {

            e.printStackTrace();

        }
		return conex;

    }

}