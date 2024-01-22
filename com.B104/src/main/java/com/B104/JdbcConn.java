package com.B104;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcConn {
    private static final String Url = "jdbc:mysql://localhost:3306/emp_database";
    private static final String username = "root";
    private static final String pass = "root";

    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection(Url, username, pass)) {
            System.out.println("Connection Established Successfully");

            try (Statement statement = con.createStatement()) {
                String query = "CREATE TABLE IF NOT EXISTS emp_details(id INT, name VARCHAR(255), age INT)";
                statement.execute(query);
                System.out.println("Query statement executed");

                String insertDataQuery = "INSERT INTO emp_details (id, name, age) VALUES (1, 'John Doe', 25), (2, 'Jane Smith', 22)";
                int rowsAffected = statement.executeUpdate(insertDataQuery);
                System.out.println(rowsAffected + " row(s) inserted");

                String selectDataQuery = "SELECT * FROM emp_details";
                try (ResultSet resultSet = statement.executeQuery(selectDataQuery)) {
                    while (resultSet.next()) {
                        int id = resultSet.getInt("id");
                        String name = resultSet.getString("name");
                        int age = resultSet.getInt("age");
                        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
                    }
                }

                try (PreparedStatement updateStatement = con.prepareStatement("UPDATE emp_details SET age = ? WHERE name ='Jane Smith'")) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter the age to be modified");
                    int num=sc.nextInt();
                    updateStatement.setInt(1, num);
                    updateStatement.executeUpdate();
                    
                    
                    
                }


                try (ResultSet resultSet = statement.executeQuery(selectDataQuery)) {
                    while (resultSet.next()) {
                        int id = resultSet.getInt("id");
                        String name = resultSet.getString("name");
                        int age = resultSet.getInt("age");
                        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
                    }
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
