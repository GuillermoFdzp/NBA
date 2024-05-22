package modelos;

import java.sql.SQLException;

import Conexiones.AbstractConexiones;
import Conexiones.ConexionMySQL;


public class claseBarco extends AbstractConexiones{
	private String clase, tipo, pais;
	private int numArmas, Desplazamiento;
	private double calibre;
	
	

	public claseBarco() {
		super();
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getNumArmas() {
		return numArmas;
	}

	public void setNumArmas(int numArmas) {
		this.numArmas = numArmas;
	}

	public int getDesplazamiento() {
		return Desplazamiento;
	}

	public void setDesplazamiento(int desplazamiento) {
		Desplazamiento = desplazamiento;
	}

	public double getCalibre() {
		return calibre;
	}

	public void setCalibre(double calibre) {
		this.calibre = calibre;
	}
	
	@Override
	public String toString() {
		return "claseBarco [clase=" + clase + ", tipo=" + tipo + ", pais=" + pais + ", numArmas=" + numArmas
				+ ", Desplazamiento=" + Desplazamiento + ", calibre=" + calibre + "]";
	}
	
	public void mostrarPaises() {
		
		try {
			conn = ConexionMySQL.getConnection();
			st = conn.createStatement();
			query = "SELECT  distinct PAIS FROM clases";
	        rs = st.executeQuery(query);

	        while(rs.next()) {
	            System.out.println(rs.getString(1));
	        }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}
}
