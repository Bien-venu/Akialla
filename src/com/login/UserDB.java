package com.login;

import java.sql.*;

import javax.swing.JOptionPane;

public class UserDB {

	String dburl = "jdbc:mysql://localhost/aekiladb";
	String dbuser = "root";
	String dbpwd = "";
	
	Connection cnx;
	public Connection dbConnection() {
		
		try {
			cnx = DriverManager.getConnection(dburl, dbuser, dbpwd);	
		 
		 if(cnx!=null) {
			 JOptionPane.showMessageDialog(null,"Db Connected successful" ,"Message", 1);
		 }
		}
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cnx;
		
	}
	
	public void addUser(String Name,String Email,String Password ) throws SQLException {
		String sql = "INSERT INTO users(Name,Email,Password) VALUES (?,?,?,?)";
		PreparedStatement st =  cnx.prepareStatement(sql);
		st.setString(1,Name);
		st.setString(2,Email);
		st.setString(3,Role);
		st.setString(4,Password);
		int row = st.executeUpdate();
		
		if(row>0) {
			JOptionPane.showMessageDialog(null,"User created successfully" ,"Message", 1);
			
		}
	}

}
