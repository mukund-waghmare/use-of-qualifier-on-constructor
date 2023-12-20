package com.ty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	
	Mobile mobile;
	
	public Mobile getMobile() {
		return mobile;
	}

	@Autowired
	public void setMobile( @Qualifier(value = "moto") Mobile mobile) {
		this.mobile = mobile;
	}

	
	public void personMethod()
	{
		System.out.println("Hey");
		mobile.mobile();
	}

	
}
