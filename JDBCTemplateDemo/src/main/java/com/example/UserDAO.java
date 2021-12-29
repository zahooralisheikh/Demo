package com.example;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserDAO {
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}
	//performing CRUD operation using JDBC template
	
	//insert operation
	public int saveUser(User user) {
		//String query="insert into users values("+user.getId()+","+user.getEmail()+ ","+user.getPassword()+","+user.getMobile();
		String query="insert into users values('"+user.getId()+"','"+user.getEmail()+ "','"+user.getPassword()+"')";
		
		return jdbcTemplate.update(query);
	}
	//update operation
	public int updateUser(User user) {
		
		//String query="update users set id="+user.getId()+",email="+user.getEmail()+ ",password="+user.getPassword()+",mobile="+user.getMobile();
		String query = "update users set email = '" + user.getEmail()+"',password='"+user.getPassword()+ "'where id ='"+user.getId()+"'";
		return jdbcTemplate.update(query);
	}
	//delete operation
	public int deleteUser(User user) {
		//String query="delete from users where  id=2";
		String query = "delete from users where id= '" + user.getId() +"' ";
		return jdbcTemplate.update(query);
	}
}

// String query = "insert into users values('"+user.getId()+"','" + user.getEmail()+"','"+ user.getPassword()+"')";
//String query = "update users set email = '" + user.getEmail()+"',password='"+user.getPassword()+ "'where id ='"+user.getId()+"'";
// String query = "delete from users where id= '" + user.getId() +"' ";