package org.example;

import java.sql.*;

/**
 * --------- Basic Command of SQL ----------
 * mysql -u root -p
 * show databases;
 * create database demo;
 * show databases;
 * use demo;
 * create table employee (id integer , name char(50));
 * describe employee;
 * insert into employee (id, name) values (1 , "mark");
 * select * from employee;
 * update employee set name= 'mark2' where id = 1;
 * delete * from employee where id = 1;
 */
public class App {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        Step 1:  load the driver
//            Class.forName("jdbc:mysql.jdbc.Driver");
//        step 2: create a connnection
        String url = "jdbc:mysql://localhost:3306/demo";
        String username = "root";
        String pass = "8917";
        Connection connection = DriverManager.getConnection(url, username, pass);
//      Step 3: create statement object
        Statement statement = connection.createStatement();

//        Step 4: Execute query
//        String sql = "select * from employee";
//        ResultSet resultSet= statement.executeQuery(sql); // executeQuery use for the select statement orr execute update use for the insert, delete , update
//        // resultSet is not the kind of the array its kind of the iterator then we need to perform implement the while loop for the result
//        while(resultSet.next()){
//            System.out.println("Id: "+ resultSet.getInt(1) +", Name: "+resultSet.getString(2));
//        }

//        ----------Insert query -----------------
//        String sql ="Insert into employee (id, name) values (5,'krishna');";
//        int count= statement.executeUpdate(sql);
//        System.out.println("("+count+")"+" row affected.");


//       ---------------- Update Query -----------
//        String sql = "update employee set name='Ram' where id=1; ";
//        int count = statement.executeUpdate(sql);
//        System.out.println("(" + count + ")" + " row updated.");
//
//        ------------------------ Delete query-------------------
        String sql  = "delete from employee where id=3";
        int count = statement.executeUpdate(sql);
        System.out.println("( "+count+" )"+ " row deleted");
//      step 5: close the connection
        connection.close();

    }
}
