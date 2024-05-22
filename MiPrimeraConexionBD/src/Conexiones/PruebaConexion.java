package Conexiones;

import java.sql.Connection;

import modelos.claseBarco;

public class PruebaConexion extends AbstractConexiones{
	
	static Connection conn;
	public static void main(String[] args) {
		
		claseBarco barco = new claseBarco();
		barco.mostrarPaises();
	}

}
