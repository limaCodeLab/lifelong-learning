package com.learning.java.applications;

import com.learning.java.db.DbConnectionMap;
import com.learning.java.db.DbException;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class InsertDataApplication {

    static Connection connection;
    static PreparedStatement statement;


    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try {
            connection = DbConnectionMap.getConnection();
            statement = connection.prepareStatement("INSERT INTO seller " +
                    "(Name, Email, BirthDate, BaseSalary, DepartmentId) " +
                    "VALUES (?, ?, ?, ?, ?)", // ? = placeholders para a inserção de dados
                    Statement.RETURN_GENERATED_KEYS);

            statement.setString(1, "Carl Purple");
            statement.setString(2, "HrjJn@example.com");
            statement.setDate(3, new java.sql.Date(dateFormat.parse("28/03/1995").getTime()));
            statement.setDouble(4, 3000.0);
            statement.setInt(5, 4);

            int rowsAffected = statement.executeUpdate(); // Executa a inserção

            if (rowsAffected > 0) {
                ResultSet resultSet = statement.getGeneratedKeys();
                while (resultSet.next()) {
                    int id = resultSet.getInt(1); // 1 indica o valor da primeira coluna
                    System.out.println("Done! ID: " + id);
                }
            } else {
                System.out.println("No rows affected!");
            }

            System.out.println("Done! Rows affected: " + rowsAffected);
        }
        catch (SQLException | ParseException e) {
            throw new DbException(e.getMessage());
        } finally {
            DbConnectionMap.closeStatement(statement);
            DbConnectionMap.closeConnection();
        }

    }
}