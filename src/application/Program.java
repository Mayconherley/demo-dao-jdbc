package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		
		
		
		System.out.println("===TEST 1: seller findById ===");
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.FindById(3);
		System.out.println(seller);
		
		System.out.println("\n===TEST 2: seller findByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj : list) {
			System.out.println(obj);
		}
		System.out.println("\n===TEST 3: seller findByAll ===");
	    list = sellerDao.findAll();
		for(Seller obj : list) {
			System.out.println(obj);
			}
	}
}
