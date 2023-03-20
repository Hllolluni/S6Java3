package com.eutraining.llolluni.s6java3.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBDemo {
    public static void main(String[] args) {
        createTableAndData();
    }

    static void createTableAndData() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:./demo1.db");
            Statement statement = connection.createStatement();
            String createSQL = "Create table if not exists Student" +
                    "(Id Integer," +
                    "Name Text," +
                    "Email Text," +
                    "Primary Key (Id));";
            statement.executeUpdate(createSQL);

            String insertStudent = "Insert into Student Values(1, 'Haxhi', 'llolluni.haxhi@gmail.com');";
            statement.executeUpdate(insertStudent);

            statement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
