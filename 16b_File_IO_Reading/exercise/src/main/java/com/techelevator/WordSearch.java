package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class WordSearch {

    public static void main(String[] args) {

        int lineNumber = 1;
        boolean isCaseSensitive = true;
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter the path of the file to be searched: ");
        String filePath = userInput.nextLine();
        File fileInput = new File(filePath);

        System.out.println("Please enter the word you would like to search: ");
        String wordToSearch = userInput.nextLine();
        System.out.println("Please enter 'y' for case-sensitive and 'n' for case-insensitive search: ");
        String caseSensitive = userInput.nextLine();

        try (Scanner dataInput = new Scanner(fileInput)) {
            while (dataInput.hasNextLine()) {
                String lineOfText = dataInput.nextLine();
                String[] wordArr = lineOfText.split(" ");
                for (String words : wordArr) {
                    if (caseSensitive.equalsIgnoreCase("n")) {
                        if (words.equalsIgnoreCase(wordToSearch)) {
                            System.out.println(lineNumber + ": " + lineOfText);
                        }
                    }
                    if (caseSensitive.equalsIgnoreCase("y")) {
                        if (words.contains(wordToSearch))
                            System.out.println(lineNumber + ": " + lineOfText);
                    }
                }
                lineNumber++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("The file was not found: " + fileInput.getAbsolutePath());
        }
    }
}


