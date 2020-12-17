package com.icss.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.icss.entity.User;

public interface IUserDao {
	
	public void addUser(User user) throws Exception ;
	
	
	
	
	
	/**
	 * 获取所有用户
	 * @return
	 * @throws Exception
	 */
	/**
	 * 获取所有用户
	 * @return
	 * @throws Exception
	 */
	public List<User> getAllUser(List<String> snoList) throws Exception;
	
	public User getUser(String sno) throws Exception;

}
