package model.dao;

import model.dao.impl.SellerdDaoJDBC;

public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		return new SellerdDaoJDBC();
	}
}
