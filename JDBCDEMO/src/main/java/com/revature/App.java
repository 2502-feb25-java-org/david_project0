package com.revature;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {

	public static void main(String[] args) {

		 String hostName = "davidwg.database.windows.net"; // update me
	        String dbName = "AdventureWorks2014FullForAzure"; // update me
	        String user = "davidwg"; // update me
	        String password = "nasa3993#"; // update me
	       //2. Create a connection String
	        String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;"
	            + "hostNameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
	        
	        Connection connection = null;
	        try {
	        	//3. Initialize Connection String
	        	connection = DriverManager.getConnection(url);
	        	
	        	//Create Statement to Push the Query
	        	Statement statement=connection.createStatement();
	        	
	        	String sql1= "select [productName] from Product";
	        	
	        	String sql="insert into Product (productName, unitPrice,qtyAvailable) values('S',599.99,23)";
	        	
	        	//ExecuteUpdate for Insert and Update
	        	//resultSet will hold the values for select query
	        	//ResultSet artists=statement.executeQuery(sql);
	        	int result =statement.executeUpdate(sql);

	        	ResultSet res = statement.executeQuery(sql1);
	        	//next method will check for record every time
	        	while(res.next()) {
	        		System.out.println(res.getString("productName"));        		
	        	}
	        	//make sure to close the ResultSet after read
	        	res.close();
	        	
	        }
	        catch(SQLException ex) {
	        	ex.printStackTrace();
	        }
	       
	    }
	}