package com.icss.ui;

import java.util.List;

import com.icss.biz.IStaff;
import com.icss.biz.impl.StaffBiz;
import com.icss.dto.StaffCard;
import com.icss.entity.Card;
import com.icss.entity.Staff;
import com.icss.util.BeanFactory;

public class TestStaffCards {
	
	public static void main(String[] args) {
		getStaffCards();		
	}
	
	public static void getStaffCards() {
		IStaff biz = (IStaff)BeanFactory.getBean(IStaff.class);
		try {
			List<StaffCard> cards =  biz.getStaffCards("s001");
			for(StaffCard sc : cards) {
				System.out.println(sc.getSno() + "," + sc.getCtime() + "," + sc.getInfo());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void getStaffCards2() {
		IStaff biz = (IStaff)BeanFactory.getBean(IStaff.class);
		try {
			List<Staff> staffs =  biz.getStaffCards2("s001");
			for(Staff sc : staffs) {
				System.out.println(sc.getSno() + "," + sc.getSno() + "," + sc.getName() );
				System.out.println(sc.getUser().getUname() );
				List<Card> cards =  sc.getCards();
				for(Card c : cards) {
					System.out.println(c.getCtime() + "," + c.getInfo());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
