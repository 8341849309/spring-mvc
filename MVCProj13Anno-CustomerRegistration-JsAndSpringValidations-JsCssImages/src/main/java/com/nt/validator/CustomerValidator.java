package com.nt.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nt.model.Customer;

@Component("validator")
public class CustomerValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		System.out.println("CustomerValidator.supports()");
		return clazz.isAssignableFrom(Customer.class);
	}

	public void validate(Object target, Errors errors) {
		System.out.println("CustomerValidator.validate()");
		
		Customer cust=(Customer) target;
		
		if (cust.getCname()==null || cust.getCname().isBlank())
			errors.rejectValue("cname", "cname.required");
		else if(cust.getCname().length()<5)
			errors.rejectValue("cname", "cname.minlen");
		
		if (cust.getCadd()==null || cust.getCadd().isBlank())
			errors.rejectValue("cadd", "cadd.required");
		else if(cust.getCadd().length()<8)
			errors.rejectValue("cadd", "cadd.minlen");
		
		if(cust.getBillAmt()==0.0f)
			errors.rejectValue("billAmt", "billAmt.required");
		else if(cust.getBillAmt()<0)
			errors.rejectValue("billAmt", "billAmt.positive");
		
	}

}
