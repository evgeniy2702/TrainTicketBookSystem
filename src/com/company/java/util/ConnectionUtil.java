package util;

import java.sql.*;

public class ConnectionUtil {

    public static final String URL = "jdbc:mysql://localhost:3306/train?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    public static  Connection connection = null;
    public static PreparedStatement preparedStatement = null;

    public static final void getConnection() throws ClassNotFoundException, SQLException {
        //Получаем доступ к драйверу
        Class.forName("com.mysql.jdbc.Driver");
        //Создаем соединение
        connection = DriverManager.getConnection(URL, "root", "root");
    }

    public static  void closePreparedStatement()  {
        if(preparedStatement!=null){
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
