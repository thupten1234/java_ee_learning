package com.example;

import javax.ejb.LocalBean;

@LocalBean
public interface LocalHelloBean {
	public String localMessage(String caller);
}
