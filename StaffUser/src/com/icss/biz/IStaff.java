package com.icss.biz;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.icss.dto.StaffCard;
import com.icss.entity.Card;
import com.icss.entity.Staff;
import com.icss.entity.User;

public interface IStaff {
	/**
	 * ���Ա����Ϣʱ��ϵͳ�Զ�����һ��Ĭ���û�
	 * @param staff
	 * @param user
	 */
	public void addStaffUser(Staff staff, User user) throws Exception;
	
	
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
