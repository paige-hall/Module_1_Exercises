package com.techelevator;

import java.sql.SQLOutput;

/**
 * Bookstore
 */
public class Bookstore {

    public static void main(String[] args) {

        System.out.println("Welcome to the Tech Elevator Bookstore");
        System.out.println();

        // Step Three: Test the getters and setters
        Book twoCities = new Book("A Tale of Two Cities", "Charles Dickens", 14.99);
        twoCities.setTitle("A Tale of Two Cities");
        twoCities.setAuthor("Charles Dickens");
        twoCities.setPrice(14.99);
        System.out.println("Title: " + twoCities.getTitle() + ", Author: " + twoCities.getAuthor() + ", Price: " + twoCities.getPrice());


        // Step Five: Test the Book constructor
        Book threeMusketeers = new Book("The Three Musketeers", "Alexandre Dumas", 12.95);
        Book childhoodEnd = new Book("Childhood's End", "Arthur C. Clark", 5.99 );
        System.out.println(threeMusketeers.bookInfo());
        System.out.println(childhoodEnd.bookInfo());

        // Step Nine: Test the ShoppingCart class
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(twoCities);
        shoppingCart.add(threeMusketeers);
        shoppingCart.add(childhoodEnd);
        System.out.println(shoppingCart.receipt());
    }
    }
