package com.anees;

@FunctionalInterface
interface LESCheckInterface{
	boolean StringCheck(String str);
}



public class LESCheck {

	public static void main(String[] args) {
		LESCheckInterface obj = str -> str.length()==0;
		System.out.println(obj.StringCheck(""));
		

	}

}
