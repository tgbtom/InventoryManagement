package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class MakeNewProduct {

	JPAProductDao productDao;
	
	@BeforeClass
	public static void setUp() {
		this.productDao = new JPAProductDao();
	}
	
	@Test
	public void addThenFindProduct() {
		Product product = new Product();
		productDao.create(product);
		Product foundProd = productDao.findById();
		assertNotNull(foundProd);
	}

}
