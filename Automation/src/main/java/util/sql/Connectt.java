package util.sql;


import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class Connectt {
    public Connectt() throws SQLException {
        makeConnection();
    }

    private Connection connection;

    public Connection makeConnection() throws SQLException {
        if (connection == null) {

            connection = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/sys", "root", "root");
        }
        return connection;
    }
}
