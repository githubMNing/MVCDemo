package com.company.dao.pojo.report;

import com.company.dao.pojo.Item;
import com.company.dao.pojo.Login;
import com.company.dao.pojo.Orders;
import com.company.dao.pojo.Product;

public class OrderReport {
	private Orders order;
	private Item item;
	private Product product;
	private Login login;
	public OrderReport() {
		super();
	}
	public OrderReport(Orders order, Item item, Product product, Login login) {
		super();
		this.order = order;
		this.item = item;
		this.product = product;
		this.login = login;
	}
	public Orders getOrder() {
		return order;
	}
	public void setOrder(Orders order) {
		this.order = order;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	@Override
	public String toString() {
		return "OrderReport [order=" + order + ", item=" + item + ", product="
				+ product + ", login=" + login + "]";
	}
	
	
}
