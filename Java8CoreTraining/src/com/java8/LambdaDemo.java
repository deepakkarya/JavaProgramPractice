package com.java8;

interface A{
	//void show();
	void add(int i,int j);
}

public class LambdaDemo {

	public static void main(String[] args) {
		
		A obj;
		obj=(i,j)->System.out.println("Sum: "+(i+j));
		obj.add(4,5);

	}

}
