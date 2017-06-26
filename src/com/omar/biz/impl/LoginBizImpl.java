package com.omar.biz.impl;

import com.omar.biz.LoginBiz;
import com.omar.dao.LoginDao;
import com.omar.dao.impl.LoginDaoImpl;

public class LoginBizImpl implements LoginBiz {
	LoginDao loginDao = new LoginDaoImpl();
	@Override
	public Boolean getBooleanByNamePsd(String name, String psd) {
		return loginDao.getBooleanByNamePsd(name, psd);
	}

}
