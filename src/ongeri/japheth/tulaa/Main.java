package ongeri.japheth.tulaa;

import java.util.Scanner;

/**
 * Aim is to reverse a string of case insensitive alphabetic characters embedded with other characters in such a way
 * that non alphabetic chars are not affected
 */
public class Main {

    public static void main(String[] args) {
        StringReverser stringReverser = new StringReverser();
        String toBeReversed;
        String reversedString;
        Scanner sc = new Scanner(System.in);
        //Prompt for input
        System.out.println("Enter the string to be reversed");
        // Get input
        toBeReversed = sc.next();
        //Pass string to reverser and get reversed string output
        reversedString = stringReverser.reverseString(toBeReversed);

        System.out.println("The reversal result is: ");
        System.out.println(reversedString);
    }
}
