
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    static final String URL="jdbc:mysql://localhost/sdm";
    static final String USER = "root";
    static final String PASS = "";
    static Connection con;
    
    public static Connection conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, PASS);
            if (con != null) {
                return con;
            } else {
                return con;
            }
        } catch (ClassNotFoundException e) {
            e.getMessage();
            return null;
        } catch (SQLException sql) {
            sql.getMessage();
            return null;
        }
    }
}
