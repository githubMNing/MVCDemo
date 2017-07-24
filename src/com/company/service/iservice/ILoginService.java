package com.company.service.iservice;

import com.company.dao.pojo.Detail;
import com.company.dao.pojo.Login;

public interface ILoginService extends IBaseService<Login,Integer>{
	//service类设计原则：一定要有反馈  异常需要全部处理 不能抛出
	String login(Login login);
	String registry(Login login,Detail detail);
}
