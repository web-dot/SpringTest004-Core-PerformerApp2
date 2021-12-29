package com.mavenspring.SpringTest004_Core_PerformerApp2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Instrumentalist implements Performer {
	
	private String name;
	@Autowired
	@Qualifier("flute")
	Instrument instrument;

	public Instrumentalist() {
		System.out.println("instrumentalist no arg constructor");
	}
	
	@Autowired
	public Instrumentalist(String name) {
	super();
	this.name = name;
	System.out.println("instrumentalist param constructor");
	}

	public void setName(String name) {
		this.name=name;
	}

	public void perform() {
	
		System.out.println("I am a instrumentalist " + name + " going to perform with " + instrument.toString());
		instrument.play();

	}

}
