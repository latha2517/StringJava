package com.java;

import java.util.ArrayList;
interface Hope
{
	default void hope() 
	{
		System.out.println("Hope in Lord");
	}
}
public class Launchinn1 {

	public static void main(String[] args)
	{
		ArrayList<Integer>nums=new ArrayList<Integer>();
nums.add(3);
nums.add(4);
nums.add(4);
nums.add(9);
System.out.println(nums);
//nums=nums->System.out.println(nums);
	for(int nu:nums);
	{
		System.out.println(nums);
		nums.forEach(nu->System.out.println(nums));
	}
	}
}

