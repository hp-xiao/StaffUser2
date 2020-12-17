package com.icss.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.icss.entity.User;

public interface IUserMapper {
	
	public void addUser(User user) throws Exception ;
	
	/**
	 * 获取所有用户
	 * @return
	 * @throws Exception
	 */
	public List<User> getAllUser(List<String> snoList) throws Exception;
	
	/**
	 * 查找用户
	 * @param sno
	 * @return
	 * @throws Exception
	 */
	public User getUser(@Param("sno") String sno) throws Exception;	
	
	/**
	 * 统计所哟用户的数量
	 * @return
	 * @throws Exception
	 */
	public int countAllUserNum() throws Exception;

}
