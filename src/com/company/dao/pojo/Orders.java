package com.company.dao.pojo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 
 * @author Administrator
 * 对应t_order表 表示订单
 */
public class Orders implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int oid;
	private String orderNum;//订单编号
	private String orderTime;//订单产生的时间
	private int userId;//关联t_login（id） 外键
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}
	public String getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Orders() {
		super();
	}
	public Orders(String orderNum,  int userId) {
		super();
		this.orderNum = orderNum;
		String now = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		this.orderTime = now;
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "Orders [oid=" + oid + ", orderNum=" + orderNum + ", orderTime="
				+ orderTime + ", userId=" + userId + "]";
	}

}
