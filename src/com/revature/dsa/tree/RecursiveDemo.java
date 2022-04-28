package com.revature.dsa.tree;

public class RecursiveDemo {
	
	private static void counter(int number) {
		if (number > 5) return;
		System.out.println(number);
		number++;
		counter(number);
	}

	public static void main(String[] args) {
		counter(1);
	}

}
