package com.company.service.impl;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.company.dao.pojo.Product;
import com.company.service.factory.ServiceFactory;
import com.company.service.iservice.IProductService;

public class ServiceProductImplTest {
	IProductService productService = null;
	
	@Before
	public void setUp() throws Exception {
		productService = ServiceFactory.getProductInstance();
	}

	@Test
	public void testSave() {
		Product product = new Product("book2","12",16);
		product.setPid(11);
		String msg = productService.save(product);
		System.out.println("success".equals(msg)?"success":"error");
	}

	@Test
	public void testUpdate() {
		Product product = new Product("book2","12",16);
		product.setPid(10);
		String msg = productService.update(product);
		System.out.println("success".equals(msg)?"success":"error");
	}

	@Test
	public void testDelete() {
		Product product = new Product();
		product.setPid(10);
		String msg = productService.delete(product);
		System.out.println("success".equals(msg)?"success":"error");
	}

	@Test
	public void testFindAll() {
		List<Product> list = productService.findAll();
		System.out.println(list);
	}

	@Test
	public void testFindById() {
		Product product = productService.findById(10);
		System.out.println(product);
	}

	@Test
	public void testFindByName() {
		List<Product> list = productService.findByName("aa");
		System.out.println(list);
	}

	@Test
	public void testFindByPage() {
		List<Product> list = productService.findByPage(5,2);
		System.out.println(list);
	}

}
