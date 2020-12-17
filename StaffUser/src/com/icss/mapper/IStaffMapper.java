package com.icss.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.icss.dto.StaffCard;
import com.icss.entity.Card;
import com.icss.entity.Staff;

public interface IStaffMapper {
	
	/*
	 * ���Ա��
	 */
	public void addStaff(Staff staff) throws Exception;
	
	/**
	 * ��Ӵ򿨼�¼
	 * @param card
	 * @throws Exception
	 */
	public void addCard(Card card) throws Exception;
	
	/**
	 * ��ѯĳ��Ա���Ĵ���ϢDTO����
	 * @param sno
	 * @return
	 */
	public List<StaffCard> getStaffCards(@Param("sno")String sno) throws Exception;
	
	
	/**
	 * ��ѯĳ��Ա���Ĵ���ϢResultMap����
	 * @param sno
	 * @return
	 */
	public List<Staff> getStaffCards2(@Param("sno")String sno) throws Exception;
	
	

}
