package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/admin?useSSL=false&serverTimezone=UTC";
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "admin";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Соединение с базой данных успешно установлено!");
        } catch (SQLException e) {
            System.err.println("Не удалось установить соединение с базой данных");
            e.printStackTrace();
        }
        return connection;
    }
}
