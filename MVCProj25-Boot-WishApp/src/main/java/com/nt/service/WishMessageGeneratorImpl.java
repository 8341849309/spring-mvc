package com.nt.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WishMessageGeneratorImpl implements IWishMessageGenerator {

	@Autowired
	private LocalDateTime dt;

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
