package com.icss.biz;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.icss.dto.StaffCard;
import com.icss.entity.Card;
import com.icss.entity.Staff;
import com.icss.entity.User;

public interface IStaff {
	/**
	 * 添加员工信息时，系统自动创建一个默认用户
	 * @param staff
	 * @param user
	 */
	public void addStaffUser(Staff staff, User user) throws Exception;
	
	
	/**
	 * 添加打卡记录
	 * @param card
	 * @throws Exception
	 */
	public void addCard(Card card) throws Exception;
	
	/**
	 * 查询某个员工的打卡信息
	 * @param sno
	 * @return
	 */
	public List<StaffCard> getStaffCards(String sno) throws Exception;
	
	public List<Staff> getStaffCards2(String sno) throws Exception;
}
