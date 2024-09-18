package com.najmaldeen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    // JDBC connection details
    private static final String CONNECTION_URL = "jdbc:sqlserver://NAJM:1433;databaseName=NajmAldeen_Alzorqah;integratedSecurity=true;encrypt=false;trustServerCertificate=true;";

    public static void main(String[] args) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");


            try (Connection connection = DriverManager.getConnection(CONNECTION_URL)) {
                System.out.println("Connected to the database.");

                Scanner scanner = new Scanner(System.in);
                boolean exit = false;

                while (!exit) {
                    System.out.println("\nChoose an option:");
                    System.out.println("1. Insert new pilot");
                    System.out.println("2. Update pilot");
                    System.out.println("3. Delete pilot");
                    System.out.println("4. View all pilots");
                    System.out.println("5. Exit");
                    int choice = scanner.nextInt();
                    scanner.nextLine();  // consume newline

                    switch (choice) {
                        case 1:
                            insertPilot(connection, scanner);
                            break;
                        case 2:
                            updatePilot(connection, scanner);
                            break;
                        case 3:
                            deletePilot(connection, scanner);
                            break;
                        case 4:
                            viewAllPilots(connection);
                            break;
                        case 5:
                            exit = true;
                            break;
                        default:
                            System.out.println("Invalid choice, please try again.");
                    }
                }
            }
        }
        catch (ClassNotFoundException e) {
            System.out.println("The class is Not found" + e.getMessage());

        }
        catch (InputMismatchException e){
            System.out.println("Enter a valid number and do not enter characters.");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    // Insert a new pilot
    private static void insertPilot(Connection connection, Scanner scanner) throws SQLException {
        System.out.println("Enter first name:");
        String firstName = scanner.nextLine();

        System.out.println("Enter last name:");
        String lastName = scanner.nextLine();

        System.out.println("Enter license number:");
        String licenseNumber = scanner.nextLine();

        System.out.println("Enter experience years:");
        int experienceYears = scanner.nextInt();


        String insertQuery = "INSERT INTO Pilots (FirstName, LastName, LicenseNumber, ExperienceYears) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(insertQuery)) {
            stmt.setString(1, firstName);
            stmt.setString(2, lastName);
            stmt.setString(3, licenseNumber);
            stmt.setInt(4, experienceYears);
            stmt.executeUpdate();
//            stmt.executeQuery();
            System.out.println("Pi1lot inserted successfully.");
        }
    }

    // Update an existing pilot
    private static void updatePilot(Connection connection, Scanner scanner) throws SQLException {
        System.out.println("Enter PilotID of the pilot to update:");
        int pilotID = scanner.nextInt();
        scanner.nextLine();  // consume newline

        System.out.println("Enter new first name:");
        String firstName = scanner.nextLine();

        System.out.println("Enter new last name:");
        String lastName = scanner.nextLine();

        System.out.println("Enter new license number:");
        String licenseNumber = scanner.nextLine();

        System.out.println("Enter new experience years:");
        int experienceYears = scanner.nextInt();

        String updateQuery = "UPDATE Pilots SET FirstName = ?, LastName = ?, LicenseNumber = ?, ExperienceYears = ? WHERE PilotID = ?";
        try (PreparedStatement stmt = connection.prepareStatement(updateQuery)) {
            stmt.setString(1, firstName);
            stmt.setString(2, lastName);
            stmt.setString(3, licenseNumber);
            stmt.setInt(4, experienceYears);
            stmt.setInt(5, pilotID);
            stmt.executeUpdate();
            System.out.println("Pilot updated successfully.");
        }
    }

    // Delete a pilot
    private static void deletePilot(Connection connection, Scanner scanner) throws SQLException {
        System.out.println("Enter PilotID of the pilot to delete:");
        int pilotID = scanner.nextInt();

        String deleteQuery = "DELETE FROM Pilots WHERE PilotID = ?";
        try (PreparedStatement stmt = connection.prepareStatement(deleteQuery)) {
            stmt.setInt(1, pilotID);
            stmt.executeUpdate();
            System.out.println("Pilot deleted successfully.");
        }
    }

    // View all pilots
    private static void viewAllPilots(Connection connection) throws SQLException {
        String selectQuery = "SELECT * FROM Pilots";
        try (Statement stmt = connection.createStatement()) {
            ResultSet rs = stmt.executeQuery(selectQuery);

            System.out.println("PilotID | FirstName | LastName | LicenseNumber | ExperienceYears");
            System.out.println("--------------------------------------------------------------");

            while (rs.next()) {
                int pilotID = rs.getInt("PilotID");
                String firstName = rs.getString("FirstName");
                String lastName = rs.getString("LastName");
                String licenseNumber = rs.getString("LicenseNumber");
                int experienceYears = rs.getInt("ExperienceYears");

                System.out.printf("%d\t | %s\t | %s\t | %s\t | %d\n", pilotID, firstName, lastName, licenseNumber, experienceYears);
            }
        }
    }
}
