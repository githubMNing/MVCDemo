package com.company.service.iservice;

import java.util.List;

import com.company.dao.pojo.Product;

public interface IProductService extends IBaseService<Product, Integer>{
	List<Product> findByName(String pname);
	
	List<Product> findByPage(int page,int size);
}
