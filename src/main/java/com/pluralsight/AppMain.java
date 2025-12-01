package com.pluralsight;

import java.sql.*;
import java.util.Scanner;

public class AppMain {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws SQLException {

        String query = "SELECT ProductID, ProductName, UnitPrice, UnitsInStock FROM Products";
        // ProductID
//Product Name
//Unit Price
//Units In Stock

        try{
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/northwind",
                    "root",
                    "yearup"
            );

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                int id = resultSet.getInt("ProductID");
                String Name = resultSet.getString("ProductName");
                double price = resultSet.getDouble("UnitPrice");
                int stock = resultSet.getInt("UnitsInStock");

//                System.out.println("ID" + " " + id +  " : " + "\n" + "Name" + " " + Name + "\n" + "Price" + " " + price  );

                System.out.println("ID:" + " " + id);
                System.out.println("Name:"+ " " + Name);
                System.out.println("Unit Price:$"+ " " + price);
                System.out.println("Units In Stock:"+ " " + stock);
                System.out.println("==============================================");
            }
            resultSet.close();
            preparedStatement.close();
            connection.close();


            // ProductID
//Product Name
//Unit Price
//Units In Stock
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
// ProductID
//Product Name
//Unit Price
//Units In Stock
