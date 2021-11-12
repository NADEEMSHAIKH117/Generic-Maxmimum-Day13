package com.bridgeLabz;

public class Maximum_Integer {
	
	public static Integer findMaximum(Integer a, Integer b, Integer c) {
		Integer max = a;
		if (b.compareTo(a)>0 && b.compareTo(2)>0) {
			max =b;
		} if (c.compareTo(max)>0) {
			max=c;
		}
		System.out.println(max);
		return max;
	}

	public static void main(String[] args) {
		System.out.println("Welcome Generics Maximum Program");
		Maximum_Integer.findMaximum(9,4,6);

	}

}
