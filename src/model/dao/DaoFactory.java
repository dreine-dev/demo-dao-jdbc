package model.dao;

import model.dao.implemente.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao createdSellerDao() {
		return new SellerDaoJDBC();
	}
}
