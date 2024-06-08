package com.itsc.ioc;

public class EthioTel implements SimInterface {
	
	@Override	
	public void calling () {
		
		System.out.println("Calling with EthioTel Sim");
	}
	
	@Override
	public void data() {
		
		System.out.println("Browssing Wti EthioTel Sim");
	}	

}
