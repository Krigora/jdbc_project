package com.cydeo.jdbctest.day1;

import java.sql.*;

public class TestOracleConnection {

    public static void main(String[] args) throws SQLException {


        String dbUrl = "jdbc:oracle:thin:@52.70.115.68:1521:XE";
        String dbUserName = "hr";
        String dbPassword = "hr";

        // DriverManager class getConnection method is used for make connection with DB
      Connection conn = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);

        // Create statement from Connection to runQueries
       Statement statement = conn.createStatement();


       //using with statement we will execute query
       ResultSet rs = statement.executeQuery("select * from regions");

       //move to cursor first row
        rs.next();

        //now we are at first row w will get data
        System.out.println("rs.getString(\"region_name\") = " + rs.getString("region_name"));
        System.out.println("rs.getString(2) = " + rs.getString(2));




        //close connection

       rs.close();
        statement.close();
        conn.close();

    }
}
