package com.shreya.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class App {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "root";

        try {
            // 1. Load MySQL Driver (optional for newer JDBC)
            //Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Establish connection
            Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("✅ Connected to MySQL DB!");

            // 3. Create statement
            String sql = "SELECT * FROM students";
            Statement stmt = conn.createStatement();

            // 4. Execute query
            ResultSet rs = stmt.executeQuery(sql);

            // 5. Process result
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        ", Name: " + rs.getString("name") +
                        ", Age: " + rs.getInt("age"));
            }

            // 6. Close everything
            rs.close();
            stmt.close();
            conn.close();
            System.out.println("✅ Connection closed.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
