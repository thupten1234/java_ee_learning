package com.example;

import javax.ejb.Remote;
import javax.ejb.Stateful;

@Stateful
@Remote(HelloBean.class)
public class HelloBeanImpl {
	private int counter = 0;

	public String getMessageFor(String caller) {
		counter++;
		return "Hello from the EJB module, " + caller + " " + counter;
	}

}
