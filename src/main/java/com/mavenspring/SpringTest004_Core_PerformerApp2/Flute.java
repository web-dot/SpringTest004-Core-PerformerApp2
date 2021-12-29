package com.mavenspring.SpringTest004_Core_PerformerApp2;

import org.springframework.stereotype.Component;

@Component
public class Flute implements Instrument {

	public Flute() {
		System.out.println("Flute constructor");
	}
	
	public void play() {
		System.out.println("Flute is playing");
	}

	@Override
	public String toString() {
		return "Flute";
	}
	
	

}
