package com.basic.code;

public class StringDemo {
	
	
	public static void main(String[] args) {

    String str=new String("Lalit");
    String str1=new String("Amarjeet");
    
    String str2="Lalit";
    String str3="Amarjeet";
    String str444="Porn video dekho ";
    
    String str4="Lalit";
    String str5="amarjeet";
    String str6=new String("Lalit");
    
    System.out.println(str==str1);
    System.out.println(str2==str4);
    System.out.println(str3==str5);
    System.out.println(str==str6);
    System.out.println(str4==str6);
    System.out.println(str1==str5);
    
    System.out.println(str.equals(str6));
    System.out.println(str1.equals(str5));
		
		
	}

}
