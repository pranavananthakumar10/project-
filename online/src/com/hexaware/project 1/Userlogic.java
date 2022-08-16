package com.hexaware.businesslogic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hexaware.connection.DbConnection;
import com.hexaware.model.User;

public class Userlogic {

	public static boolean login(User user) throws SQLException {
		
		Connection con = DbConnection.getConnection();
		ResultSet rs=null;
		PreparedStatement ps=null;
		String sql;
		
		sql = "select * from user where username=? and password=?";
		ps = con.prepareStatement(sql);
		ps.setString(1, user.getUsername());
		ps.setString(2, user.getPassword());
		
		rs = ps.executeQuery();
		
		if(rs.next()) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean register(User user) throws SQLException {
		Connection con = DbConnection.getConnection();
		PreparedStatement ps=null;
		String sql;
		int n;
		
		sql = "insert into user (name, email, mobile, username, password) values(?, ?, ?, ?, ?)";
		ps = con.prepareStatement(sql);
		ps.setString(1, user.getName());
		ps.setString(2, user.getEmail());
		ps.setInt(3, user.getMobile());
		ps.setString(4, user.getUsername());
		ps.setString(5, user.getPassword());
		
		n = ps.executeUpdate();
		
		if(n > 1) {
			return true;
		} else {
			return false;
		}

	}
}
