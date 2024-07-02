package com.learning.java.applications;

import com.learning.java.db.DbConnectionMap;
import com.learning.java.db.DbIntegrityException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Locale;

public class DeleteDataApplication {

    static Connection connection;
    static PreparedStatement statement;


    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        try {
            connection = DbConnectionMap.getConnection();
            statement = connection.prepareStatement("DELETE FROM seller " +
                    "WHERE Id = ?"); // Sempre colocar WHERE na hora de apagar

            statement.setInt(1, 8);

            System.out.println("Done! Rows affected: " + statement.executeUpdate());

        }
        catch (SQLException e) {
            throw new DbIntegrityException(e.getMessage());
        } finally {
            DbConnectionMap.closeStatement(statement);
            DbConnectionMap.closeConnection();
        }

    }
}