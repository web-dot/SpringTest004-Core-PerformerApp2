package com.mavenspring.SpringTest004_Core_PerformerApp2;

import org.springframework.stereotype.Component;

@Component
public class Tabla implements Instrument {
	
	public Tabla() {
		System.out.println("tabla constructor");
	}

	public void play() {
		System.out.println("Tabla playing");
	}

}
