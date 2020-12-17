package com.icss.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.icss.dto.StaffCard;
import com.icss.entity.Card;
import com.icss.entity.Staff;

public interface IStaffDao {
	
	/**
	 * ���Ա��
	 * @param staff
	 * @throws Exception
	 */
	public void addStaff(Staff staff) throws Exception;
	
	/**
	 * ��Ӵ򿨼�¼
	 * @param card
	 * @throws Exception
	 */
	public void addCard(Card card) throws Exception;
	
	/**
	 * ��ѯĳ��Ա���Ĵ���Ϣ
	 * @param sno
	 * @return
	 */
	public List<StaffCard> getStaffCards(String sno) throws Exception;
	
	public List<Staff> getStaffCards2(String sno) throws Exception;

}
