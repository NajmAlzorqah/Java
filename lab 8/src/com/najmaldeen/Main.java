package com.najmaldeen;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("org.sqlite.JDBC");
            // 1- Connection
            Connection con = DriverManager.getConnection("jdbc:sqlite:D:/db/test.db");
            // 2- Query
            Statement stmt = con.createStatement();
            // 3- Execute Query
            ResultSet  rs = stmt.executeQuery("SELECT id, name, address FROM Emoloyess");
            // 4- Resultset Mgmt
            while(rs.next()){
                System.out.printf(rs.getString("name"));
                System.out.printf(" => ");
                System.out.println(rs.getInt("id"));
            }
            // 5- Close Connection
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }

    }
}
