package Conexiones;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public abstract class AbstractConexiones {
	protected  Connection conn;
	protected  Statement st;
	protected  ResultSet rs;
	protected  String query;
	
	protected AbstractConexiones() {
		conn = ConexionMySQL.getConnection();
	}

}
