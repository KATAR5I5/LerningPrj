package JDBC;
import java.sql.*;

public class ConnectionDB {
    private static final String URL = "jdbc:postgresql://192.168.1.100:5432/mydb";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "pass";

    private static Connection connection;

    //  Ниже код нужен был до Java 8
//    static {
//        try {
//            Class.forName("org.postgresql.Driver");
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//    }

    public Connection getConnection() {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }


    public static void main(String[] args) {

        try {
        connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
//
            Statement statement = connection.createStatement();
            String querySQL = "SELECT * FROM users";
//    executeQuery - возвращает результат запроса (ResultSet) в виде строк ячеек таблицы
            ResultSet resultSet = statement.executeQuery(querySQL);
//    далее необходимо пройтись по строкам и получить каждую ячейку (как в итераторе)
            while (resultSet.next()){
//     получаем значение по ее названию или по номеру колонки/столбца ячейки (лучше по названию,
//     тк последовательность колонок может поменяться)
                int age = resultSet.getInt("age");
                String name = resultSet.getString("name");
                System.out.println(name + " - " +age);
            }




        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}

