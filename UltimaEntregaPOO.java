package ultimaentregapoo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
import java.sql.ResultSet;

public class UltimaEntregaPOO {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/registro_usuarios";
        String user = "root";
        String password = "";
        
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Show databases");
            System.out.println(rs.next());
            System.out.println("Conectado");
            
        } catch (SQLException ex) {
            Logger.getLogger(UltimaEntregaPOO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
