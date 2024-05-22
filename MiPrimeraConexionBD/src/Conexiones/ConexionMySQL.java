package Conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySQL {

    private String url, user, pass;
    private static Connection conn = null;

    private ConexionMySQL() {
        
            //Class.forName("com.mysql.cj.jdbc.Driver");
            this.url = "jdbc:mysql://localhost:3306/batallas";
            this.user = "root";
            this.pass= null;
            try {
                conn = DriverManager.getConnection(url, user, pass);
                System.out.println("Conectado correctamente a la base de datos\n");

            } catch (SQLException e) {
                System.out.println("Ha habido algún problema en la conexión");
                e.printStackTrace();
            }
    }


    public static Connection getConnection() {
        if(conn == null) {
            new ConexionMySQL();
        }
        return conn;
    }

}
