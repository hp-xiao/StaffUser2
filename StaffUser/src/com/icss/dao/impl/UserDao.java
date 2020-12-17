package com.icss.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.icss.dao.IUserDao;
import com.icss.entity.IRole;
import com.icss.entity.User;
import com.icss.mapper.IUserMapper;

@Repository
public class UserDao extends BaseDao implements IUserDao {
	@Autowired
	private IUserMapper userMapper;
	
	@Override
	public List<User> getAllUser(List<String> snoList) throws Exception{
		return userMapper.getAllUser(snoList);		
	}
	

	@Override
	public User getUser(String sno) throws Exception {
		
		int num = userMapper.countAllUserNum();
		System.out.println("当前库中所有用户数量：" + num);
		
		return userMapper.getUser(sno);	
	}
	
	
	
	@Override
	public void addUser(User user) throws Exception {		
		userMapper.addUser(user);
	}	

}
