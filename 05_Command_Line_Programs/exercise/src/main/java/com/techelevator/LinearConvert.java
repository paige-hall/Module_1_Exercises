package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a length: ");
		int userLength = Integer.parseInt(input.nextLine());

		System.out.println("Please enter 'm' for meters or 'f' for feet: ");
		String userMeasurement = input.nextLine();

		if (userMeasurement.equals("f"))
			feetToMeters(userLength, userMeasurement);

		if(userMeasurement.equals("m"))
			metersToFeet(userLength, userMeasurement);

	}

	public static double feetToMeters(double userLength, String userMeasurement) {
		double meters = userLength * 0.3048;
		System.out.println(userLength + userMeasurement + " is " + meters + "m.");
		return meters;
	}

	public static double metersToFeet(double userLength, String userMeasurement) {
		double feet = userLength * 3.2808399;
		System.out.println(userLength + userMeasurement + " is " + feet + "f.");
		return feet;
	}

}
