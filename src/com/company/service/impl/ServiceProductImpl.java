package com.company.service.impl;

import java.util.List;

import com.company.dao.factory.DaoFactory;
import com.company.dao.idao.IProductDao;
import com.company.dao.pojo.Product;
import com.company.service.iservice.IProductService;

public class ServiceProductImpl implements IProductService {
	private IProductDao productDao = null;
	
	public ServiceProductImpl(){
		productDao = DaoFactory.getProductInstance();
	}
	@Override
	public String save(Product t) {
		String msg = "error";
		try {
			Product product = productDao.findById(t.getPid());
			if(product == null){
				productDao.save(t);
				msg = "success";
			}	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

	@Override
	public String update(Product t) {
		String msg = "error";
		try {
			Product product = productDao.findById(t.getPid());
			if(product != null){
				productDao.update(t);
				msg = "success";
			}	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

	@Override
	public String delete(Product t) {
		String msg = "error";
		try {
			Product product = productDao.findById(t.getPid());
			if(product != null){
				productDao.delete(t);
				msg = "success";
			}	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

	@Override
	public List<Product> findAll()  {
		List<Product> list = null;
		try {
			list = productDao.findAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Product findById(Integer k) {
		Product p = null;
		try {
			p = productDao.findById(k);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}

	@Override
	public List<Product> findByName(String pname) {
		List<Product> list = null;
		try {
			list = productDao.findByName(pname);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Product> findByPage(int page, int size) {
		List<Product> list = null;
		try {
			list = productDao.findByPage(page, size);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
