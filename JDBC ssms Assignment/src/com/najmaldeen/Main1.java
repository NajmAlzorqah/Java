package com.najmaldeen;

import java.sql.*;

public class Main1 {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:sqlserver://NAJM:1433;databaseName=Hamod;integratedSecurity=true;encrypt=false;trustServerCertificate=true;";

        try {
            // Load the SQL Server JDBC driver (optional in modern versions of JDBC)
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // 1- Establish Connection using try-with-resources
            try (Connection connection = DriverManager.getConnection(jdbcUrl);
                 // 2- Create Statement object using try-with-resources
                 Statement statement = connection.createStatement();
                 // 3- Execute query and manage ResultSet using try-with-resources
                 ResultSet resultSet = statement.executeQuery("SELECT PlanetID, Name, Mass, Radius, DistanceFromSun, OrbitPeriod, HasRings, DiscoveredYear FROM Planets")) {

                System.out.println("Connected to the database!");

                // 4- Process the ResultSet
                while (resultSet.next()) {
                    int planetId = resultSet.getInt("PlanetID");
                    String planetName = resultSet.getString("Name");
                    float planetMass = resultSet.getFloat("Mass");
                    float planetRadius = resultSet.getFloat("Radius");
                    float distanceFromSun = resultSet.getFloat("DistanceFromSun");
                    float orbitPeriod = resultSet.getFloat("OrbitPeriod");
                    boolean hasRings = resultSet.getBoolean("HasRings");
                    int discoveredYear = resultSet.getInt("DiscoveredYear");
                    System.out.printf("PlanetID: %d, Name: %s, Mass: %.2f, Radius: %.2f, DistanceFromSun: %.2f, OrbitPeriod: %.2f, HasRings: %b, DiscoveredYear: %d%n",
                            planetId, planetName, planetMass, planetRadius, distanceFromSun, orbitPeriod, hasRings, discoveredYear);
                }

                System.out.println("Connection has been closed automatically after use.");

            } catch (SQLException e) {
                System.out.println("Database error: " + e.getMessage());
            }

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: " + e.getMessage());
        }
    }
}
