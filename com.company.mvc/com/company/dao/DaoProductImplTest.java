package com.company.dao;


import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.company.dao.factory.DaoFactory;
import com.company.dao.idao.IProductDao;
import com.company.dao.pojo.Product;

public class DaoProductImplTest {
		private IProductDao productDao;
	@Before
	public void setUp() throws Exception {
		productDao = DaoFactory.getProductInstance();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSave() throws Exception {
		Product p1 = new Product("dd","dd",15);
		Product p2 = new Product("ee","ee",12);
		Product p3 = new Product("ff","ff",11);
		productDao.save(p1);
		productDao.save(p2);
		productDao.save(p3);
	}

	@Test
	public void testUpdate() throws Exception {
		Product p = new Product();
		p.setPid(1);
		p.setPname("EE");
		p.setEan("009");
		p.setPrice(15);
		productDao.update(p);
	}

	@Test
	public void testDelete() throws Exception {
		Product p = new Product();
		p.setPid(1);
		productDao.delete(p);
	}

	@Test
	public void testFindAll() throws Exception {
		List<Product> list = productDao.findAll();
		System.out.println(list);
	}

	@Test
	public void testFindById() throws Exception {
		Product product = productDao.findById(2);
		System.out.println(product);
	}

	@Test
	public void testFindByName() throws Exception {
		List<Product> list = productDao.findByName("b");
		System.out.println(list);
	}
	
	@Test
	public void testFindByPage() throws Exception {
		List<Product> list = productDao.findByPage(3,2);
		System.out.println(list);
	}

}
