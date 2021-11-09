package com.wavelabs.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.wavelabs.bean.Address;
import com.wavelabs.bean.User;

public class DaoImplementation implements Dao {
	private String url = "jdbc:mysql://localhost:3306/";
	private String dbName = "address_book";
	private String username = "root";
	private String password = "Vspk1998@";
	private Connection con;
	private Statement st;
	private PreparedStatement pms;

	@Override
	public void initDB() throws SQLException {
		con = DriverManager.getConnection(url + dbName, username, password);
		st = con.createStatement();
	}

	@Override
	public void closeDB() throws SQLException {
		con.close();
	}

	@Override
	public int insertUser(User us) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertAddress(Address ad) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateAddress(Address ad) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateUser(User us) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteAddress() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteUser() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Address readUserAddress() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User loginDetails(User us) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
