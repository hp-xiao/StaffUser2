package com.icss.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.icss.dto.StaffCard;
import com.icss.entity.Card;
import com.icss.entity.Staff;

public interface IStaffDao {
	
	/**
	 * 添加员工
	 * @param staff
	 * @throws Exception
	 */
	public void addStaff(Staff staff) throws Exception;
	
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
