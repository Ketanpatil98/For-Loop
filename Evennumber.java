//Print Even Numbers from 2 to 100 Print all even numbers from 2 to 100 using only a for loop.

package com.Forloop;

public class Evennumber {

	public static void main(String[] args) {

		int num;

		for (num = 1; num <= 100; num++) {
			if (num % 2 ==0) {
				System.out.println("The Given Numbers Are Even " + num);
			} 
		}

	}
}
