package com.icss.ui;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.icss.biz.IStaff;
import com.icss.biz.IUser;
import com.icss.biz.impl.StaffBiz;
import com.icss.biz.impl.UserBiz;
import com.icss.entity.Staff;
import com.icss.entity.User;
import com.icss.util.BeanFactory;

public class Test {
	
	public static void testGetAllUser() {
		IUser userBiz = (IUser)BeanFactory.getBean(IUser.class);
		try {
			List<String> snoList = new ArrayList<>();
			snoList.add("s001");
			snoList.add("s002");
			snoList.add("s005");
			List<User> users = userBiz.getAllUser(snoList);
			for(User u : users) {
				System.out.println(u.getUname() + "," + u.getSno());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void testAddStaff() {
		IStaff staffBiz = (IStaff)BeanFactory.getBean(IStaff.class);
		Staff staff = new Staff();
		staff.setSno("s007");
		staff.setAddress("Äþ²¨¸ßÐÂÇø");
		staff.setBirthday(new Date());
		staff.setName("tom5");
		staff.setTel("1332345566");
		User user = new User();
		user.setSno(staff.getSno());
		user.setUname(staff.getSno());
		user.setPwd("123456");
		user.setRole(2);
		try {
			staffBiz.addStaffUser(staff, user);	
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
	}
	

	
	
	public static void main(String[] args) {		
		testGetAllUser();		
	}

}
