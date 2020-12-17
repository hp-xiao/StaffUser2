package com.icss.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icss.biz.IUser;
import com.icss.dao.IUserDao;
import com.icss.entity.User;

@Service
public class UserBiz implements IUser {
	
	@Autowired
	private IUserDao userDao;
	
	
	
	
	@Override
	public List<User> getAllUser(List<String> snoList) throws Exception{	
		return userDao.getAllUser(snoList);
	}	



	@Override
	public void updateUname(String sno, String newName) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void updatePassword(String sno, String newPwd) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public User login(String sno, String pwd) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	
}
