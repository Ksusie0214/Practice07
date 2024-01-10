package com.javaex.ex03;

public class SoundApp {

    public static void main(String[] args) {
        printSound( new Cat() );
        printSound( new Dog() );
        printSound( new Sparrow() );
        printSound( new Duck() );
    }

    public static void printSound( Soundable soundable ) {
        //구현
    	
    	Soundable[] sArray = new Soundable[4];
    	
    	Soundable s01 = new Sparrow();
    	Soundable s02 = new Duck();
    	Soundable s03 = new Dog();
    	Soundable s04 = new Cat();
    	
    	sArray[0] = s01;
    	sArray[1] = s02;
    	sArray[2] = s03;
    	sArray[3] = s04;
    	
    	for(int i = 0; i<sArray.length; i++) {
    		System.out.println(sArray[i].sound());
    	}
    	
    	
    }
    
}


