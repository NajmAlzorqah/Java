package com.najmaldeen;

// Importing specific classes from the java.sql package
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUD {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:sqlserver://NAJM:1433;databaseName=Planets;integratedSecurity=true;encrypt=false;trustServerCertificate=true;";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(jdbcUrl);
            System.out.println("Connected to the database!");

            // Read planets
            readPlanets(connection);

            // Insert a new planet
            insertPlanet(connection, "NewPlanet", 5.97f, 6371.0f, 149.6f, 1.0f, false, 2024);

            // Update an existing planet
            updatePlanet(connection, 1, 6.0f); // Update planet with ID 1

            // Delete a planet
            deletePlanet(connection, 1); // Delete planet with ID 1

            connection.close();
            System.out.println("Connection closed.");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        }
    }

    private static void readPlanets(Connection connection) throws SQLException {
        String selectPlanetsSQL = "SELECT PlanetID, Name, Mass, Radius, DistanceFromSun, OrbitPeriod, HasRings, DiscoveredYear FROM Planets";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(selectPlanetsSQL);
        System.out.println("Planets in the database:");
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
        resultSet.close();
        statement.close();
    }

    private static void insertPlanet(Connection connection, String name, float mass, float radius, float distanceFromSun, float orbitPeriod, boolean hasRings, int discoveredYear) throws SQLException {
        String insertPlanetSQL = "INSERT INTO Planets (Name, Mass, Radius, DistanceFromSun, OrbitPeriod, HasRings, DiscoveredYear) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement insertStatement = connection.prepareStatement(insertPlanetSQL);
        insertStatement.setString(1, name);
        insertStatement.setFloat(2, mass);
        insertStatement.setFloat(3, radius);
        insertStatement.setFloat(4, distanceFromSun);
        insertStatement.setFloat(5, orbitPeriod);
        insertStatement.setBoolean(6, hasRings);
        insertStatement.setInt(7, discoveredYear);

        int rowsInserted = insertStatement.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("A new planet was inserted successfully!");
        }
        insertStatement.close();
    }

    private static void updatePlanet(Connection connection, int planetId, float newMass) throws SQLException {
        String updatePlanetSQL = "UPDATE Planets SET Mass = ? WHERE PlanetID = ?";
        PreparedStatement updateStatement = connection.prepareStatement(updatePlanetSQL);
        updateStatement.setFloat(1, newMass);
        updateStatement.setInt(2, planetId);

        int rowsUpdated = updateStatement.executeUpdate();
        if (rowsUpdated > 0) {
            System.out.println("An existing planet was updated successfully!");
        }
        updateStatement.close();
    }

    private static void deletePlanet(Connection connection, int planetId) throws SQLException {
        String deletePlanetSQL = "DELETE FROM Planets WHERE PlanetID = ?";
        PreparedStatement deleteStatement = connection.prepareStatement(deletePlanetSQL);
        deleteStatement.setInt(1, planetId);

        int rowsDeleted = deleteStatement.executeUpdate();
        if (rowsDeleted > 0) {
            System.out.println("A planet was deleted successfully!");
        }
        deleteStatement.close();
    }
}

