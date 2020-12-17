package com.icss.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.icss.dto.StaffCard;
import com.icss.entity.Card;
import com.icss.entity.Staff;

public interface IStaffMapper {
	
	/*
	 * 添加员工
	 */
	public void addStaff(Staff staff) throws Exception;
	
	/**
	 * 添加打卡记录
	 * @param card
	 * @throws Exception
	 */
	public void addCard(Card card) throws Exception;
	
	/**
	 * 查询某个员工的打卡信息DTO方案
	 * @param sno
	 * @return
	 */
	public List<StaffCard> getStaffCards(@Param("sno")String sno) throws Exception;
	
	
	/**
	 * 查询某个员工的打卡信息ResultMap方案
	 * @param sno
	 * @return
	 */
	public List<Staff> getStaffCards2(@Param("sno")String sno) throws Exception;
	
	

}
