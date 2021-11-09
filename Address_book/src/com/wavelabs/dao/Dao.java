package com.wavelabs.dao;

import java.sql.SQLException;

import com.wavelabs.bean.Address;
import com.wavelabs.bean.User;

public interface Dao {
	public void initDB() throws SQLException;

	public int insertUser(User us) throws SQLException;

	public int insertAddress(Address ad) throws SQLException;

	public int updateAddress(Address ad) throws SQLException;

	public int updateUser(User us) throws SQLException;

	public int deleteAddress() throws SQLException;

	public int deleteUser() throws SQLException;

	public Address readUserAddress() throws SQLException;

	public User loginDetails(User us) throws SQLException;

	public void closeDB() throws SQLException;
}
