package com.mavenspring.SpringTest004_Core_PerformerApp2;

import org.springframework.stereotype.Component;

@Component
public class Piano implements Instrument {
	
	public Piano() {
		System.out.println("piano constructor");
	}
	
	public void play() {
		System.out.println("Piano playing");

	}

}
