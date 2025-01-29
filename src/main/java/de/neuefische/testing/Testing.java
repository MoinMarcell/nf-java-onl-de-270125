package de.neuefische.testing;

public class Testing {

	public static void main(String[] args) {
		System.out.println(add(1, 2));
	}

	public static int add(int a, int b){
		return a + b;
	}

	public static boolean isEven(int n){
		return n % 2 == 0;
	}

	public static int product(int a, int b){
		return a * b;
	}

	public static String toUpperCase(String s){
		return s.toUpperCase();
	}

	public static boolean isPositive(int n){
		return n > 0;
	}

}
