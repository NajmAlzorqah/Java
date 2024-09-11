package com.najmaldeen;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:sqlserver://NAJM:1433;databaseName=Zorqah;integratedSecurity=true;encrypt=false;trustServerCertificate=true;";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // 1- Connection
            Connection connection = DriverManager.getConnection(jdbcUrl);
            System.out.println("Connected to the database!");

            // 2- Query
            Statement statement = connection.createStatement();

            // 3- Execute Query
            String selectPlanetsSQL = "SELECT PlanetID, Name, Mass, Radius, DistanceFromSun, OrbitPeriod, HasRings, DiscoveredYear FROM Planets";

            ResultSet resultSet = statement.executeQuery(selectPlanetsSQL);

            // 4- ResultSet Mgmt
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

            // 5- Close Connection
            resultSet.close();
            statement.close();
            connection.close();
            System.out.println("Connection has been closed.");


        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }

    }
}