package com.learning.java.applications;

import com.learning.java.db.DbConnectionMap;
import com.learning.java.db.DbException;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Locale;

public class TransactionDataApplication {

    static Connection connection;
    static Statement statement;


    public static void main(String[] args) {

        Locale.setDefault(Locale.US);


        try {
            connection = DbConnectionMap.getConnection();
            connection.setAutoCommit(false);// Desabilita o autocommit, forcando o dev sempre expressar o commit no final da trasnsação

            statement = connection.createStatement();

            int rows1 = statement.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");

//            int x = 1;
//            if (x < 2) {
//                throw new SQLException("Fake error");
//            }

            int rows2 = statement.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");

            connection.commit(); // Executa o commit da transação acima

            System.out.println("rows1 = " + rows1);
            System.out.println("rows2 = " + rows2);

        }
        catch (SQLException e) { // tratativa de erro caso ocorra algum erro no meio da transação
            try {
                connection.rollback();
                throw new DbException("Transaction rolled back! Caused by: " + e.getMessage());
            } catch (SQLException ex) {
                throw new DbException("Error trying to rollback! Caused by: " + ex.getMessage());
            }

        } finally {
            DbConnectionMap.closeStatement(statement);
            DbConnectionMap.closeConnection();
        }

    }
}