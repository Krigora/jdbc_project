package com.cydeo.jdbctest.day1;

import java.sql.*;

public class TestOracleConnection {

    public static void main(String[] args) throws SQLException {


        String dbUrl = "jdbc:oracle:thin:@35.174.114.158:1521:XE";
        String dbUserName = "hr";
        String dbPassword = "hr";

        // DriverManager class getConnection method is used for make connection with DB
       Connection conn = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);;
     //   try {
          //  conn = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
       //     System.out.println("CONNECTION WAS SUCCESSFUL");
    //   } catch (SQLException e) {
    //        System.out.println("CONNECTION HAS FAILED " + e.getMessage());
     //   }

        // Create statement from Connection to runQueries
        Statement statement = conn.createStatement();



        //using with statement we will execute query
        ResultSet rs = statement.executeQuery("select * from regions");


        //move to cursor first row
        rs.next();

        //now we are at first row w will get data
        System.out.println("rs.getString(\"region_name\") = " + rs.getString("region_name"));
        System.out.println("rs.getString(2) = " + rs.getString(2));
/*
        // 1- Europe
        // 2 - American

        //second row
        rs.next();
        System.out.println(rs.getInt(1)+"-"+rs.getString(2));

        //third row
        rs.next();
        System.out.println(rs.getInt("region_ID")+"-"+rs.getString("region_name"));

        */
        while(rs.next()){
            System.out.println(rs.getInt(1) + "-"+rs.getString(2));
        }

        //close connection


        rs.close();
        statement.close();
        conn.close();
    }
}
