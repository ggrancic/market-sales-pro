package model;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private Connection c;
    private static final String URL = "jdbc:mysql://localhost/mercadito";
    private static final String user = "root";
    private static final String password = "9428";
    Connection con = null;

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    public boolean connect() {
        boolean ok = false;
        setCon(null);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = (Connection) DriverManager.getConnection(URL, user, password);
            System.out.println("Exito");
            if(c!=null){
                setCon(c);
                ok = true;
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Fallo");
        } finally {
            return ok;
        }
    }
}
