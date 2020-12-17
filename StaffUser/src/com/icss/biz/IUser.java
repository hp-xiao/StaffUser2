package com.icss.biz;

import java.util.List;

import com.icss.entity.User;

public interface IUser {
	/**
	 * ʹ��Ա����ŵ�¼
	 * @param sno  
	 * @param pwd
	 * @return
	 * @throws Exception
	 */
	public User login(String sno,String pwd) throws Exception;
	
	/**
	 * ����ָ��Ա�����û���
	 * @param sno
	 * @param newName
	 * @throws Exception
	 */
	public void updateUname(String sno,String newName) throws Exception;
	
	/**
	 * �����û�������
	 * @param sno
	 * @param newPwd
	 * @throws Exception
	 */
	public void updatePassword(String sno,String newPwd) throws Exception;	

	
	
	/**
	 * ��ȡ�����û�
	 * @return
	 * @throws Exception
	 */
	public List<User> getAllUser(List<String> snoList) throws Exception;
	
}
