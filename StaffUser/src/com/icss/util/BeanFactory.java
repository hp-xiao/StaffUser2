package com.icss.util;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanFactory {
	private static ClassPathXmlApplicationContext ac;    //SpringÈÝÆ÷ÊÇµ¥Àý
	
	static {
		try {
			ac = new ClassPathXmlApplicationContext("beans.xml");
		} catch (Exception e) {
			Log.logger.error(e.getMessage(),e);
		}
		
	}
	
	public static Object getBean(String name) throws BeansException {
		return ac.getBean(name);
	}
	
	public static Object getBean(String name,java.lang.Object... args) throws BeansException {
		return ac.getBean(name,args);
	}
	
	public static Object getBean(Class cls) throws BeansException {
		return ac.getBean(cls);
		
	}
	
	public static void close() {
		Log.logger.info("¹Ø±ÕspringÈÝÆ÷");
		ac.close();
	}
	

}
