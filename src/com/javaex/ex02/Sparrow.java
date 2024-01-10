package com.javaex.ex02;

public class Sparrow extends Bird {

	private String Sparrow;
	private String fly;
	private String sing;

	
	
	
	public Sparrow() {
		
	}
	
	public Sparrow (String name, String fly, String sing) {
		super(name);
		this.fly = fly;
		this.sing= sing;
		
	}

	public String getFly() {
		return fly;
	}

	public void setFly(String fly) {
		this.fly = fly;
	}

	public String getSing() {
		return sing;
	}

	public void setSing(String sing) {
		this.sing = sing;
	}
	
	public void fly() {
		System.out.println("참새 ("+super.getName()+")가 날아 다닙니다");
	}
	
	public void sing() {
		System.out.println("참새 ("+super.getName()+")가 소리내어 웁니다");
	}
	public void showName() {
		System.out.println("참새의 이름은 짹짹이 입니다.");
	}
}
