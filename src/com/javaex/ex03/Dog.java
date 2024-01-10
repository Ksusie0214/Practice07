package com.javaex.ex03;

public class Dog implements Soundable {

	public String Dog;
	
	
	public Dog() {
		
	}
	
	@Override
	public String sound() {
		return "멍멍";
	}

}
