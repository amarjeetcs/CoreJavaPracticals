package com.basic.code;

public class Variables {
	int x=10;
	//inside class and outside main method called instance
	static String s="Neha";
	//inside the class and outside the main method with the help of static keyword
	
	

	public static void main(String[] args) {
		Variables v=new Variables();
		System.out.println(v.x);
		System.out.println(s);
		System.out.println(Variables.s);
		Variables v1=new Variables();
		System.out.println(v1.s);
		String s1="Lalit";
		System.out.println(s1);
		
		
		
		
		

	}

}
