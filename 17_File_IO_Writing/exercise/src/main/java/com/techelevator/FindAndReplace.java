package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FindAndReplace {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        //get user input- word to be searched
        System.out.println("Enter the word to be searched: ");
        String searchWord = userInput.nextLine();

        //get user input - word to replace with
        System.out.println("Enter the replacement word: ");
        String replacementWord = userInput.nextLine();

        //get user input- source file
        System.out.println("Enter the source file: ");
        String sourceFilePath = userInput.nextLine();

        //get user input- destination file
        System.out.println("What is the destination file?");
        String destinationFilePath = userInput.nextLine();

        //new book file and converted file
        File originalFile = new File(sourceFilePath);
        File convertedFile = new File (destinationFilePath);

        //open the original and converted files

        try (Scanner fileInput = new Scanner(originalFile);
             PrintWriter fileOutput = new PrintWriter(convertedFile)) {

            //While there's input from the source file
            while(fileInput.hasNextLine()){
                //make a string for the current line of text
                String lineOfText = fileInput.nextLine();


                //lineOfText.replace(searchWord, replacementWord);
                fileOutput.println(lineOfText.replace(searchWord, replacementWord));

            }

            //if there is a file error, do this
        } catch (FileNotFoundException e) {
            // Could not find the file at the specified path.
            System.out.println("The file was not found: " + originalFile.getAbsolutePath());
            return;
        }

    }

}
