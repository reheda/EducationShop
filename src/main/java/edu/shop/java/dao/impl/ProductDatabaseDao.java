package edu.shop.java.dao.impl;

import org.springframework.stereotype.Repository;

import edu.shop.java.dao.ProductDao;
import edu.shop.java.models.Product;

@Repository
public class ProductDatabaseDao extends HibernateAbstractDao<Product> implements ProductDao {

	public ProductDatabaseDao() {

	}
}
