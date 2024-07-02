package com.learning.java.application;

import com.learning.java.db.DbConnectionMap;
import com.learning.java.db.DbException;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RecoverDataApplication {

    static Connection connection;
    static Statement statement;
    static ResultSet resultSet;

    public static void main(String[] args) {

        try {
            connection = DbConnectionMap.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM DEPARTMENT");

            while (resultSet.next()){
                System.out.println(resultSet.getInt("ID") + " " + resultSet.getString("NAME"));
            }
        }
        catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DbConnectionMap.closeStatement(statement);
            DbConnectionMap.closeResultSet(resultSet);
            DbConnectionMap.closeConnection();
        }

    }
}