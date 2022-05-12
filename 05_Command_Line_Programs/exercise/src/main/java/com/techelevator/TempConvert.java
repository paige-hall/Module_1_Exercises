package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		{

			Scanner input = new Scanner(System.in);

			System.out.println("Please enter 'F' for Fahrenheit or 'C' for Celsius:");
			String userDegrees = input.nextLine();

			System.out.println("Enter a temperature: ");
			int userTemperature = Integer.parseInt(input.nextLine());

			if (userDegrees.equals("F"))
				fahrenheitToCelsius(userTemperature, userDegrees);

			if (userDegrees.equals("C"))
				celsiusToFahrenheit(userTemperature, userDegrees);

		}
	}

	public static double celsiusToFahrenheit(double userTemperature, String userDegrees) {
		double tempInF = userTemperature * 1.8 + 32;
		System.out.println(userTemperature + userDegrees + " is " + tempInF + "F.");
		return tempInF;
	}

	public static double fahrenheitToCelsius(double userTemperature, String userDegrees) {
		double tempInC = (userTemperature - 32) / 1.8;
		System.out.println(userTemperature + userDegrees + " is " + tempInC + "C.");
		return tempInC;
	}

}
