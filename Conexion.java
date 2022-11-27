package Ejercicio_ultima_entrega;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection con;
    
    public Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registro_usuarios","root","");           
        } catch (Exception e) {
            System.err.println("No se pudo establecer la conexión con la base de datos.\nError"+e);
        }
    }
    public Connection getConnection(){
        return con;
    }
}
