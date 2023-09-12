package com.java;

public class LaunchString {

	public static void main(String[] args)
	{
		String str="Lathaprasanna";
	System.out.println(str.charAt(2));
	System.out.println(str.toLowerCase());
	System.out.println(str.indent(3));
	char ch[]=str.toCharArray();
	for(char c:ch)
	{
		System .out .println(c);
	}
	String s[]=str.split("a");
	for(String st:s)
	{
		System.out.print(st);
	}
}
}