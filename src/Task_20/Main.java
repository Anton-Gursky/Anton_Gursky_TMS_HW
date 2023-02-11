package Task_20;

import java.sql.*;

public class Main {

    public static final String USER_NAME = "User";
    public static final String PASSWORD = "root";
    public static final String CONNECTION_URL = "jdbc:mysql://localhost:3306/dbtest";
    public static Connection connection;
    public static Statement statement;

    static {
        try {
            connection = DriverManager.getConnection(CONNECTION_URL, USER_NAME, PASSWORD);
            statement = connection.createStatement();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws ClassNotFoundException, SQLException {

            Class.forName("com.mysql.cj.jdbc.Driver");

            //executeUpdater - используется для добавления или обновления данных в таблице
            statement.executeUpdate("drop table users");

            statement.executeUpdate("create table users (" +
                    "id int not null auto_increment," +
                    "name varchar(45) not null," +
                    "age int(3)," +
                    "email varchar(64) not null," +
                    "primary key (id))"
            );

            //Добавление данных в таблицу
            statement.executeUpdate("insert into dbtest.users(id, name, age, email) " +
                    "value (1, 'Steve', 22, 'steve@mail.ru')"
            );
            statement.executeUpdate("insert into dbtest.users(id, name, age, email) " +
                    "value (2, 'Liz', 20,'liz@gmail.com')"
            );
            statement.executeUpdate("insert into dbtest.users(id, name, age, email) " +
                    "value (3, 'Ann', 23,'ann@tut.by')"
            );

            //Получение данных из таблицы
        ResultSet resultSet = statement.executeQuery("SELECT * From users");

        //Выведение полученных данных на консоль
        while (resultSet.next()){
            System.out.println(resultSet.getString(2) + " " + resultSet.getString(3) + " " +
                    resultSet.getString(4));
        }
    }
}