package com.gozdecanki.v1;

import java.sql.*;

public class MySqlConnection {

    public static void main(String[] args) {

        Connection connection = null;// bağlantı
        Statement statement= null;// bağlantı cümlesi
        ResultSet resultSet= null;// bağlantı sonucu

        try {
           Class.forName("com.mysql.cj.jdbc.Driver"); // javanın eski sürümlerinde bu şekilde kullanılıyordu yazmasak da çalışır yeni versiyonda

           connection = DriverManager.getConnection(
                   "jdbc:mysql://localhost:3306/companydb",
                   "root",
                   "123456789");

            statement= connection.createStatement();

            String sqlAllCustomers ="Select * from customers";
            resultSet= statement.executeQuery(sqlAllCustomers);

            while(resultSet.next()){
                System.out.println(
                        resultSet.getString("customer_id") + " "+
                        resultSet.getString("first_name") + " "+
                        resultSet.getString("last_name"));
            }

        }catch (SQLException e){
          e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            if(resultSet != null || statement != null || connection !=null){
                try {
                    if (resultSet != null) {
                        resultSet.close();
                    }
                    if (statement != null) {
                        statement.close();
                    }
                    if (connection != null) {
                        connection.close();
                    }
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

        }


    }

}