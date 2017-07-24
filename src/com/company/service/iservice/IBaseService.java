package com.company.service.iservice;

import java.util.List;

/*
 * 基本表接口  便于增加功能或者增加表
 * T：代表传入对象类型
 * K：代表通过ID查询时的传入的参数类型
 */
public interface IBaseService<T,K>{
	String save(T t);
	String update(T t);
	String delete(T t);
	List<T> findAll();
	T findById(K k);
	
	
}
