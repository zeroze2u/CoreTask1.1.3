package jm.task.core.jdbc.util;
import java.sql.*;
import java.sql.DriverManager;
public class Util {
    // реализуйте настройку соеденения с БД
    private static final String rootName = "root";
    private static final String password = "1234";
    private static final String connectionURL = "jdbc:mysql://localhost:3306/users";

    public static Connection GetConnection(){
        Connection connection = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(connectionURL, rootName, password);
        } catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return connection;
    }
}
