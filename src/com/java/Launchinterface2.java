package com.java;
interface Harsh
{
	default void show() {
		System.out.println("in show Harsh");
	
	}
}
interface Uday
{
	default void show() {
		System.out.println("in show Uday");
		
	}
}
class Latha implements Harsh,Uday
{
public void show()
{
	Harsh.super.show();
}
}
public class Launchinterface2 {

	public static void main(String[] args) {
		Uday l=new Latha();
		l.show();

	}

}
