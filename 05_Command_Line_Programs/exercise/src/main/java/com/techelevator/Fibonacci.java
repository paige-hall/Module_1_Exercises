package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int numberEntered = input.nextInt();

		if(numberEntered <= 0)
			System.out.println("0, 1");

		if(numberEntered == 1)
			System.out.println("0, 1, 1");

		int firstFibonacci = 1;
		int fibonacci = 1;

		System.out.print("0, 1, 1, ");
		for(int i = 1; i + firstFibonacci <= numberEntered;){
			fibonacci = i + firstFibonacci;
			i = firstFibonacci;
			firstFibonacci = fibonacci;
			System.out.print( fibonacci + ", ");

		}




	}


}
