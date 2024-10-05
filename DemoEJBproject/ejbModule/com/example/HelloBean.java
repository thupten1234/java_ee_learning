package com.example;

import javax.ejb.Remote;

@Remote
public interface HelloBean {
	public String getMessageFor(String caller);

}
