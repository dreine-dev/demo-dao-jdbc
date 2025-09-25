package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Department obj = new Department(1, "Books");

		Seller seller = new Seller(21, "João", "joao@gmail.com", new Date(), 2000.00, obj);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println(obj);
		System.out.println(seller);
		System.out.println(sellerDao);

	}

}
