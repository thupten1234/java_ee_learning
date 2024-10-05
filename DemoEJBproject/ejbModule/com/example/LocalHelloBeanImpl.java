package com.example;

import javax.ejb.Stateless;

@Stateless
public class LocalHelloBeanImpl implements LocalHelloBean{
	@Override
	public String localMessage(String caller) {
		return "hello from local ejb::localMessage " + caller;
	}
}
