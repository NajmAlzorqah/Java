package com.najmaldeen;

// Importing specific classes from the java.sql package
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        // JDBC URL for connecting to SQL Server with integrated security
        String jdbcUrl = "jdbc:sqlserver://NAJM:1433;databaseName=Planets;integratedSecurity=true;encrypt=false;trustServerCertificate=true;";

        try {
            // Load the SQL Server JDBC driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // 1- Establish Connection to the database
            Connection connection = DriverManager.getConnection(jdbcUrl);
            System.out.println("Connected to the database!");

            // 2- Create SQL query to select all planets
            String selectPlanetsSQL = "SELECT PlanetID, Name, Mass, Radius, DistanceFromSun, OrbitPeriod, HasRings, DiscoveredYear FROM Planets";
            Statement statement = connection.createStatement();

            // 3- Execute the SQL query
            ResultSet resultSet = statement.executeQuery(selectPlanetsSQL);

            // 4- Manage the ResultSet and print the details of each planet
            System.out.println("Planets in the database:");
            while (resultSet.next()) {
                // Retrieve and print each planet's details
                int planetId = resultSet.getInt("PlanetID"); // Unique identifier for the planet
                String planetName = resultSet.getString("Name"); // Name of the planet
                float planetMass = resultSet.getFloat("Mass"); // Mass of the planet
                float planetRadius = resultSet.getFloat("Radius"); // Radius of the planet
                float distanceFromSun = resultSet.getFloat("DistanceFromSun"); // Distance from the Sun
                float orbitPeriod = resultSet.getFloat("OrbitPeriod"); // Orbit period in Earth years
                boolean hasRings = resultSet.getBoolean("HasRings"); // Indicates if the planet has rings
                int discoveredYear = resultSet.getInt("DiscoveredYear"); // Year of discovery

                // Print the details of each planet
                System.out.printf("PlanetID: %d, Name: %s, Mass: %.2f, Radius: %.2f, DistanceFromSun: %.2f, OrbitPeriod: %.2f, HasRings: %b, DiscoveredYear: %d%n",
                        planetId, planetName, planetMass, planetRadius, distanceFromSun, orbitPeriod, hasRings, discoveredYear);
            }

            // 5- Close the connections and resources
            resultSet.close();          // Close the ResultSet
            statement.close();         // Close the Statement
            connection.close();        // Close the Connection
            System.out.println("Connection closed.");
        } catch (ClassNotFoundException e) {
            // Handle exception for JDBC driver not found
            System.out.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            // Handle SQL exceptions
            System.out.println("SQL Exception: " + e.getMessage());
        }
    }
}
