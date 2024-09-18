package com.najmaldeen;

import java.sql.*;
import java.util.Scanner;

public class main {


    public static void main(String[] args) {
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            // 1- Connection
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Alzorqah");

            // 2- Query
            Scanner scanner = new Scanner(System.in);
            int id;
            String name ;
            String address;

            System.out.println("Enter Employees id:");
            id = scanner.nextInt();
            System.out.println("Enter Employees name:");
            name = scanner.next();
            System.out.println("Enter Employees address:");
            address = scanner.next();


            PreparedStatement ps = con.prepareStatement("insert into Employees values(?,?,?)");
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, address);

            int affectedRows = ps.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Inserted Succsfuly");
            }
            else{
                System.out.println("Faild!");
            }

            Statement stmt = con.createStatement();
            // 3- Execute Query
            ResultSet  rs = stmt.executeQuery("SELECT * FROM APP.EMPLOYEES");
            // 4- Resultset Mgmt
            while(rs.next()){
                System.out.print(rs.getString("name"));
                System.out.print(" => ");
                System.out.print(rs.getInt("id"));
                System.out.print(" => ");
                System.out.println(rs.getString("address"));
            }
            // 5- Close Connection
            con.close();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }

}
