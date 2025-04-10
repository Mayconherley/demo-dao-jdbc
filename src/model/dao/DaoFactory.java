package model.dao;

import db.DB;
import model.dao.impl.SellerdDaoJDBC;

public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		return new SellerdDaoJDBC(DB.getConnection());
	}
}
