package ulezu.com.idao;

import java.sql.SQLException;

import ulezu.com.model.MUser;

public interface IUserDaoTest {
	public MUser getUserById(String id) throws SQLException;
}
