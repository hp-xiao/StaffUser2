package com.icss.ui;

import com.icss.biz.IUser;
import com.icss.biz.impl.UserBiz;
import com.icss.entity.User;

public class LoginTest {
	
	public static void main(String[] args) {		
		
		IUser u = new UserBiz();
		try {
			User user = u.login("admin", "123");	
			if(user != null) {
				System.out.println("��¼�ɹ��������" + user.getRole());
			}else {
				System.out.println("��¼ʧ��");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}		
	}

}
