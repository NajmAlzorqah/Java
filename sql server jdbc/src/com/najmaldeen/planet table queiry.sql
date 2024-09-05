create database Planets

-- Create the database
CREATE DATABASE PlanetsDB;
GO

-- Use the database
USE Planets;
GO

-- Create the Planets table
CREATE TABLE Planets (
    PlanetID INT PRIMARY KEY IDENTITY(1,1),
    Name VARCHAR(50),
    Mass FLOAT,               -- in Earth masses
    Radius FLOAT,             -- in kilometers
    DistanceFromSun FLOAT,    -- in millions of kilometers
    OrbitPeriod FLOAT,        -- in Earth years
    HasRings BIT,             -- 1 = has rings, 0 = no rings
    DiscoveredYear INT        -- optional
);
GO

-- Insert data into the Planets table
INSERT INTO Planets (Name, Mass, Radius, DistanceFromSun, OrbitPeriod, HasRings, DiscoveredYear)
VALUES 
('Mercury', 0.055, 2439.7, 57.9, 0.24, 0, NULL),
('Venus', 0.815, 6051.8, 108.2, 0.62, 0, NULL),
('Earth', 1.0, 6371.0, 149.6, 1.0, 0, NULL),
('Mars', 0.107, 3389.5, 227.9, 1.88, 0, NULL),
('Jupiter', 317.8, 69911.0, 778.5, 11.86, 1, NULL),
('Saturn', 95.16, 58232.0, 1434.0, 29.46, 1, NULL),
('Uranus', 14.54, 25362.0, 2871.0, 84.01, 1, NULL),
('Neptune', 17.15, 24622.0, 4495.0, 164.79, 1, NULL);
GO

drop table Planets
