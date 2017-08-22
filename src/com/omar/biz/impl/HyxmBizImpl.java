package com.omar.biz.impl;

import com.omar.biz.HyxmBiz;
import com.omar.dao.HyxmDao;
import com.omar.dao.impl.HyxmDaoImpl;
import com.omar.pojo.HYXM;

public class HyxmBizImpl implements HyxmBiz {
	HyxmDao hyDao = new HyxmDaoImpl();
	@Override
	public Boolean getNewHYXM(HYXM hy) {
		// TODO Auto-generated method stub
		Boolean flag = hyDao.getNewHyxm(hy);
		return flag;
	}

}
