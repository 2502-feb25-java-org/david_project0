package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/*
 * Welcome to your first Hibernate application
 * When mapping hibernate entities with annotations, 
 * we only NEED to use two annotaiton, @Entity - which
 * maps the class as an entity, and @Id - which indicates its 
 * unique id val
 * 
 * Mapping a class as an entity for hibernate 
 */
@Entity
@Table(name = "BLOG_USER")
public class User {
	
	@Id //identifies this column as PK
	@Column(name="USER_ID") //not necessary, can use to apply different name or apply constraints
	
	// name(required), optional: allocationSize, initialValue, sequenceName
	@SequenceGenerator(name="U_SEQ_GEN", sequenceName="BLOG_USER_SEQ", allocationSize=1) //allocation size the increments
	@GeneratedValue(generator="U_SEQ_GEN", strategy=GenerationType.SEQUENCE)
	private int id;
	
	@Column(nullable=false, unique=true)
	private String username;
	
	@Column(nullable=false)
	private String password;
	
	public User(int id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + "]";
	}
	
	

}
