package com.novaclangaming.dao;

public interface IProductDao {
	void create(Product product);
	void findById(int productId);
}
