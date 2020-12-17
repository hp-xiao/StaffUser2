package com.icss.biz;

import java.util.List;

import com.icss.entity.User;

public interface IUser {
	/**
	 * 使用员工编号登录
	 * @param sno  
	 * @param pwd
	 * @return
	 * @throws Exception
	 */
	public User login(String sno,String pwd) throws Exception;
	
	/**
	 * 更新指定员工的用户名
	 * @param sno
	 * @param newName
	 * @throws Exception
	 */
	public void updateUname(String sno,String newName) throws Exception;
	
	/**
	 * 更新用户的密码
	 * @param sno
	 * @param newPwd
	 * @throws Exception
	 */
	public void updatePassword(String sno,String newPwd) throws Exception;	

	
	
	/**
	 * 获取所有用户
	 * @return
	 * @throws Exception
	 */
	public List<User> getAllUser(List<String> snoList) throws Exception;
	
}
