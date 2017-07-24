package com.company.dao.pojo;

import java.io.Serializable;

/**
 * 
 * @author Administrator
 * 对应t_product表  产品表
 */
public class Product implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int pid;
	private String pname;//产品名称
	private String ean;//产品条码号
	private double price;//产品单价
	
	public Product() {
		super();
	}
	public Product(String pname, String ean, double price) {
		super();
		this.pname = pname;
		this.ean = ean;
		this.price = price;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getEan() {
		return ean;
	}
	public void setEan(String ean) {
		this.ean = ean;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", ean=" + ean
				+ ", price=" + price + "]";
	}
	
}
