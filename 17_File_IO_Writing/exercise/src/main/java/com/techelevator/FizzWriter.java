package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//get user input: destination file
		System.out.println("Enter the destination file: ");
		String filePath = input.nextLine();
		System.out.println("Destination file: " + filePath);

		File outputFile = new File(filePath);

		if (outputFile.exists()){
			System.out.println(outputFile.getName() + " will overwrite");
		}

		String fileOutput = "";

		try (PrintWriter writer = new PrintWriter(outputFile)){
			for (int i = 1; i <= 300; i++) {
				if (i % 3 == 0 && i % 5 == 0){
					fileOutput = "FizzBuzz";
				} else if (i % 3 == 0) {
					fileOutput = "Fizz";
				} else if ((i % 5 == 0)){
					fileOutput = "Buzz";
				}else{
					fileOutput = Integer.toString(i);
				}
				writer.println(fileOutput);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}


	}
}


