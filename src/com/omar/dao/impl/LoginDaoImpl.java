package com.omar.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.omar.dao.LoginDao;
import com.omar.utils.JdbcUtil;

public class LoginDaoImpl implements LoginDao {

	@Override
	public Boolean getBooleanByNamePsd(String name, String psd) {
		// TODO Auto-generated method stub
		String sql = "select * from loginMsg where name='"+name+"' and psd='"+psd+"';";
		System.out.println(sql);
		Connection conn = JdbcUtil.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		Boolean flag = false;
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				String loginname = rs.getString("name");
				String loginpsd = rs.getString("psd");
				flag = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JdbcUtil.free(rs, ps, conn);;
		}
		
		return flag;
	}

}
