package com.gozdecanki.v1;

import java.sql.*;

public class PostgreSqlConnection {

    public static void main(String[] args) {

        Connection connection = null;// bağlantı
        Statement statement = null;// bağlantı cümlesi
        ResultSet resultSet = null;// bağlantı sonucu

        try {
            Class.forName("org.postgresql.Driver");

            connection = DriverManager.getConnection(
                    //   "jdbc:postgresql://localhost:5432/postgres",// bu şekilde db ye gidip sorguda schema ismi verilebilir
                    "jdbc:postgresql://localhost:5432/postgres?currentSchema=companydb",// ya da bu şekilde direkt olarak schemaya gidilebilir
                    "postgres",
                    "postgres");

            statement = connection.createStatement();

            String sqlAllCustomers = "Select * from companydb.customers";// ilk url durumuna göre
            resultSet = statement.executeQuery(sqlAllCustomers);

            while (resultSet.next()) {
                System.out.println(
                        resultSet.getString("customer_id") + " " +
                                resultSet.getString("first_name") + " " +
                                resultSet.getString("last_name"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (resultSet != null || statement != null || connection != null) {
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