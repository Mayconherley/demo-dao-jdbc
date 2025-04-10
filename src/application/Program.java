package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerdDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Department obj = new Department(1, "Book");
		Seller seller = new Seller(21, "Dhony", "dhony@gmail.com", new Date(), 2000.0, obj);
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println(seller);
		
	}

}
