//Reverse a Number Reverse the digits of a number using only a for loop.

package com.Forloop;

public class Reversenum {

	public static void main(String[] args) {

		int a = 155;
		int revnum = 0;

		for (; a > 0; a /= 10) {
			int digit = a % 10;
			revnum = revnum * 10 + digit;
		}

		System.out.println("Reversed Number: " + revnum);
	}

}
