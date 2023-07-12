package Helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnection {
    private static final String dbURL="jdbc:sqlserver://localhost;databaseName=ChatTCPSocket;user=sa;password=12341234;encrypt=false";
    public static Connection getconection() throws SQLException {
        return  DriverManager.getConnection(dbURL);
    }

}
