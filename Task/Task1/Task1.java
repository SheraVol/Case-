package org.example;
import java.sql.*;
public class Task1 {
    public static void main(String[] args) {

        try {

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ra", "root", "OkaRuto24!");


            Statement stmt = conn.createStatement();

            //SQL-запрос
            String sqlQuery = "SELECT surname FROM task "
                    + "WHERE experience = "
                    + "(SELECT MAX(experience) "
                    + "FROM task "
                    + "WHERE experience < (SELECT MAX(experience) FROM task))";
            ResultSet rs = stmt.executeQuery(sqlQuery);

            //вывод данных
            if (rs.next()) {
                String surname = rs.getString("surname");
                System.out.println("Фамилия сотрудника со вторым максимальным опытом работы: " + surname);
            } else {
                System.out.println("В базе данных нет сотрудников");
            }

            //прекращение работы с бд
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}