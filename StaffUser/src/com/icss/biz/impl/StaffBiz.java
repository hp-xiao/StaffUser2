package com.icss.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.icss.biz.IStaff;
import com.icss.dao.IStaffDao;
import com.icss.dao.IUserDao;
import com.icss.dto.StaffCard;
import com.icss.entity.Card;
import com.icss.entity.Staff;
import com.icss.entity.User;

@Service
public class StaffBiz implements IStaff{
	
	@Autowired
	private IStaffDao staffDao;
	
	@Autowired
	private IUserDao userDao;

	/**
	 * 在事务环境中同时添加用户和员工
	 */
	@Transactional(rollbackFor=Throwable.class)
	public void addStaffUser(Staff staff, User user) throws Exception {				
		staffDao.addStaff(staff);		
		userDao.addUser(user);
	}

	@Override
	public void addCard(Card card) throws Exception {
		staffDao.addCard(card);
		
	}

	@Override
	public List<StaffCard> getStaffCards(String sno) throws Exception {
		// TODO Auto-generated method stub
		return staffDao.getStaffCards(sno);
	}

	@Override
	public List<Staff> getStaffCards2(String sno) throws Exception {
		// TODO Auto-generated method stub
		return staffDao.getStaffCards2(sno);
	}

}
