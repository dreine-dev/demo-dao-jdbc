package model.dao;

import db.DB;
import model.dao.implemente.DepartmentDaoJDBC;
import model.dao.implemente.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao createdSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDao createdDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}
}
