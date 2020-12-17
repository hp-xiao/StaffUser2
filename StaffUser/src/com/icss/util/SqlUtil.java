package com.icss.util;

import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public abstract class SqlUtil {
	
	/**
	 * ���ݴ����ʵ�����ת�������ݿ���Ҫ��insert sql 
	 * @param tableName
	 * @param entity
	 * @return
	 */
	public static void addObject(String tableName,Object entity) throws Exception{
		Map<String,Object> map = new HashMap<String, Object>();
		
		Field[] list = entity.getClass().getDeclaredFields();
		for(Field fd : list ) {
			fd.setAccessible(true);        //���÷���Ȩ��
			Object value = fd.get(entity); //�����������ҵ�����ֵ
			map.put(fd.getName(), value);		
		}
		String sql = getInsertSql(tableName,map);
		
		System.out.println(sql);		
	}
	
	
	
	/**
	 * �Զ�����insert���
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
		//����ֵ
		buffer.append(" values(");
		i=0;
		for(String fname : keys) {
			Object obj = fields.get(fname);
			String value;
			if(obj != null) {
				if(obj.getClass() == String.class) {
					//�ַ�����Ҫ��''
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
