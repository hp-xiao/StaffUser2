package com.icss.util;

import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public abstract class SqlUtil {
	
	/**
	 * 根据传入的实体对象，转换成数据库需要的insert sql 
	 * @param tableName
	 * @param entity
	 * @return
	 */
	public static void addObject(String tableName,Object entity) throws Exception{
		Map<String,Object> map = new HashMap<String, Object>();
		
		Field[] list = entity.getClass().getDeclaredFields();
		for(Field fd : list ) {
			fd.setAccessible(true);        //设置访问权限
			Object value = fd.get(entity); //根据属性名找到属性值
			map.put(fd.getName(), value);		
		}
		String sql = getInsertSql(tableName,map);
		
		System.out.println(sql);		
	}
	
	
	
	/**
	 * 自动生成insert语句
	 * @param tableName
	 * @param fields
	 * @return
	 */
	public static String getInsertSql(String tableName,Map<String,Object> fields) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("insert into ");
		buffer.append(tableName);
		buffer.append("(");
		Set<String> keys = fields.keySet();
		int i = 0;
		for(String fname : keys) {
			if(i==0) {
				buffer.append(fname);	
			}else {
				buffer.append(",");
				buffer.append(fname);
			}
			i++;			
		}		
		buffer.append(")");
		//插入值
		buffer.append(" values(");
		i=0;
		for(String fname : keys) {
			Object obj = fields.get(fname);
			String value;
			if(obj != null) {
				if(obj.getClass() == String.class) {
					//字符型需要加''
					value = "'" + obj.toString() + "'";				
				}else if(obj.getClass() == java.util.Date.class) {
					SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");				
					value = "to_date('" + sd.format(obj) + "','yyyy-mm-dd')";				
				}else if(obj.getClass() == java.sql.Timestamp.class) {
					value = "to_date(" + obj.toString() + ",'yyyy-mm-dd hh:mm:ss')";
				}else {
					value = obj.toString();
				}
				if(i>0) {
					value = "," + value;
				}				
			}else {
				if(i==0) {
					value = "null";
				}else {
					value = ",null";	
				}				
			}			
			i++;
			buffer.append(value);
		}		
		buffer.append(")");
		
		
		return buffer.toString();
	}

}
