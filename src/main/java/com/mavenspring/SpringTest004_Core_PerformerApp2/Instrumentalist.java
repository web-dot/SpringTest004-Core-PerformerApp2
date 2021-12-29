package com.mavenspring.SpringTest004_Core_PerformerApp2;

import org.springframework.stereotype.Component;

@Component
public class Instrumentalist implements Performer {
	
	public Instrumentalist() {
		System.out.println("instrumentalist constructor");
	}
	
	String name;
	Instrument instrument;

	public Instrumentalist(String name) {
		super();
		this.name = name;
	}

	public void perform() {
	
		System.out.println("I am a instrumentalist " + name + " going to perform with " + instrument);
		instrument.play();

	}

}
