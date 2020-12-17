package com.icss.ui;

import com.icss.entity.User;
import com.icss.util.SqlUtil;

public class TestInsert {
	
	public static void test1() {
		String tableName = "tuser";
        User user = new User();
        user.setUname("tom");
        user.setPwd("123456");
        user.setRole(2);
        user.setSno("s001");	
        try {
        	SqlUtil.addObject(tableName, user);	
		} catch (Exception e) {
		}		
	}
	
	public static void main(String[] args) {
		test1();
	}

}
