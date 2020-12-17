package com.icss.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.icss.dao.IStaffDao;
import com.icss.dto.StaffCard;
import com.icss.entity.Card;
import com.icss.entity.Staff;
import com.icss.mapper.IStaffMapper;

@Repository
public class StaffDao extends BaseDao implements IStaffDao{
	@Autowired
	private IStaffMapper mapper;

	@Override
	public void addStaff(Staff staff) throws Exception {		
		mapper.addStaff(staff);		
	}


	@Override
	public void addCard(Card card) throws Exception {
		mapper.addCard(card);	
		System.out.println("Ö÷¼ü·µ»Ø£º" + card.getAid());
	}


	@Override
	public List<StaffCard> getStaffCards(String sno) throws Exception {
		
		return mapper.getStaffCards(sno);
	}


	@Override
	public List<Staff> getStaffCards2(String sno) throws Exception {
		return mapper.getStaffCards2(sno);
	}
}
