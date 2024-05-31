package com.ironman.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionCore {

    public Connection getConnection() throws Exception {
        // Attributes
        String hostName = "dpg-cpa0r9tds78s73cp2ueg-a.oregon-postgres.render.com";
        String port = "5432";
        String dbName = "restaurant_management_db";
        String userName = "developer";
        String password = "Uj65aOw7qX1OqalviBjSpn4EPiubf468";

        // process

        // Load driver
        Class.forName("org.postgresql.Driver");

        // url connection
        String url = "jdbc:postgresql://" + hostName + ":" + port + "/" + dbName;


        // result
        return DriverManager.getConnection(url, userName, password);
    }
}
