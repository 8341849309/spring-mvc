package com.nt.service;

import java.time.LocalDateTime;

public class WishMessageGeneratorImpl implements IWishMessageGenerator {

	private LocalDateTime dt;

	public WishMessageGeneratorImpl(LocalDateTime dt) {
		this.dt = dt;
		System.out.println("WishMessageGeneratorImpl.WishMessageGeneratorImpl()");
	}

	public String wishMessage() {
		System.out.println("WishMessageGeneratorImpl.wishMessage()");
		
		int hours = dt.getHour();
		String msg="";
		
		if(hours<12)
			msg="Good Morning";
		else if(hours>12 && hours<16) 
			msg="Good After Noon";
		else if(hours>16 && hours<18)
			msg="Good Evening";
		else
			msg="Good Night";

		return msg;
	}

}
