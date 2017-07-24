package com.company.dao.idao;

import com.company.dao.pojo.Detail;
import com.company.dao.pojo.Login;

public interface ILoginDao extends IBaseDao<Login, Integer> {
	Login login(Login login) throws Exception;
	void registry(Login login,Detail detail) throws Exception;

}
