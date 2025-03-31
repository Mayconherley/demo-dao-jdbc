package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {

	void insert(Seller obj);
	void update(Seller obj);
	void deleteByIF(Integer id);
	Seller FindById(Integer id);
	List<Seller> findAll();
}
