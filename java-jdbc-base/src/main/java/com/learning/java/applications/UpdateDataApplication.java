package com.learning.java.applications;

import com.learning.java.db.DbConnectionMap;
import com.learning.java.db.DbException;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class UpdateDataApplication {

    static Connection connection;
    static PreparedStatement statement;


    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        try {
            connection = DbConnectionMap.getConnection();
            statement = connection.prepareStatement("UPDATE seller " +
                    "SET BaseSalary = ?, Name = ?" +
                    "WHERE Id = ?"); // Sempre colocar WHERE para qualquer atualizacao no BD

            statement.setDouble(1, 4500.00);
            statement.setString(2, "Alan Lima");
            statement.setInt(3, 6);

            int rowsAffected = statement.executeUpdate(); // Executa a inserção
            System.out.println("Done! Rows affected: " + rowsAffected);
        }
        catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DbConnectionMap.closeStatement(statement);
            DbConnectionMap.closeConnection();
        }

    }
}