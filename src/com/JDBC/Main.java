package com.JDBC;

import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException {
	// write your code here
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localHost:1521:XE", "emp_user", "password");
        PreparedStatement preparedStatement = connection.prepareStatement("Select id from employee");
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            System.out.println("id = "+resultSet.getInt(1));
        }
    }
}
