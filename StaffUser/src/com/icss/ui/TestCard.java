package com.icss.ui;

import java.util.Date;

import com.icss.biz.IStaff;
import com.icss.biz.impl.StaffBiz;
import com.icss.entity.Card;
import com.icss.util.BeanFactory;

public class TestCard {
	
	public static void main(String[] args) {
		IStaff biz = (IStaff)BeanFactory.getBean(IStaff.class);
		
		Card card = new Card();
		card.setCtime(new Date());
		card.setSno("s001");
		card.setInfo("Õý³£");
		try {
			biz.addCard(card);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
