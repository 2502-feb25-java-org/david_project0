package com.revature.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.model.User;
import com.revature.util.ConnectionFactory;

/**
 * 
 * @author goode
 * The DAO (Data Access Object) should be the only place
 * where a connection is made to the database
 * This design pattern allows for a separation of concern
 * and allows for a nice cohesive code
 * 
 * JDBC - Java Database Connectivity
 */
public class UserDAO {
	
	/*
	 * STATEMENT - important interface in JDBC API 
	 * - takes an SQL statement as a string, executes it, 
	 * returns the result
	 * - allows SQL injection. These not ideal to use. Definitely
	 * do NOT use for any SQL command that uses a parameter/variabe
	 * 
	 * SQL injection - common hacking technique, it is the insertion 
	 * of code as iput that affects your database
	 */
	
	public List<User> getUsers(){
		List<User> users = new ArrayList<User>();
			
		try(Connection conn = ConnectionFactory.getInstance().getConnection()){
			
			String query = "select * from demo_user";
			
			//STATEMENT interface
			
			Statement statement = conn.createStatement();
			
			//RESUTLSET interface - represents the set of results of a DB query
			ResultSet rs = statement.executeQuery(query);
			
			while(rs.next()) {
				User temp = new User(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString("BIO"));
				
				users.add(temp);
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return users;
	}

	/*
	 * PRepared Statements
	 * 
	 */

public User getByUsername(String username) {
	User u = null;
	try(Connection conn = ConnectionFactory.getInstance().getConnection()){
		String sql = "select * from demo_user where lower(username) = ? ";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1,username.toLowerCase()); //by index
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			u = new User(
					rs.getInt(1),
					rs.getString(2),
					rs.getString(3),
					rs.getString("BIO"));			
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return u;
}
/*
 * Prepared statement to execute UPDATE
 */
public User addUser(User u) {
	try(Connection conn = ConnectionFactory.getInstance().getConnection()){
		//conn.setAutoCommit(); is set to true
		String sql = "insert into demo_user(username, password, bio)\r\n values(?, ?, ?)";
		String[] keyNames = {"U_ID"}; //allows us to specify col name of autogenerated fiewls to get bakck
		PreparedStatement ps = conn.prepareStatement(sql, keyNames);
		ps.setString(1, u.getUsername());
		ps.setString(2, u.getPassword());
		ps.setString(3, u.getBio());
		
		int numRowsAffected = ps.executeUpdate();
		//could also just call ps.executeUpdate w/o setting it equal to anythign
		//but we want to see num rows affected
		System.out.println("ADDED " + numRowsAffected + " USER(S) TO DB");
		
		if(numRowsAffected == 1) {
			ResultSet pk = ps.getGeneratedKeys(); //result set of primary key
			pk.next();
			u.setId(pk.getInt(1));			
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return u;
}
}
