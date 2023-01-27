package com.myjavapractice.jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcInsertExample {


	public static void main(String[] args) {
		Properties obj = new Properties();
		FileInputStream files;
		try {
			files = new FileInputStream("C:\\Users\\91948\\eclipse-workspace\\MyJavaPractice\\src\\com\\myjavapractice\\jdbc");
			obj.load(files);
		}catch (IOException e) {
				e.printStackTrace();
			}
		try(
				Connection connection = DriverManager.getConnection(obj.getProperty("DB_URL"),
						obj.getProperty("DB_USERNAME"), obj.getProperty("DB_PASSWORD")))
				{
			String sql = "Insert INTO contact(name, address) values (?, ?)";
			
			PreparedStatement statement = connection.prepareStatement(sql); 
			
			int parameterindex;
			statement.setString(2, "bill");
			statement.setString(3, "nalina");
			statement.setString(4, "bangalore");
int count  = statement.executeUpdate(); 
			
			System.out.println(count);
		} catch(SQLException ex) {
			ex.printStackTrace();
		}
	}

}
