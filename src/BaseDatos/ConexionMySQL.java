/*
 * Clase para conectar una base de datos con la aplicación
 */
package BaseDatos;

import java.sql.*;

/**
 *
 * @author alejandrarodriguez
 */
public class ConexionMySQL {
    public String db_name = "empleado";
    public String db_url = "jdbc:mysql://localhost/"+db_name;
    public String user = "root";
    public String pass = "escob4r";
    
    public Connection conectar(){
        Connection link = null;
        try{
            Class.forName("com.mysql.jdbc.Driver"); //Cargando driver de mysql
            link = DriverManager.getConnection(db_url, user, pass);
        } catch(Exception e){
            System.out.println(e.toString());
        }
        return link;
    }
}
