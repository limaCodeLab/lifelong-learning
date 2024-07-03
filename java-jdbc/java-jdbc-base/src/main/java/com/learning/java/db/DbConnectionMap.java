package com.learning.java.db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

// Classe para conexão ou fechamento com o banco de dados
public class DbConnectionMap {

    private static Connection connection = null;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Properties propertiesConnection = loadProperties();
                String url = propertiesConnection.getProperty("dburl"); // Pega a URL do BD
                connection = DriverManager.getConnection(url, propertiesConnection); // Conecta ao BD
            }
            catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
        return connection;
    }

    public  static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            }
            catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }

    private static Properties loadProperties() {

        try (FileInputStream file = new FileInputStream("src/main/resources/db.properties")) {
            Properties properties = new Properties();
            properties.load(file); // Carrega as propriedades do arquivo db.properties
            return properties;
        }
        catch (IOException e) {
            throw new DbException(e.getMessage());
        }
    }

    public static void closeStatement(Statement statement) {
        if (statement != null) {
            try {
                statement.close();
            }
            catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }

    public static void closeResultSet(ResultSet resultSet) {
        if (resultSet != null) {
            try {
                resultSet.close();
            }
            catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }
}