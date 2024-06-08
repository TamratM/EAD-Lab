package com.itsc.ioc;

public class Mobile {

	public static void main(String[] args) {
		
		SimInterface  sim = new Safaricom();
		
		sim.data();
		
		sim.calling();
		
	}

}
