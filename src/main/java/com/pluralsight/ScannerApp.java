package com.pluralsight;

import java.sql.*;
import java.util.Scanner;

public class ScannerApp {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String url = "jdbc:mysql://127.0.0.1:3306/northwind";
        String user = "root";
        String password = "yearup";

        String query = "SELECT * FROM Products WHERE ProductID = ? OR ProductName LIKE ?";

        try{

            Connection connection = DriverManager.getConnection(url,user,password);
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            System.out.print("Search By ProductName:");
            String name = scanner.nextLine();

            preparedStatement.setString(1,"%" + name + "%");

            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){

            }



        }catch (SQLException e){
            e.printStackTrace();
        }


    }
}
