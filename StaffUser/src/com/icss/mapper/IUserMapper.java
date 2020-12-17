package com.icss.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.icss.entity.User;

public interface IUserMapper {
	
	public void addUser(User user) throws Exception ;
	
	/**
	 * ��ȡ�����û�
	 * @return
	 * @throws Exception
	 */
	public List<User> getAllUser(List<String> snoList) throws Exception;
	
	/**
	 * �����û�
	 * @param sno
	 * @return
	 * @throws Exception
	 */
	public User getUser(@Param("sno") String sno) throws Exception;	
	
	/**
	 * ͳ����Ӵ�û�������
	 * @return
	 * @throws Exception
	 */
	public int countAllUserNum() throws Exception;

}
