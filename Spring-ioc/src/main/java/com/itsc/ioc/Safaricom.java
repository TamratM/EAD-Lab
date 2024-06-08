package com.itsc.ioc;

public class Safaricom implements SimInterface {
	
	@Override
	public void calling () {
		
		System.out.println("Calling With Safaricom");
	}
	
	@Override
	public void data() {
		
		System.out.println("Browsing with Safaricom Sim");
		
	}
}
