package com.mavenspring.SpringTest004_Core_PerformerApp2;

import org.springframework.stereotype.Component;

@Component
public class Guitar implements Instrument {
	
	public Guitar() {
		System.out.println("guitar constructor");
	}

	public void play() {
		System.out.println("Guitar playing");
	}

}
