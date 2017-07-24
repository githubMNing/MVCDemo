package com.company.dao.pojo;

import java.io.Serializable;

/**
 * 
 * 
 * @author Administrator
 *  对应t_item表  是Product 和  orders 的产物
 */
public class Item implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int itemid;
	private int oid;//外键order(oid)
	private int pid;//外键 product(pid)
	private int pnum;//购买某一订单某一产品数量
	public Item() {
		super();
	}
	public Item(int oid, int pid, int pnum) {
		super();
		this.oid = oid;
		this.pid = pid;
		this.pnum = pnum;
	}
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getPnum() {
		return pnum;
	}
	public void setPnum(int pnum) {
		this.pnum = pnum;
	}
	@Override
	public String toString() {
		return "Item [itemid=" + itemid + ", oid=" + oid + ", pid=" + pid
				+ ", pnum=" + pnum + "]";
	}
	
	

}
