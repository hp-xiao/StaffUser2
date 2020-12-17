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
				System.out.println("登录成功，身份是" + user.getRole());
			}else {
				System.out.println("登录失败");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}		
	}

}
