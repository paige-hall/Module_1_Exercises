package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter in a series of decimal values (separated by spaces): ");

        String decimalInput = input.nextLine();
        String[] numbersEntered = decimalInput.split(" ");
        int[] finalDecimal = new int[numbersEntered.length];

        for (int i = 0; i < numbersEntered.length; i++) {
            finalDecimal[i] = Integer.parseInt(numbersEntered[i]);
            String binaryNumber = Integer.toBinaryString(finalDecimal[i]);
            System.out.println(finalDecimal[i] + " in binary is " + binaryNumber);
        }


    }

}


